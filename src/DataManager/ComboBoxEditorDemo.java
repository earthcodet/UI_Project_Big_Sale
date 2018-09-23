package DataManager;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class ComboBoxEditorDemo {

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("ComboBoxEditorDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(
                new Object[][] { { "1", "2" }, { "1", "2" } }, 
                new Object[] {"Col1", "Col2" });

        table.setRowHeight(24);

        TableColumn column = table.getColumnModel().getColumn(1);
        column.setCellRenderer(new MyComboBoxRenderer(new String[] { "1", "2", "3" }));
        column.setCellEditor(new MyComboBoxEditor(new String[] { "1", "2", "3" }));

        DefaultCellEditor editor = new DefaultCellEditor(new JTextField());
        editor.setClickCountToStart(1);
        column = table.getColumnModel().getColumn(0);
        column.setCellEditor(editor);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    static class MyComboBoxRenderer extends JComboBox implements
            TableCellRenderer {
        public MyComboBoxRenderer(String[] items) {
            super(items);
        }

        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row,
                int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                super.setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(table.getBackground());
            }

            setSelectedItem(value);
            return this;
        }
    }

    static class MyComboBoxEditor extends DefaultCellEditor {
        public MyComboBoxEditor(String[] items) {
            super(new JComboBox(items));
        }
    }
}