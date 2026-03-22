# EECS 3311 Software Design: YorkU Lab Equipment Reservation System

**GitHub:** https://github.com/nurjahan-shiah/Software-Design
---

## Repository Structure

```
Software-Design/
├── D1/       ← Deliverable 1: UML design documents (no runnable code)
└── D2/       ← Deliverable 2: Full Java Swing implementation (runnable)
```

---

## Deliverable 1: UML Design Documents (`D1/`)

D1 contains all design documentation produced before implementation began. 

### Contents

```
D1/
├── EECS 3311_Deliverable 1.pdf     # Full D1 report with written justification
├── class diagram.jpeg              # System-wide class diagram
├── Activity Diagram.pdf            # Activity diagrams for key use cases
├── UseCaseDiagram/
│   ├── usecase1.png                # Register & Login (Req1)
│   ├── usecase2.png                # Equipment reservation (Req3–Req9)
│   └── usecase3.png                # Payment & Coordinator (Req2, Req10)
└── Sequence Diagram/
    ├── Sequence1.png / .drawio     # Login & registration flow
    ├── Sequence2.png / .drawio     # Equipment reservation flow
    └── sequence3.png / .drawio     # Equipment status change & notification
```

### Viewing D1 Diagrams

- Open `.png` files directly in any image viewer or click them on GitHub
- Open `.drawio` files at [draw.io](https://app.diagrams.net/) (free, browser-based) to view or edit
- The full D1 report PDF contains all diagrams with written justification

---

## Deliverable 2: Java Implementation (`D2/`)

A Java Swing desktop application for managing lab equipment reservations at York University. Users can browse equipment, make reservations, and process payments. Managers control equipment status and approve user accounts. The Head Lab Coordinator generates manager accounts. All data is persisted to CSV files using `javacsv.jar`.

The system is built around **seven applications of six design patterns** (Factory, Singleton ×2, Observer, Strategy, State, Command) mapped directly to the ten system requirements (Req1 - Req10).

---

## Setup & Run (D2)

### Prerequisites

| Requirement | Version | How to check |
|---|---|---|
| Java JDK | 11 or higher | `java -version` in terminal |
| Git | any | `git --version` in terminal |
| IDE | optional — VS Code + Extension Pack for Java | — |

No Maven, Gradle, or build tool required, just `javac` and the one jar in `lib/`.

---

### Step 1: Clone the repository

```bash
git clone https://github.com/nurjahan-shiah/Software-Design.git
cd Software-Design
```

---

### Step 2: Navigate into D2

```cmd
cd D2
```

> **Important:** every compile and run command must be executed from inside `D2/`. The CSV paths are relative (`data/users.csv`, etc.) and will not resolve from any parent directory. If you get a file-not-found error at runtime, this is why.

Confirm you are in the right place, you should see `src/`, `data/`, and `lib/` listed:

```
dir          ← Windows
ls           ← macOS / Linux
```

---

### Step 3: Create the output directory

```cmd
mkdir out
```

---

### Step 4: Compile

**Windows: Command Prompt:**
```cmd
javac -cp lib\javacsv.jar -d out src\data\*.java src\model\*.java src\pattern\command\*.java src\pattern\factory\*.java src\pattern\observer\*.java src\pattern\singleton\*.java src\pattern\state\*.java src\pattern\strategy\*.java src\gui\*.java
```

**Windows: PowerShell:**
```powershell
javac -cp lib/javacsv.jar -d out (Get-ChildItem -Recurse src -Filter "*.java" | Select-Object -ExpandProperty FullName)
```

**macOS / Linux:**
```bash
find src -name "*.java" | xargs javac -cp lib/javacsv.jar -d out
```

If the command produces no output, the build succeeded. Any errors almost always mean you are not inside `D2/` or Java is not installed correctly.

---

### Step 5: Run

**Windows: Command Prompt:**
```cmd
java -cp "out;lib\javacsv.jar" gui.MainFrame
```

**Windows: PowerShell:**
```powershell
java -cp "out;lib/javacsv.jar" gui.MainFrame
```

**macOS / Linux:**
```bash
java -cp "out:lib/javacsv.jar" gui.MainFrame
```

The login window will open. Use any of the test accounts below.

---

### VS Code Setup (optional)

If you prefer developing in VS Code rather than the terminal:

1. Install the **Extension Pack for Java** from the VS Code marketplace
2. Open the `D2/` folder in VS Code: `File → Open Folder → select D2` (not the repo root, not `src/`)
3. Confirm `D2/.vscode/settings.json` contains:

```json
{
  "java.project.referencedLibraries": [
    "lib/javacsv.jar"
  ],
  "java.project.sourcePaths": [
    "src"
  ]
}
```

4. If red squiggles appear on `com.csvreader` imports: `Ctrl+Shift+P` → **Java: Clean Java Language Server Workspace** → Restart
5. To run from VS Code: open `src/gui/MainFrame.java` and press `F5`, or click the Run button above the `main` method

> The red squiggles on CSV imports are a VS Code indexing issue only. The project compiles and runs correctly from the terminal regardless.

---

## Test Accounts (pre-seeded in `data/users.csv`)

| Email | Password | Role | Fee Rate |
|---|---|---|---|
| alice@yorku.ca | pass123 | Student | $10/hr |
| bob@yorku.ca | pass123 | Faculty | $15/hr |
| carol@yorku.ca | pass123 | Researcher | $20/hr |
| dave@example.com | pass123 | Guest | $30/hr |
| manager@yorku.ca | manager123 | Lab Manager | — |
| coord@yorku.ca | coord123 | Head Lab Coordinator | — |

New accounts registered through the app are saved back to `users.csv` automatically. Non-Guest accounts start with `PENDING` status and require manager approval before they can log in.

---

## Requirements Coverage

| Req | Description | Pattern(s) |
|-----|-------------|------------|
| Req1 | Register and login with role-based routing | Factory |
| Req2 | Head Coordinator auto-generates manager accounts | Singleton, Factory |
| Req3 | Browse and reserve equipment | Command, Singleton |
| Req4 | Deposit paid; forfeited if user is >20 min late | Command |
| Req5 | Track equipment usage via simulated sensor notifications | Observer |
| Req6 | Add, enable, disable, or set equipment to maintenance | State, Observer |
| Req7 | Assign equipment ID, description, and location | State (EquipmentContext) |
| Req8 | Provide booking ID to modify or cancel a reservation | Command |
| Req9 | Extend reservation if equipment is still free | Command, Singleton |
| Req10 | Support credit card, debit, institutional, and grant payments | Strategy |

---

## Design Patterns

### 1. Factory: `pattern/factory/`
**Classes:** `UserFactory`, `User` (abstract), `Student`, `Faculty`, `Researcher`, `Guest`, `LabManager`, `HeadLabCoordinator`

`UserFactory.getUserType(String)` centralizes all user object creation. `LoginPanel` and `UserDAO` both call the factory instead of instantiating subclasses directly. Each subclass overrides `getFeeRate()` to return its hourly rate ($10 / $15 / $20 / $30). Adding a new user type only requires a new subclass and one branch in `UserFactory`.

### 2. Singleton (BookingSystem): `pattern/singleton/BookingSystem.java`
**Classes:** `BookingSystem`, `Reservation`

Eager singleton: the single instance is created at class load time. All panels share one booking registry through `BookingSystem.getInstance()`, ensuring conflict checks and cancellations always operate on the complete list.

### 3. Singleton (HeadLabCoordinatorSingleton): `pattern/singleton/HeadLabCoordinatorSingleton.java`
**Classes:** `HeadLabCoordinatorSingleton`, `LabManager`

Lazy singleton: enforces the Req2 business rule that exactly one Head Lab Coordinator exists. `generateManagerAccount()` is the only entry point for creating `LabManager` objects, so the constraint is enforced at the design level, not just in the GUI.

### 4. Observer: `pattern/observer/`
**Classes:** `Observer` (base marker), `EquipmentObserver`, `EquipmentSubject`, `EquipmentContext`, `UserNotificationObserver`

`EquipmentContext` implements `EquipmentSubject` and maintains an observer list. When `setState()` fires (triggered by `enable()`, `disable()`, or `markUnderMaintenance()`), it automatically calls `notifyObservers()`. `UserNotificationObserver` generates a notification message for every user with an active booking on that equipment.

**Key design decision:** State and Observer are co-hosted in `EquipmentContext` because a status transition always triggers a notification — keeping both in one class eliminates the unnecessary indirection of a separate `NotificationService` class.

### 5. Strategy: `pattern/strategy/`
**Classes:** `PaymentStrategy`, `CreditCardPayment`, `DebitPayment`, `InstitutionalPayment`, `GrantPayment`, `PaymentProcessor`

`PaymentStrategy` is an interface with a single `pay(PaymentTransaction)` method. `PaymentProcessor` holds any strategy and delegates to it. `UserDashboardPanel` selects the strategy from a dropdown. Adding a new payment method requires only a new class — no existing code changes.

### 6. State: `pattern/state/`
**Classes:** `EquipmentState`, `EquipmentContext`, `AvailableState`, `DisabledState`, `MaintenanceState`

Each state class defines valid transitions from that state. `EquipmentContext` delegates all status-change calls to the current state object — the manager dashboard never checks the state directly, it just calls `context.enable()`, `context.disable()`, or `context.markUnderMaintenance()`.

### 7. Command: `pattern/command/`
**Classes:** `Command`, `ReservationService`, `ReserveCommand`, `CancelCommand`, `ModifyCommand`, `ExtendCommand`, `ForfeitDepositCommand`

`Command` is an interface with a single `execute()` method. Each booking operation is a concrete command holding a reference to `ReservationService` (the receiver). The GUI creates and executes commands directly — it never calls `ReservationService` methods directly.

---

## D2 Project Structure

```
D2/
├── src/
│   ├── gui/
│   │   ├── MainFrame.java                  # CardLayout host; routes login to dashboards
│   │   ├── LoginPanel.java                 # Register + login (Req1)
│   │   ├── UserDashboardPanel.java         # Browse, reserve, modify, cancel, extend, forfeit
│   │   ├── ManagerDashboardPanel.java      # Approve users, manage equipment, view bookings
│   │   ├── CoordinatorDashboardPanel.java  # Extends Manager; adds Generate Manager tab
│   │   └── UI.java                         # Shared York University styling constants
│   │
│   ├── model/
│   │   ├── User.java                       # Abstract base; declares getFeeRate()
│   │   ├── Student.java                    # $10/hr
│   │   ├── Faculty.java                    # $15/hr
│   │   ├── Researcher.java                 # $20/hr
│   │   ├── Guest.java                      # $30/hr
│   │   ├── LabManager.java                 # $0/hr; manages equipment
│   │   ├── HeadLabCoordinator.java         # $0/hr; generates manager accounts
│   │   ├── Equipment.java                  # ID, name, description, type, status, location
│   │   ├── Reservation.java                # bookingID, status, depositAmount, paymentMethod
│   │   ├── PaymentTransaction.java         # transactionID, amount, status
│   │   ├── Deposit.java                    # Deposit amount + forfeited flag
│   │   └── LabLocation.java                # buildingName + roomNumber
│   │
│   ├── data/
│   │   ├── UserDAO.java                    # Reads/writes users.csv; uses Factory internally
│   │   ├── EquipmentDAO.java               # Reads/writes equipment.csv
│   │   └── BookingDAO.java                 # Reads/writes bookings.csv
│   │
│   └── pattern/
│       ├── factory/
│       │   └── UserFactory.java
│       ├── singleton/
│       │   ├── BookingSystem.java
│       │   └── HeadLabCoordinatorSingleton.java
│       ├── observer/
│       │   ├── Observer.java               # Base marker interface (GoF root)
│       │   ├── EquipmentObserver.java      # extends Observer
│       │   ├── EquipmentSubject.java
│       │   └── UserNotificationObserver.java
│       ├── state/
│       │   ├── EquipmentState.java
│       │   ├── EquipmentContext.java       # Also implements EquipmentSubject
│       │   ├── AvailableState.java
│       │   ├── DisabledState.java
│       │   └── MaintenanceState.java
│       ├── strategy/
│       │   ├── PaymentStrategy.java
│       │   ├── PaymentProcessor.java
│       │   ├── CreditCardPayment.java
│       │   ├── DebitPayment.java
│       │   ├── InstitutionalPayment.java
│       │   └── GrantPayment.java
│       └── command/
│           ├── Command.java
│           ├── ReservationService.java     # Command receiver
│           ├── ReserveCommand.java
│           ├── CancelCommand.java
│           ├── ModifyCommand.java
│           ├── ExtendCommand.java
│           └── ForfeitDepositCommand.java
│
├── data/
│   ├── users.csv          # Pre-seeded with 6 users across all roles
│   ├── equipment.csv      # 5 items: 3 available, 1 maintenance, 1 disabled
│   └── bookings.csv       # 2 confirmed bookings for demo
│
├── lib/
│   └── javacsv.jar        # Third-party CSV read/write library
│
├── Class-Diagrams/        # Sub-diagram image for each pattern application
│   ├── Factory_Pattern.jpg
│   ├── Booking_System_Singleton.jpg
│   ├── HeadLabCoordinator.jpg
│   ├── Observer_pattern.jpg
│   ├── Strategy_pattern.jpg
│   ├── State_pattern.jpg
│   └── Command_Pattern.jpg
│
├── Component_Diagram.png
└── .vscode/
    └── settings.json      # Java classpath config for VS Code
```

---

## Feature Walkthrough

### As a Student / Faculty / Researcher / Guest
1. **Login** with any test account, or register a new one - non-Guest accounts start as PENDING and need manager approval before they can log in
2. **Browse & Reserve tab** : select equipment from the table, enter start/end time, choose a payment method, click Reserve
3. **My Bookings tab:**
   - **Cancel** a confirmed booking (Req8)
   - **Modify** : enter new start and end times, click Modify Booking (Req8)
   - **Extend** : enter a new end time, click Extend Reservation (Req9)
   - **Simulate No-Show** : forfeit the deposit on a confirmed booking (Req4)

### As a Lab Manager
1. **Pending Approvals** : approve or reject newly registered users (Req1)
2. **Equipment tab** : select equipment, click Enable / Disable / Maintenance (Req6). Users with active bookings on that equipment are notified automatically via Observer; the count appears in the status bar (Req5)
3. **Add Equipment** : add new equipment with ID, description, building, and room number (Req7)
4. **All Bookings** : view the full reservation history across all users (Req5)

### As the Head Lab Coordinator
All Manager features, plus:
- **All Users** : view, approve, or reject any account system-wide
- **Generate Manager** : create a new Lab Manager account (Req2); calls `HeadLabCoordinatorSingleton.getInstance().generateManagerAccount(...)` and saves to `users.csv`

---

## Architecture

The system uses a strict 5-layer architecture with one-way dependencies. No layer imports from a layer above it.

```
GUI Layer        gui/
      ↓          Swing panels — input and display only
Pattern Layer    pattern/
      ↓          All design pattern classes — business logic
Model Layer      model/
      ↓          Plain Java objects — no external dependencies
DAO Layer        data/
      ↓          CSV read/write via javacsv.jar
CSV Storage      data/*.csv
```
---

D2 Contribution Table: [Code contribution can be found under the Contribution tab in GitHub]
| Member | Contributions |
|---|---|
| Nurjahan Ahmed Shiah | D2 project structure (Models + CSV layer (model/, data/): User, Equipment, Reservation + all CSV read/write), GUI ×3, project setup, README, D2(1a[Justification for the Six Design Patterns], 1d[Component Diagram])|
| David Ekeng | Implement UserFactory, Add & Clean up BookingSystem, Added all the Class diagrams (1b) |
| Iyinoluwa Olu-Alabi | Implemented state pattern, command and strategy patterns ×2, strengthened/improved implementations |
| Joseph Ajeigbe | Creating Observer.java, Documenting AI support into the report |
| Jessica Buentipo | D2 (1c & 1e) |
