package model.obj.eds3;

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
@Table(name = "eds_consignment_notes_items")
@CCTypeConfig(label = "Consignment Notes Item", uniqueKey = "@consignmentNotes.code")
public class EdsConsignmentNotesItem extends CCEntity {

    @ManyToOne
    @CCFieldConfig(group = "Goods Description", visible = false)
    private EdsConsignmentNotes consignmentNotes;
    @Column(length = 12)
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, sequence = "[yyMMdd]000000", unique = true)
    private String code;
    @Column(length = 255)
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, maxLength = Short.MAX_VALUE)
    private String description;
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float quantity = 1F;
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float weight;
    @Column(name = "length_")
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float length;
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float width;
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float height;
    @CCFieldConfig(group = "Goods Description", accessible = Accessible.MANDATORY, type = Type.DECIMAL)
    private Float volume;

//<editor-fold defaultstate="collapsed" desc=" getter-setter ">
    public EdsConsignmentNotes getConsignmentNotes() {
        return consignmentNotes;
    }

    public void setConsignmentNotes(EdsConsignmentNotes consignmentNotes) {
        this.consignmentNotes = consignmentNotes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volume) {
        this.volume = volume;
    }
//</editor-fold>
}