package data;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import model.Equipment;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * EquipmentDAO - loads and saves equipment from/to equipment.csv
 * CSV columns: equipmentID,name,description,type,status,buildingName,roomNumber
 */
public class EquipmentDAO {

    private String path;
    private List<Equipment> equipmentList = new ArrayList<>();

    public EquipmentDAO(String path) {
        this.path = path;
    }

    public void load() throws Exception {
        equipmentList.clear();
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            Equipment e = new Equipment();
            e.setEquipmentID(reader.get("equipmentID"));
            e.setName(reader.get("name"));
            e.setDescription(reader.get("description"));
            e.setType(reader.get("type"));
            e.setStatus(reader.get("status"));
            e.setBuildingName(reader.get("buildingName"));
            e.setRoomNumber(reader.get("roomNumber"));
            equipmentList.add(e);
        }
        reader.close();
    }

    public void save() throws Exception {
        CsvWriter writer = new CsvWriter(new FileWriter(path, false), ',');

        writer.write("equipmentID");
        writer.write("name");
        writer.write("description");
        writer.write("type");
        writer.write("status");
        writer.write("buildingName");
        writer.write("roomNumber");
        writer.endRecord();

        for (Equipment e : equipmentList) {
            writer.write(e.getEquipmentID());
            writer.write(e.getName());
            writer.write(e.getDescription());
            writer.write(e.getType());
            writer.write(e.getStatus());
            writer.write(e.getBuildingName());
            writer.write(e.getRoomNumber());
            writer.endRecord();
        }
        writer.close();
    }

    public void addEquipment(Equipment e) {
        equipmentList.add(e);
    }

    public Equipment findByID(String equipmentID) {
        for (Equipment e : equipmentList) {
            if (e.getEquipmentID().equals(equipmentID)) return e;
        }
        return null;
    }

    public List<Equipment> getAllEquipment() {
        return equipmentList;
    }

    public List<Equipment> getAvailableEquipment() {
        List<Equipment> available = new ArrayList<>();
        for (Equipment e : equipmentList) {
            if (e.isAvailable()) available.add(e);
        }
        return available;
    }

    public void updateEquipment(Equipment updated) {
        for (int i = 0; i < equipmentList.size(); i++) {
            if (equipmentList.get(i).getEquipmentID().equals(updated.getEquipmentID())) {
                equipmentList.set(i, updated);
                return;
            }
        }
    }
}
