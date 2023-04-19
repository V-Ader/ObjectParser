package converters;

import entities.Child;
import entities.parsed_entites.ParsedChild;

public class ChildConverter implements Converter<Child, ParsedChild>{

    private static ChildConverter instance;

    public static ChildConverter getInstance(){
        if(instance == null){
            instance = new ChildConverter();
        }
        return instance;
    }

    private ChildConverter() {}

    @Override
    public ParsedChild convert(Child child) {
        return new ParsedChild(
                child.getType(),
                child.getName()
        );
    }
}
