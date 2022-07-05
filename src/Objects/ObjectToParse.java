package Objects;

import Children.Child;

import java.util.List;

public class ObjectToParse {
    public enum Types {Link, Path, Ethernet}

    private String id;
    private String uuid;
    private Types Type;
    private String ipAddressV4;
    private Byte IpAddressV4Mask;
    private String ipAddressV6;
    private Byte IpAddressV6Mask;
    private List<Child> childTypes;
    private String Name;

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
        return this.Type;
    }

    public void setType(Types type) {
        this.Type = type;
    }

    public String getIpAddressV4() {
        return this.ipAddressV4;
    }

    public void setIpAddressV4(String ipAddressV4) {
        this.ipAddressV4 = ipAddressV4;
    }

    public Byte getIpAddressV4Mask() {
        return this.IpAddressV4Mask;
    }

    public void setIpAddressV4Mask(Byte ipAddressV4Mask) {
        this.IpAddressV4Mask = ipAddressV4Mask;
    }

    public String getIpAddressV6() {
        return this.ipAddressV6;
    }

    public void setIpAddressV6(String ipAddressV6) {
        this.ipAddressV6 = ipAddressV6;
    }

    public Byte getIpAddressV6Mask() {
        return this.IpAddressV6Mask;
    }

    public void setIpAddressV6Mask(Byte ipAddressV6Mask) {
        this.IpAddressV6Mask = ipAddressV6Mask;
    }

    public List<Child> getChildTypes() {
        return this.childTypes;
    }

    public void setChildTypes(List<Child> childTypes) {
        this.childTypes = childTypes;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
}
