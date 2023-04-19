package entities;

import java.util.List;

public class ObjectToParse {
    public enum Types {LINK, PATH, ETHERNET}
    private String id;
    private String uuid;
    private Types type;
    private String ipAddressV4;
    private Byte ipAddressV4Mask;
    private String ipAddressV6;
    private Byte ipAddressV6Mask;
    private List<Child> children;
    private String name;

    public ObjectToParse() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Types getType() {
        return this.type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public String getIpAddressV4() {
        return this.ipAddressV4;
    }

    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    public byte getIpAddressV4Mask() {
        return this.ipAddressV4Mask;
    }

    public void setIpAddressV4Mask(Byte ipAddressV4Mask) {
        this.ipAddressV4Mask = ipAddressV4Mask;
    }

    public String getIpAddressV6() {
        return this.ipAddressV6;
    }

    public void setIpAddressV6(String ipAddressV6) {
        this.ipAddressV6 = ipAddressV6;
    }

    public Byte getIpAddressV6Mask() {
        return this.ipAddressV6Mask;
    }

    public void setIpAddressV6Mask(Byte ipAddressV6Mask) {
        this.ipAddressV6Mask = ipAddressV6Mask;
    }

    public List<Child> getChildren() {
        return this.children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        private String id;
        private String uuid;
        private ObjectToParse.Types type;
        private String ipAddressV4;
        private Byte ipAddressV4Mask;
        private String ipAddressV6;
        private Byte ipAddressV6Mask;
        private List<Child> children;
        private String name;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder type(ObjectToParse.Types type) {
            this.type = type;
            return this;
        }

        public Builder ipAddressV4(String ipAddressV4) {
            this.ipAddressV4 = ipAddressV4;
            return this;
        }

        public Builder ipAddressV4Mask(Byte ipAddressV4Mask) {
            this.ipAddressV4Mask = ipAddressV4Mask;
            return this;
        }

        public Builder ipAddressV6(String ipAddressV6) {
            this.ipAddressV6 = ipAddressV6;
            return this;
        }

        public Builder ipAddressV6Mask(Byte ipAddressV6Mask) {
            this.ipAddressV6Mask = ipAddressV6Mask;
            return this;
        }

        public Builder children(List<Child> children) {
            this.children = children;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ObjectToParse build() {
            ObjectToParse objectToParse = new ObjectToParse();
            objectToParse.setId(this.id);
            objectToParse.setUuid(this.uuid);
            objectToParse.setType(this.type);
            objectToParse.setIpAddressV4(this.ipAddressV4);
            objectToParse.setIpAddressV4Mask(this.ipAddressV4Mask);
            objectToParse.setIpAddressV6(this.ipAddressV6);
            objectToParse.setIpAddressV6Mask(this.ipAddressV6Mask);
            objectToParse.setChildren(this.children);
            objectToParse.setName(this.name);
            return objectToParse;
        }
    }
}
