package Converter;

import Children.Child;
import Children.ParsedChild;
import Objects.ObjectToParse;
import Objects.ParsedObject;

import java.util.ArrayList;
import java.util.List;

public class ObjectConverter implements Converter<ObjectToParse, ParsedObject> {

    @Override
    public ParsedObject convert(ObjectToParse objectToParse) {
        ParsedObject newParsedObject = null;


        if (objectToParse.getName() == null) throw new NullPointerException("ObjectToParse.name is null");

        String id;
        if (objectToParse.getId() != null) id = objectToParse.getId();
        else id = objectToParse.getUuid();


        if (id == null) throw new NullPointerException("ObjectToParse.id and ObjectToParse.uuid is null");


        String ipAddress;
        Byte ipAddressMask;

        if ((objectToParse.getIpAddressV4() != null)) {
            ipAddress = objectToParse.getIpAddressV4();
            ipAddressMask = objectToParse.getIpAddressV4Mask();
            if (ipAddress == null || ipAddressMask == null) throw new NullPointerException("ObjectToParse.ipAddressV4 or ObjectToParse.ipAddressV4 is null");
            if (ipAddressMask < 1 || ipAddressMask > 32) throw new NullPointerException("ObjectToParse.ipAddressV4Mask must be in range 1 - 32");

        }
        else {
            ipAddress = objectToParse.getIpAddressV6();
            ipAddressMask = objectToParse.getIpAddressV6Mask();
            if (ipAddress == null || ipAddressMask == null) throw new NullPointerException("ObjectToParse.ipAddressV6 or ObjectToParse.ipAddressV6 is null");
            if (ipAddressMask < 33 || ipAddressMask > 64) throw new NullPointerException("ObjectToParse.ipAddressV6Mask must be in range 33 - 64");

        }




        ChildConverter childConverter = new ChildConverter();
        List<ParsedChild> parsedChildList = new ArrayList<>();
        for(Child child : objectToParse.getChildTypes()){
            ParsedChild parsedChild = childConverter.convert(child);
            parsedChild.setParentName(objectToParse.getName());
            parsedChildList.add(parsedChild);
        }

        newParsedObject = new ParsedObject(id, objectToParse.getType(), ipAddress, ipAddressMask, parsedChildList);

        return newParsedObject;
    }
}
