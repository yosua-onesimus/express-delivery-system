package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
import cococare.zk.CCBandbox;
import model.mdl.eds.EdsFilter.isNodeIsLinkNodeFrom;
import model.obj.eds2.EdsNode;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulRouteNodeCtrl extends ZulDefaultCtrl {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private EdsNode lastNode;
    private CCBandbox txtNode;
//</editor-fold>

    @Override
    protected void _initComponent() {
        super._initComponent();
        lastNode = (EdsNode) parameter.get(callerCtrl.toString() + "lastNode");
        txtNode.getTable().setHqlFilters(new isNodeIsLinkNodeFrom() {
            @Override
            public Object getFieldValue() {
                return lastNode;
            }
        });
    }
}