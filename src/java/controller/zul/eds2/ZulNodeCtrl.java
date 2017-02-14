package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import static cococare.common.CCLogic.coalesce;
import static cococare.common.CCLogic.isNotNull;
import cococare.framework.zk.controller.zul.ZulDefaultCtrl;
import cococare.zk.CCBandbox;
import static cococare.zk.CCZk.addListener;
import controller.misc.eds.AreaListener;
import model.obj.eds2.EdsNode;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulNodeCtrl extends ZulDefaultCtrl {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private CCBandbox txtParentNode;
    private CCBandbox txtMainNode;
//</editor-fold>

    @Override
    protected void _initListener() {
        super._initListener();
        addListener(txtParentNode.getBandbox(), new EventListener() {
            @Override
            public void onEvent(Event event) throws Exception {
                EdsNode node = txtParentNode.getObject();
                if (isNotNull(node)) {
                    txtMainNode.setObject(coalesce(node.getMainNode(), node));
                } else {
                    txtMainNode.setObject(null);
                }
            }
        });
        AreaListener.init(getContainer());
    }
}