package model.bo.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.database.CCHibernate.Transaction;
import cococare.database.CCHibernateBo;
import model.dao.eds.EdsConnoteActivityDao;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsConnoteActivityBo extends CCHibernateBo {

//<editor-fold defaultstate="collapsed" desc=" private object ">
    private EdsConnoteActivityDao connoteActivityDao;
//</editor-fold>

    public synchronized boolean saveOrUpdate(Object... objects) {
        Transaction transaction = connoteActivityDao.newTransaction();
        for (Object object : objects) {
            transaction.saveOrUpdate(object);
        }
        return transaction.execute();
    }
}