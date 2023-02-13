public class Person {

    private final String name;

    public Person() {
        this("");
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
