package Children;

public class ParsedChild {
    private Child.Types Type;
    private String ParentName;
    private String Name;


    public ParsedChild(Child.Types type, String name) {
        Type = type;
        Name = name;
    }
    public ParsedChild(Child.Types type, String parentName, String name) {
        Type = type;
        ParentName = parentName;
        Name = name;
    }

    public Child.Types getType() {
        return Type;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        this.ParentName = parentName;
    }

    public String getName() {
        return Name;
    }
}
