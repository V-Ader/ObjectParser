package entities.parsed_entites;

import entities.Child;

public class ParsedChild {
    private final Child.Types type;
    private final String name;
    private String parentName;


    public ParsedChild(Child.Types type, String name) {
        this.type = type;
        this.name = name;
    }
    public ParsedChild(Child.Types type, String parentName, String name) {
        this.type = type;
        this.parentName = parentName;
        this.name = name;
    }

    public Child.Types getType() {
        return type;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getName() {
        return name;
    }
}
