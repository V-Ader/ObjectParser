package Children;

public class Child {


    public enum Types{
        LinkChild,
        PathChild,
        EthernetChild
    }

    private final Types Type;
    private final String Name;

    public Child(Types type, String name) {
        this.Type = type;
        this.Name = name;
    }

    public Types getType() {
        return Type;
    }

    public String getName() {
        return Name;
    }
}
