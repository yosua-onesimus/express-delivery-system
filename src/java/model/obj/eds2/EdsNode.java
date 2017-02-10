package model.obj.eds2;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.common.CCFieldConfig.Accessible;
import cococare.common.CCTypeConfig;
import cococare.database.CCEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import model.mdl.eds.EdsEnum.NodeLevel;
import model.obj.eds.EdsRegional;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
@Entity
@Table(name = "eds_nodes")
@CCTypeConfig(label = "Node", uniqueKey = "name")
public class EdsNode extends CCEntity {

    @Column(length = 8)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, sequence = "000", unique = true)
    private String code;
    @Column(length = 24)
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, requestFocus = true)
    private String name;
    @Column(length = 24)
    @CCFieldConfig(group = "General", visible = false)
    private String description;
    @CCFieldConfig(group = "General", label = "Level", accessible = Accessible.MANDATORY, optionSource = "model.mdl.eds.EdsEnum$NodeLevel", optionReflectKey = "level", visible = false)
    private Integer levelIndex = NodeLevel.GATEWAY.ordinal();
    @Column(name = "level_", length = 18)
    @CCFieldConfig(group = "General", visible2 = false)
    private String level = NodeLevel.GATEWAY.toString();
    @ManyToOne
    @CCFieldConfig(group = "General", accessible = Accessible.MANDATORY, maxLength = 24, uniqueKey = "name", visible = false)
    private EdsRegional regional;
    @ManyToOne
    @CCFieldConfig(group = "General", maxLength = 24, uniqueKey = "name", visible = false)
    private EdsNode parentNode;
    @ManyToOne
    @CCFieldConfig(group = "General", maxLength = 24, uniqueKey = "name", visible = false)
    private EdsNode mainNode;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevelIndex() {
        return levelIndex;
    }

    public void setLevelIndex(Integer levelIndex) {
        this.levelIndex = levelIndex;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public EdsRegional getRegional() {
        return regional;
    }

    public void setRegional(EdsRegional regional) {
        this.regional = regional;
    }

    public EdsNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(EdsNode parentNode) {
        this.parentNode = parentNode;
    }

    public EdsNode getMainNode() {
        return mainNode;
    }

    public void setMainNode(EdsNode mainNode) {
        this.mainNode = mainNode;
    }
//</editor-fold>
}