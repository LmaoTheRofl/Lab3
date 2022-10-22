package person;

import java.util.List;

import static person.Name.BIMBO;

public class Bimbo extends Person implements Dog {
    public Bimbo(List<Person> friends, Boolean available) {
        super(BIMBO.getName(), friends, available);
    }

    @Override
    public void snuff() {
        System.out.println(super.getName() + " нюхает других собак");
    }

    @Override
    public void talk() {
        System.out.println(super.getName() + " весело общается с другими собаками");
    }

    public void think() {
        System.out.println(super.getName() + " считал, что это самый веселый час за весь день, потому что в парке ");
        snuff();
        talk();
    }
}
