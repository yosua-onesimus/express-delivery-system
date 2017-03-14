package controller.misc.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.zk.CCEditor;
import org.zkoss.zul.Cell;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Panel;
import org.zkoss.zul.Panelchildren;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Window;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class PanelNewEntity {

    public static String[] BLANK = new String[]{};

    public static Cell newCell(Row rowTarget) {
        Rows rows = (Rows) rowTarget.getParent();
        Row row = new Row();
        Cell cell = new Cell();
        cell.setColspan(2);
        cell.setParent(row);
        rows.getChildren().add(rowTarget.getIndex() + 1, row);
        return cell;
    }

    public static CCEditor newEditor(Class entity, String[] invisibleFields) {
        Grid grid = new Grid();
        CCEditor editor = new CCEditor(grid, entity);
        editor.generateDefaultEditor(grid, invisibleFields);
        return editor;
    }

    public static void init(Cell cell, boolean open, String title, CCEditor... editors) {
        Panel panel = new Panel();
        panel.setCollapsible(true);
        panel.setOpen(open);
        panel.setTitle(title);
        Panelchildren panelchildren = new Panelchildren();
        for (CCEditor editor : editors) {
            Window window = new Window();
            editor.getAfterMount().compile().setParent(window);
            editor.getContainer().setParent(window);
            window.setParent(panelchildren);
        }
        panelchildren.setParent(panel);
        panel.setParent(cell);
    }
}