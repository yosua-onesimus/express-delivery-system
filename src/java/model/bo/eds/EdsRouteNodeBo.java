package model.bo.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.database.CCHibernateBo;
import model.obj.eds2.EdsNode;
import model.obj.eds2.EdsRoute;
import model.obj.eds2.EdsRouteNode;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsRouteNodeBo extends CCHibernateBo {

    public synchronized EdsRouteNode newRouteNode(EdsRoute route, Integer sequence, EdsNode node) {
        return new EdsRouteNode(route, sequence, sequence == 0 ? node : null);
    }
}