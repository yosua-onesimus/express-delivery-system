package controller.zul.eds3;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultListCtrl;
import model.obj.eds3.EdsConsignmentNotesItem;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulConsignmentNotesItemListCtrl extends ZulDefaultListCtrl {

    @Override
    protected Class _getEntity() {
        return EdsConsignmentNotesItem.class;
    }
}