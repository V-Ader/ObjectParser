package converters;

import entities.Child;
import entities.parsed_entites.ParsedChild;
import entities.ObjectToParse;
import entities.parsed_entites.ParsedObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ObjectConverter implements Converter<ObjectToParse, ParsedObject> {

    private static ObjectConverter instance;
    public static ObjectConverter getInstance(){
        if(instance == null){
            instance = new ObjectConverter();
        }
        return instance;
    }

    private ObjectConverter() {}

    @Override
    public ParsedObject convert(ObjectToParse objectToParse) {
        return new ParsedObject.Builder()
                .id(getId(objectToParse))
                .type(objectToParse.getType())
                .ipAddress(getIpAddress(objectToParse))
                .ipAddressMask(getIpAddressMask(objectToParse))
                .parsedChildren(getChildren(objectToParse))
                .build();
    }

    private String getId(ObjectToParse objectToParse) {
        return Stream.of(objectToParse.getId(), objectToParse.getUuid())
                .findFirst()
                .orElse("not specified");
    }

    private String getIpAddress(ObjectToParse objectToParse) {
        if (objectToParse.getIpAddressV4() != null) {
            return objectToParse.getIpAddressV4();
        }
        return objectToParse.getIpAddressV6();
    }

    private byte getIpAddressMask(ObjectToParse objectToParse) {
        if (objectToParse.getIpAddressV4() != null) {
            return objectToParse.getIpAddressV4Mask();
        }
        return objectToParse.getIpAddressV6Mask();
    }

    private List<ParsedChild> getChildren(ObjectToParse objectToParse) {
        ChildConverter childConverter = ChildConverter.getInstance();
        List<ParsedChild> parsedChildList = new ArrayList<>();
        for(Child child : objectToParse.getChildren()){
            ParsedChild parsedChild = childConverter.convert(child);
            parsedChild.setParentName(objectToParse.getName());
            parsedChildList.add(parsedChild);
        }
        return parsedChildList;
    }
}
