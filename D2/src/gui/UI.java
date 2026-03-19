package gui;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class UI {
    public static final Color YORKU_RED   = new Color(0xe3, 0x18, 0x37);
    public static final Color YORKU_DARK  = new Color(0xb8, 0x10, 0x2a);
    public static final Color BG          = new Color(0xf5, 0xf6, 0xf8);
    public static final Color CARD        = Color.WHITE;
    public static final Color NAV_BG      = new Color(0x1a, 0x1a, 0x2e);
    public static final Color NAV_FG      = new Color(0xe8, 0xe8, 0xf0);
    public static final Color HEADER_BG   = new Color(0xf8, 0xf9, 0xfa);
    public static final Color BORDER      = new Color(0xd8, 0xda, 0xde);
    public static final Color ROW_ALT     = new Color(0xfa, 0xfb, 0xfc);
    public static final Color ROW_SEL_BG  = new Color(0xfb, 0xe9, 0xec);
    public static final Color ROW_SEL_FG  = new Color(0x8c, 0x0b, 0x1e);
    public static final Color TEXT        = new Color(0x1a, 0x1a, 0x2e);
    public static final Color TEXT_MUTED  = new Color(0x6c, 0x75, 0x7d);
    public static final Color SUCCESS     = new Color(0x19, 0x87, 0x54);
    public static final Color DANGER      = new Color(0xdc, 0x35, 0x45);
    public static final Color WARNING     = new Color(0xd9, 0x73, 0x06);
    public static final Color INFO        = new Color(0x0d, 0x6e, 0xfd);
    public static final Color SECONDARY   = new Color(0x6c, 0x75, 0x7d);

    public static final Font F_TITLE  = new Font("Segoe UI", Font.BOLD, 22);
    public static final Font F_HEAD   = new Font("Segoe UI", Font.BOLD, 16);
    public static final Font F_SUB    = new Font("Segoe UI", Font.BOLD, 13);
    public static final Font F_BODY   = new Font("Segoe UI", Font.PLAIN, 13);
    public static final Font F_SMALL  = new Font("Segoe UI", Font.PLAIN, 11);
    public static final Font F_LABEL  = new Font("Segoe UI", Font.BOLD, 11);

    public static JButton button(String text, Color bg) {
        Color hover = bg.darker();
        JButton b = new JButton(text);
        b.setFont(F_SUB); b.setForeground(Color.WHITE); b.setBackground(bg);
        b.setOpaque(true); b.setBorderPainted(false); b.setFocusPainted(false);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));
        b.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) { b.setBackground(hover); }
            public void mouseExited(MouseEvent e)  { b.setBackground(bg); }
        });
        return b;
    }

    public static JButton primary(String t)   { return button(t, YORKU_RED); }
    public static JButton secondary(String t) { return button(t, SECONDARY); }
    public static JButton success(String t)   { return button(t, SUCCESS); }
    public static JButton danger(String t)    { return button(t, DANGER); }
    public static JButton warning(String t)   { return button(t, WARNING); }
    public static JButton info(String t)      { return button(t, INFO); }

    public static JTextField field(String placeholder) {
        JTextField f = new JTextField(placeholder);
        styleInput(f); return f;
    }
    public static JPasswordField password() {
        JPasswordField f = new JPasswordField();
        styleInput(f); return f;
    }
    public static JComboBox<String> combo(String... items) {
        JComboBox<String> c = new JComboBox<>(items);
        c.setFont(F_BODY); c.setBackground(CARD);
        c.setBorder(inputBorder());
        c.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));
        c.setAlignmentX(Component.LEFT_ALIGNMENT);
        return c;
    }
    private static void styleInput(JTextField f) {
        f.setFont(F_BODY); f.setBackground(CARD);
        f.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));
        f.setAlignmentX(Component.LEFT_ALIGNMENT);
        f.setBorder(inputBorder());
        f.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                f.setBorder(BorderFactory.createCompoundBorder(
                    new LineBorder(YORKU_RED, 2, true),
                    BorderFactory.createEmptyBorder(5, 9, 5, 9)));
            }
            public void focusLost(FocusEvent e) { f.setBorder(inputBorder()); }
        });
    }
    private static Border inputBorder() {
        return BorderFactory.createCompoundBorder(
            new LineBorder(BORDER, 1, true),
            BorderFactory.createEmptyBorder(6, 10, 6, 10));
    }

    public static JLabel heading(String t) {
        JLabel l = new JLabel(t); l.setFont(F_HEAD); l.setForeground(TEXT); return l;
    }
    public static JLabel label(String t) {
        JLabel l = new JLabel(t); l.setFont(F_LABEL); l.setForeground(TEXT_MUTED);
        l.setAlignmentX(Component.LEFT_ALIGNMENT);
        l.setBorder(BorderFactory.createEmptyBorder(0,0,2,0)); return l;
    }

    public static JPanel navBar(String appTitle, String userInfo, JButton... actions) {
        JPanel bar = new JPanel(new BorderLayout());
        bar.setBackground(NAV_BG);
        bar.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, YORKU_RED));
        JPanel left = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        left.setBackground(NAV_BG);
        JLabel badge = new JLabel("  Y  ");
        badge.setFont(new Font("Segoe UI", Font.BOLD, 14));
        badge.setForeground(Color.WHITE); badge.setBackground(YORKU_RED); badge.setOpaque(true);
        badge.setBorder(BorderFactory.createEmptyBorder(10,12,10,12));
        left.add(badge);
        JLabel title = new JLabel("  " + appTitle);
        title.setFont(F_HEAD); title.setForeground(NAV_FG);
        left.add(title);
        JLabel info = new JLabel(userInfo);
        info.setFont(F_SMALL); info.setForeground(new Color(0xa0,0xa8,0xb8));
        info.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 8, 8));
        right.setBackground(NAV_BG);
        for (JButton a : actions) right.add(a);
        bar.add(left, BorderLayout.WEST);
        bar.add(info, BorderLayout.CENTER);
        bar.add(right, BorderLayout.EAST);
        return bar;
    }

    public static JPanel card(String title) {
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBackground(CARD);
        if (title != null) {
            JLabel h = new JLabel(title); h.setFont(F_HEAD); h.setForeground(TEXT);
            h.setAlignmentX(Component.LEFT_ALIGNMENT);
            h.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
            p.add(h);
            JSeparator sep = new JSeparator();
            sep.setForeground(new Color(0xe3,0x18,0x37,60));
            sep.setMaximumSize(new Dimension(Integer.MAX_VALUE, 2));
            p.add(sep); p.add(Box.createVerticalStrut(14));
        }
        return p;
    }

    public static JLabel statusBar() {
        JLabel l = new JLabel("  Ready"); l.setFont(F_SMALL); l.setForeground(TEXT_MUTED);
        l.setBackground(HEADER_BG); l.setOpaque(true);
        l.setBorder(BorderFactory.createMatteBorder(1,0,0,0,BORDER));
        l.setPreferredSize(new Dimension(0, 28)); return l;
    }
    public static void setStatus(JLabel bar, String msg, boolean error) {
        bar.setText("  " + msg);
        bar.setForeground(error ? DANGER : SUCCESS);
    }

    public static DefaultTableModel tableModel(String... cols) {
        return new DefaultTableModel(cols, 0) {
            public boolean isCellEditable(int r, int c) { return false; }
        };
    }
    public static JTable styledTable(DefaultTableModel model) {
        JTable t = new JTable(model) {
            public Component prepareRenderer(TableCellRenderer r, int row, int col) {
                Component c = super.prepareRenderer(r, row, col);
                if (isRowSelected(row)) { c.setBackground(ROW_SEL_BG); c.setForeground(ROW_SEL_FG); }
                else { c.setBackground(row%2==0?CARD:ROW_ALT); c.setForeground(TEXT); }
                return c;
            }
        };
        t.setFont(F_BODY); t.setRowHeight(30); t.setShowVerticalLines(false);
        t.setShowHorizontalLines(true); t.setGridColor(new Color(0xee,0xee,0xf2));
        t.setIntercellSpacing(new Dimension(0,0));
        t.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        t.setFillsViewportHeight(true);
        JTableHeader hdr = t.getTableHeader();
        hdr.setFont(F_SUB); hdr.setForeground(TEXT_MUTED); hdr.setBackground(HEADER_BG);
        hdr.setBorder(BorderFactory.createMatteBorder(0,0,2,0,BORDER));
        hdr.setReorderingAllowed(false);
        hdr.setPreferredSize(new Dimension(hdr.getPreferredSize().width, 36));
        return t;
    }
    public static JScrollPane scroll(JTable t) {
        JScrollPane sp = new JScrollPane(t);
        sp.setBorder(BorderFactory.createLineBorder(BORDER));
        sp.getViewport().setBackground(CARD); return sp;
    }
    public static JTabbedPane tabs() {
        JTabbedPane tp = new JTabbedPane();
        tp.setFont(F_SUB); tp.setBackground(BG); tp.setBorder(null); return tp;
    }
    public static JTextField formField(JPanel form, String lbl) {
        form.add(label(lbl)); form.add(Box.createVerticalStrut(3));
        JTextField f = field(""); f.setMaximumSize(new Dimension(400,36)); form.add(f);
        form.add(Box.createVerticalStrut(12)); return f;
    }
    public static JPasswordField formPassword(JPanel form, String lbl) {
        form.add(label(lbl)); form.add(Box.createVerticalStrut(3));
        JPasswordField f = password(); f.setMaximumSize(new Dimension(400,36)); form.add(f);
        form.add(Box.createVerticalStrut(12)); return f;
    }
    public static JComboBox<String> formCombo(JPanel form, String lbl, String... items) {
        form.add(label(lbl)); form.add(Box.createVerticalStrut(3));
        JComboBox<String> c = combo(items); c.setMaximumSize(new Dimension(400,36)); form.add(c);
        form.add(Box.createVerticalStrut(12)); return c;
    }
    public static JPanel tabContent() {
        JPanel p = new JPanel(new BorderLayout(0,10));
        p.setBackground(BG); p.setBorder(BorderFactory.createEmptyBorder(14,14,14,14)); return p;
    }
    public static JPanel buttonRow(JButton... buttons) {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        row.setBackground(BG); row.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
        for (JButton b : buttons) row.add(b); return row;
    }
}
