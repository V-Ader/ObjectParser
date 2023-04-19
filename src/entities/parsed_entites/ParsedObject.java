package entities.parsed_entites;

import entities.ObjectToParse;

import java.util.List;

public class ParsedObject {
    private String id;
    private ObjectToParse.Types type;
    private String ipAddress;
    private Byte ipAddressMask;
    private List<ParsedChild> parsedChildren;

    public ParsedObject() {}

    public ParsedObject(String id, ObjectToParse.Types type, String ipAddress, Byte ipAddressMask, List<ParsedChild> parsedChildren) {
        this.id = id;
        this.type = type;
        this.ipAddress = ipAddress;
        this.ipAddressMask = ipAddressMask;
        this.parsedChildren = parsedChildren;
    }

    public String getId() {
        return id;
    }

    public ObjectToParse.Types getType() {
        return type;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public Byte getIpAddressMask() {
        return ipAddressMask;
    }

    public List<ParsedChild> getParsedChildren() {
        return parsedChildren;
    }

    public static class Builder {
        private String id;
        private ObjectToParse.Types type;
        private String ipAddress;
        private Byte ipAddressMask;
        private List<ParsedChild> parsedChildren;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder type(ObjectToParse.Types type) {
            this.type = type;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddressMask(Byte ipAddressMask) {
            this.ipAddressMask = ipAddressMask;
            return this;
        }

        public Builder parsedChildren(List<ParsedChild> parsedChildList) {
            this.parsedChildren = parsedChildList;
            return this;
        }

        public ParsedObject build() {
            return new ParsedObject(id, type, ipAddress, ipAddressMask, parsedChildren);
        }
    }

}
