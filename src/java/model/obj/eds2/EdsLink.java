package model.obj.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.obj.eds.EdsVehicleType;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_links")
@CCTypeConfig(label = "Link", uniqueKey = "@nodeFrom.name-@nodeTo.name-@vehicleType.name")
public class EdsLink extends CCEntity {

    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", requestFocus = true)
    private EdsNode nodeFrom;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsNode nodeTo;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsVehicleType vehicleType;

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

    public EdsVehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(EdsVehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
//</editor-fold>
}