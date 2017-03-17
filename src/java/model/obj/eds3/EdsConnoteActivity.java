package model.obj.eds3;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.common.CCFieldConfig;
import cococare.database.CCEntity;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import model.mdl.eds.EdsEnum.ActivityType;
import model.obj.eds2.EdsNode;
//</editor-fold>

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsConnoteActivity extends CCEntity {

    @ManyToOne
    @CCFieldConfig(visible = false)
    private EdsConsignmentNotes consignmentNotes;
    @ManyToOne
    @CCFieldConfig(maxLength = 24, uniqueKey = "name")
    private EdsNode node;
    @CCFieldConfig(optionSource = "model.mdl.eds.EdsEnum$ActivityType", optionReflectKey = "activity", visible = false)
    private Integer activityIndex = ActivityType.CREATE_CONNOTE.ordinal();
    @Column(length = 24)
    @CCFieldConfig(visible2 = false)
    private String activity = ActivityType.CREATE_CONNOTE.toString();
    @Column(length = 24)
    @CCFieldConfig()
    private String description;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public EdsConsignmentNotes getConsignmentNotes() {
        return consignmentNotes;
    }

    public void setConsignmentNotes(EdsConsignmentNotes consignmentNotes) {
        this.consignmentNotes = consignmentNotes;
    }

    public EdsNode getNode() {
        return node;
    }

    public void setNode(EdsNode node) {
        this.node = node;
    }

    public Integer getActivityIndex() {
        return activityIndex;
    }

    public void setActivityIndex(Integer activityIndex) {
        this.activityIndex = activityIndex;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
//</editor-fold>
}