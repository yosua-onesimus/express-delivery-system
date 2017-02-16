package model.obj.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_paths")
@CCTypeConfig(label = "Path", uniqueKey = "@nodeFrom.name-@nodeTo.name")
public class EdsPath extends CCEntity {

    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", requestFocus = true)
    private EdsNode nodeFrom;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsNode nodeTo;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public EdsNode getNodeFrom() {
        return nodeFrom;
    }

    public void setNodeFrom(EdsNode nodeFrom) {
        this.nodeFrom = nodeFrom;
    }

    public EdsNode getNodeTo() {
        return nodeTo;
    }

    public void setNodeTo(EdsNode nodeTo) {
        this.nodeTo = nodeTo;
    }
//</editor-fold>
}