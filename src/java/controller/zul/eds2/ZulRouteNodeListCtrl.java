package controller.zul.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCAccessibleListener;
import cococare.framework.zk.controller.zul.ZulDefaultListCtrl;
import cococare.zk.CCBandbox;
import static cococare.zk.CCZk.addAccessibleListener;
import static cococare.zk.CCZk.setVisible;
import model.bo.eds.EdsRouteNodeBo;
import model.obj.eds2.EdsNode;
import model.obj.eds2.EdsRoute;
import model.obj.eds2.EdsRouteNode;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class ZulRouteNodeListCtrl extends ZulDefaultListCtrl {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private EdsRouteNodeBo routeNodeBo;
    private CCBandbox txtNodeFrom;
    private CCBandbox txtNodeTo;
//</editor-fold>

    @Override
    protected Class _getClass() {
        return _getDefaultToCustomClass();
    }

    @Override
    protected Class _getEntity() {
        return EdsRouteNode.class;
    }

    @Override
    protected void _initComponent() {
        super._initComponent();
        txtNodeFrom = (CCBandbox) parameter.get(toString() + "txtNodeFrom");
        txtNodeTo = (CCBandbox) parameter.get(toString() + "txtNodeTo");
        setVisible(false, zkView.getBtnEdit());
        if (_getParameterParentNewEntity(this)) {
            _getParameterChildsValue(this).add(_newObjEntity());
        }
    }

    @Override
    protected void _initNaviElements() {
        super._initNaviElements();
        addAccessibleListener(zkView.getBtnDelete(), new CCAccessibleListener() {
            @Override
            public boolean isAccessible() {
                return tblEntity.getSelectedRow() != 0
                        && tblEntity.getSelectedRow() == tblEntity.getLastRow();
            }
        });
    }

    @Override
    public void doUpdateTable() {
        super.doUpdateTable();
        if (!tblEntity.getList().isEmpty()) {
            parameter.put(toString() + "lastNode", ((EdsRouteNode) tblEntity.getList().get(tblEntity.getLastRow())).getNode());
        }
    }

    @Override
    protected <T> T _newObjEntity() {
        return (T) routeNodeBo.newRouteNode(
                (EdsRoute) _getParameterParentValue(this),
                tblEntity.getList().size(),
                (EdsNode) txtNodeFrom.getObject());
    }
}