package Converter;

import Children.Child;
import Children.ParsedChild;
import Objects.ParsedObject;

public class ChildConverter implements Converter<Child, ParsedChild>{
    @Override
    public ParsedChild convert(Child child) {
        return new ParsedChild(
                child.getType(),
                child.getName()
        );
    }
}
