package model.dao.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import model.mdl.eds.EdsDao;
import model.obj.eds3.EdsConnoteActivity;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsConnoteActivityDao extends EdsDao {

    @Override
    protected Class getEntity() {
        return EdsConnoteActivity.class;
    }
}