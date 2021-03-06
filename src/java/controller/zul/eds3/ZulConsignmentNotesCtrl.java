package controller.zul.eds3;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulConsignmentNotesCtrl extends ZulDefaultCtrl {

    @Override
    protected Class _getClass() {
        return ZulConsignmentNotesCtrl.class;
    }

    @Override
    protected void _initComponent() {
        super._initComponent();
        _addChildScreen("consignmentNotes", new ZulConsignmentNotesItemListCtrl(), "zulConsignmentNotesItemList");
    }
}