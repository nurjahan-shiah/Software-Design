package gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class UI {
    public static final Color BG           = new Color(245, 247, 250);
    public static final Color CARD         = Color.WHITE;
    public static final Color ACCENT       = new Color(37, 99, 235);
    public static final Color ACCENT_DARK  = new Color(29, 78, 216);
    public static final Color SUCCESS      = new Color(22, 163, 74);
    public static final Color DANGER       = new Color(220, 38, 38);
    public static final Color WARNING      = new Color(234, 88, 12);
    public static final Color NAV_BG       = new Color(15, 23, 42);
    public static final Color TEXT         = new Color(17, 24, 39);
    public static final Color TEXT_MUTED   = new Color(107, 114, 128);
    public static final Color BORDER       = new Color(209, 213, 219);
    public static final Color ROW_ALT      = new Color(249, 250, 251);

    public static JButton button(String text, Color bg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("SansSerif", Font.BOLD, 12));
        btn.setForeground(Color.WHITE);
        btn.setBackground(bg);
        btn.setOpaque(true);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        Color hover = bg.darker();
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) { btn.setBackground(hover); }
            public void mouseExited(MouseEvent e)  { btn.setBackground(bg); }
        });
        return btn;
    }

    public static JTextField field(String placeholder) {
        JTextField f = new JTextField(placeholder);
        styleField(f);
        return f;
    }

    public static JPasswordField passwordField() {
        JPasswordField f = new JPasswordField();
        styleField(f);
        return f;
    }

    public static void styleField(JTextField f) {
        f.setFont(new Font("SansSerif", Font.PLAIN, 13));
        f.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));
        f.setAlignmentX(Component.LEFT_ALIGNMENT);
        f.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(BORDER, 1, true),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)
        ));
        f.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                f.setBorder(BorderFactory.createCompoundBorder(
                    new LineBorder(ACCENT, 2, true),
                    BorderFactory.createEmptyBorder(5, 9, 5, 9)));
            }
            public void focusLost(FocusEvent e) {
                f.setBorder(BorderFactory.createCompoundBorder(
                    new LineBorder(BORDER, 1, true),
                    BorderFactory.createEmptyBorder(6, 10, 6, 10)));
            }
        });
    }

    public static JLabel label(String text) {
        JLabel l = new JLabel(text);
        l.setFont(new Font("SansSerif", Font.BOLD, 11));
        l.setForeground(TEXT_MUTED);
        l.setAlignmentX(Component.LEFT_ALIGNMENT);
        l.setBorder(BorderFactory.createEmptyBorder(0, 0, 2, 0));
        return l;
    }

    public static JLabel heading(String text) {
        JLabel l = new JLabel(text);
        l.setFont(new Font("Georgia", Font.BOLD, 18));
        l.setForeground(TEXT);
        return l;
    }

    public static JPanel navBar(String title, String userInfo, JButton... actions) {
        JPanel bar = new JPanel(new BorderLayout());
        bar.setBackground(NAV_BG);
        bar.setBorder(BorderFactory.createEmptyBorder(10, 18, 10, 18));

        JLabel t = new JLabel(title);
        t.setFont(new Font("Georgia", Font.BOLD, 15));
        t.setForeground(Color.WHITE);

        JLabel u = new JLabel(userInfo);
        u.setFont(new Font("SansSerif", Font.PLAIN, 12));
        u.setForeground(new Color(148, 163, 184));

        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 0));
        right.setBackground(NAV_BG);
        for (JButton a : actions) right.add(a);

        bar.add(t, BorderLayout.WEST);
        bar.add(u, BorderLayout.CENTER);
        bar.add(right, BorderLayout.EAST);
        return bar;
    }

    public static JPanel card(String title) {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBackground(CARD);
        p.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(BORDER, 1, true),
            BorderFactory.createEmptyBorder(18, 22, 18, 22)
        ));
        if (title != null) {
            JLabel h = new JLabel(title);
            h.setFont(new Font("Georgia", Font.BOLD, 15));
            h.setForeground(TEXT);
            h.setAlignmentX(Component.LEFT_ALIGNMENT);
            p.add(h);
            p.add(Box.createVerticalStrut(12));
            JSeparator sep = new JSeparator();
            sep.setForeground(BORDER);
            sep.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
            p.add(sep);
            p.add(Box.createVerticalStrut(12));
        }
        return p;
    }

    public static JLabel statusBar() {
        JLabel l = new JLabel(" ", SwingConstants.CENTER);
        l.setFont(new Font("SansSerif", Font.PLAIN, 12));
        l.setForeground(TEXT_MUTED);
        l.setBackground(CARD);
        l.setOpaque(true);
        l.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, BORDER));
        l.setPreferredSize(new Dimension(0, 30));
        return l;
    }

    public static void setStatus(JLabel lbl, String msg, boolean error) {
        lbl.setText("  " + msg);
        lbl.setForeground(error ? DANGER : SUCCESS);
    }

    public static javax.swing.table.DefaultTableModel tableModel(String... cols) {
        return new javax.swing.table.DefaultTableModel(cols, 0) {
            public boolean isCellEditable(int r, int c) { return false; }
        };
    }

    public static JTable styledTable(javax.swing.table.DefaultTableModel model) {
        JTable t = new JTable(model);
        t.setRowHeight(28);
        t.setFont(new Font("SansSerif", Font.PLAIN, 12));
        t.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 12));
        t.getTableHeader().setBackground(new Color(243, 244, 246));
        t.setGridColor(BORDER);
        t.setSelectionBackground(new Color(219, 234, 254));
        t.setSelectionForeground(TEXT);
        t.setShowVerticalLines(false);
        t.setIntercellSpacing(new Dimension(0, 1));
        return t;
    }
}
