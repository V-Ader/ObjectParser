package Objects;

import Children.ParsedChild;

import java.util.List;

public class ParsedObject {
    private String id;
    private ObjectToParse.Types Type;
    private String ipAddress;
    private Byte ipAddressMask;
    private List<ParsedChild> ParsedChildList;

    public ParsedObject(){};
    public ParsedObject(String id, ObjectToParse.Types type, String ipAddress, Byte ipAddressMask, List<ParsedChild> parsedChildList) {
        this.id = id;
        Type = type;
        this.ipAddress = ipAddress;
        this.ipAddressMask = ipAddressMask;
        ParsedChildList = parsedChildList;
    }

    public String getId() {
        return id;
    }

    public ObjectToParse.Types getType() {
        return Type;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public Byte getIpAddressMask() {
        return ipAddressMask;
    }

    public List<ParsedChild> getParsedChildList() {
        return ParsedChildList;
    }
}
