package person;

import java.util.List;
import java.util.Objects;

public abstract class Person {
    private String name;
    private List<Person> friends;
    private Boolean available;
    public Person(String name, List<Person> friends, Boolean available) {
        this.name = name;
        this.friends = friends;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public Boolean getAvailable() {
        return available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(friends, person.friends) && Objects.equals(available, person.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, friends, available);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", friends=" + friends +
                ", avalable=" + available +
                '}';
    }
}
