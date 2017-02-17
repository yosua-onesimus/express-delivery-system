package model.obj.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCFieldConfig.Type;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import javax.persistence.Column;
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
@Table(name = "eds_route_nodes")
@CCTypeConfig(label = "Node", uniqueKey = "@sequence-@node.name")
public class EdsRouteNode extends CCEntity {

    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsRoute route;
    @Column(name = "sequence_")
    @CCFieldConfig(group = "General", label = "#", tooltiptext = "Sequence", accessible = Accessible.MANDATORY_READONLY, type = Type.NUMERIC, maxLength = 2)
    private Integer sequence = 0;
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name")
    private EdsNode node;

//<editor-fold defaultstate="collapsed" desc=" EdsRouteNode ">
    public EdsRouteNode() {
    }

    public EdsRouteNode(EdsRoute route, Integer sequence, EdsNode node) {
        this.route = route;
        this.sequence = sequence;
        this.node = node;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public EdsRoute getRoute() {
        return route;
    }

    public void setRoute(EdsRoute route) {
        this.route = route;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public EdsNode getNode() {
        return node;
    }

    public void setNode(EdsNode node) {
        this.node = node;
    }
//</editor-fold>
}