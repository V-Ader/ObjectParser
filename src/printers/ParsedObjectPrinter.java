package printers;

import entities.parsed_entites.ParsedObject;

public class ParsedObjectPrinter implements EntityPrinter{
    ParsedObject parsedObject;

    public ParsedObjectPrinter(ParsedObject parsedObject){
        this.parsedObject = parsedObject;
    }

    @Override
    public void print() {
        System.out.println("--ParsedObject--");
        System.out.printf("ID: %s, Type: %s, IPAddress: %s, Mask: %s%n",
                parsedObject.getId(),
                parsedObject.getType(),
                parsedObject.getIpAddress(),
                parsedObject.getIpAddressMask()
                );
    }
}
