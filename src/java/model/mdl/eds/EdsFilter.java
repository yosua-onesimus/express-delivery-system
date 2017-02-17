package model.mdl.eds;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.database.CCHibernateFilter;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsFilter {

    public static abstract class isNodeIsLinkNodeFrom extends CCHibernateFilter {

        @Override
        public String getFieldName() {
            return "id";
        }

        @Override
        public String getExpression() {
            return "id IN (SELECT nodeTo.id FROM EdsLink WHERE nodeFrom = :nodeFrom)";
        }

        @Override
        public String getParameterName() {
            return "nodeFrom";
        }
    };
}