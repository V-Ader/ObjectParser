import Children.Child;
import Children.ParsedChild;
import Converter.ObjectConverter;
import Objects.ObjectToParse;
import Objects.ParsedObject;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ObjectToParse objectToParse = new ObjectToParse();
        objectToParse.setId("123");
        objectToParse.setType(ObjectToParse.Types.Ethernet);
        objectToParse.setIpAddressV4("00.00.00.00");
        objectToParse.setIpAddressV4Mask((byte) 24);
        objectToParse.setName("otp1");

        List<Child> children = List.of(
                new Child(Child.Types.EthernetChild, "Child1"),
                new Child(Child.Types.LinkChild, "Child2")
        );
        objectToParse.setChildTypes(children);

        ObjectConverter objectConverter = new ObjectConverter();

        ParsedObject parsedObject = objectConverter.convert(objectToParse);

        System.out.println(parsedObject.getId());
        System.out.println(parsedObject.getType());
        System.out.println(parsedObject.getIpAddress());
        System.out.println(parsedObject.getIpAddressMask());

        System.out.println("---Children---");
        for(ParsedChild parsedChild : parsedObject.getParsedChildList()){
            System.out.println(parsedChild.getType());
            System.out.println(parsedChild.getName());
            System.out.println(parsedChild.getParentName());
            System.out.println();
        }


    }
}