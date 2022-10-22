package person;

import java.util.List;
import java.util.stream.Collectors;

import static person.Name.MALISH;

public class Malish extends Person {
    public Malish(List<Person> friends, boolean available) {
        super(MALISH.getName(), friends, available);
    }
    public void play(List<Person> a) {
        String friends = a.stream().map(Person::getName).collect(Collectors.joining(","));
        if (findAvailableFriendsWithoutCarloson(a) > 0) {
            System.out.println("Малыш играет с " + friends);
        } else {
            System.out.println("Обычно Малыш играет с " + friends + ", но сегодня он их не нашёл");
            think();
            foo();
        }
    }

    private long findAvailableFriendsWithoutCarloson(List<Person> a) {
        return a.stream().filter(p -> p.getAvailable() && !p.getName().equals("Карлосон")).count();
    }

    private void think() {
        System.out.println("Может быть, они уже уехали на каникулы");
    }

    public void walk(Person person, Park park) {
        System.out.println("Каждое утро " + super.getName() + " с " + person.getName() + " гулял в парке " + park.getName());
    }

    private void foo() {
        System.out.println("Ну что ж, пусть, ему на это наплевать, пока у него есть "
                + getFriends().stream().filter(Person::getAvailable).map(Person::getName).collect(Collectors.joining())
        + ". Ну и " + getFriends().stream().filter(p -> p instanceof Dog).map(Person::getName).collect(Collectors.joining()) +
                " конечно.");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
