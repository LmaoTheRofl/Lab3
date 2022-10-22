package person;

import java.util.List;

public class MalishFriend extends Person implements Friend{
    public MalishFriend(String name, List<Person> friends, Boolean available) {
        super(name, friends, available);
    }
}
