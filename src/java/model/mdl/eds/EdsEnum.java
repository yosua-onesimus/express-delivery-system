package model.mdl.eds;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class EdsEnum {

    public enum NodeLevel {

        GATEWAY("Gateway"),
        CABANG_UTAMA("Cabang Utama"),
        CABANG("Cabang"),
        AGEN("Agen"),
        KANTOR_PERWAKILAN("Kantor Perwakilan"),
        OPERATIONAL("Operational");
        private String string;

        private NodeLevel(String string) {
            this.string = string;
        }

        @Override
        public String toString() {
            return string;
        }
    }

    public enum ActivityType {

        CREATE_CONNOTE("Create Connote", ""),
        TIMBER_PACKING("Timber Packing", ""),
        CREATE_BAG("Create Bag", ""),
        CREATE_MASTER_BAG("Create Master Bag", "");
        private String string;
        private String description;

        private ActivityType(String string, String description) {
            this.string = string;
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return string;
        }
    }
}