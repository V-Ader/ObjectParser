package main;

import entities.Child;
import entities.parsed_entites.ParsedChild;
import converters.ObjectConverter;
import entities.ObjectToParse;
import entities.parsed_entites.ParsedObject;
import printers.ParsedChildPrinter;
import printers.ParsedObjectPrinter;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ObjectToParse objectToParse = new ObjectToParse.Builder()
                .id("123")
                .type(ObjectToParse.Types.ETHERNET)
                .ipAddressV4("192.168.0.1")
                .ipAddressV4Mask((byte) 24)
                .name("opt1")
                .children(makeChildren())
                .build();

        ObjectConverter objectConverter = ObjectConverter.getInstance();

        ParsedObject parsedObject = objectConverter.convert(objectToParse);

        ParsedObjectPrinter parsedObjectPrinter = new ParsedObjectPrinter(parsedObject);
        parsedObjectPrinter.print();

        for(ParsedChild parsedChild : parsedObject.getParsedChildren()){
            ParsedChildPrinter parsedChildPrinter = new ParsedChildPrinter(parsedChild);
            parsedChildPrinter.print();
        }
    }

    private static List<Child> makeChildren() {
        return List.of(
                new Child(Child.Types.EthernetChild, "Child1"),
                new Child(Child.Types.LinkChild, "Child2"));
    }
}