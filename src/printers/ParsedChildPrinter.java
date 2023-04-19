package printers;

import entities.parsed_entites.ParsedChild;

public class ParsedChildPrinter implements EntityPrinter{

    ParsedChild parsedChild;

    public ParsedChildPrinter(ParsedChild parsedChild){
        this.parsedChild = parsedChild;
    }

    @Override
    public void print() {
        System.out.println("--ParsedChild--");
        System.out.printf("Type: %s, Name: %s, ParentName: %s%n",
                parsedChild.getType(),
                parsedChild.getName(),
                parsedChild.getParentName()
        );
    }
}
