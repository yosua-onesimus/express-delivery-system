package model.mdl.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCLanguage;
import static cococare.framework.common.CFApplCtrl.APPL_CODE;
import cococare.framework.common.CFApplUae;
import cococare.framework.model.bo.util.UtilProvinceRegencyBo;
import cococare.framework.zk.CFZkMain;
import controller.zul.eds2.ZulCustomerListCtrl;
import controller.zul.eds2.ZulLinkListCtrl;
import controller.zul.eds2.ZulNodeListCtrl;
import controller.zul.eds3.ZulConsignmentNotesListCtrl;
import controller.zul.eds3.ZulPickUpListCtrl;
import static model.mdl.eds.EdsLanguage.*;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsMain extends CFZkMain {

    @Override
    protected void _loadInternalSetting() {
        APPL_ID = "express-delivery-system";
        APPL_CODE = "express-delivery-system";
        APPL_NAME = "express-delivery-system";
        super._loadInternalSetting();
    }

    @Override
    protected void _loadExternalSetting() {
        CCLanguage.init(false, EdsLanguage.class);
        super._loadExternalSetting();
    }

    @Override
    protected void _initDatabaseEntity() {
        super._initDatabaseEntity();
        EdsModule.INSTANCE.init(HIBERNATE);
    }

    @Override
    protected boolean _initInitialData() {
        return super._initInitialData() && new UtilProvinceRegencyBo().initInitialData();
    }

    @Override
    protected void _initInitialUaeBody(CFApplUae uae) {
        uae.reg(Eds, Node, ZulNodeListCtrl.class);
        uae.reg(Eds, Link, ZulLinkListCtrl.class);
        uae.reg(Eds, Customer, ZulCustomerListCtrl.class);
        uae.reg(Eds, Pick_Up, ZulPickUpListCtrl.class);
        uae.reg(Eds, Consignment_Notes, ZulConsignmentNotesListCtrl.class);
    }

    @Override
    protected void _applyUserConfigUaeBody(CFApplUae uae) {
        uae.addMenuParent(Archive, null, null);
        uae.addMenuChild(Node, null, ZulNodeListCtrl.class);
        uae.addMenuChild(Link, null, ZulLinkListCtrl.class);
        uae.addMenuChild(Customer, null, ZulCustomerListCtrl.class);
        uae.addMenuParent(Sales, null, null);
        uae.addMenuChild(Pick_Up, null, ZulPickUpListCtrl.class);
        uae.addMenuChild(Consignment_Notes, null, ZulConsignmentNotesListCtrl.class);
    }
}