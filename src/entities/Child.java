package entities;

public class Child {

    public enum Types{
        LinkChild,
        PathChild,
        EthernetChild
    }

    private final Types type;
    private final String name;

    public Child(Types type, String name) {
        this.type = type;
        this.name = name;
    }

    public Types getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static class Builder {
        private Child.Types type;
        private String name;

        public Builder type(Child.Types type) {
            this.type = type;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Child build() {
            return new Child(type, name);
        }
    }
}
