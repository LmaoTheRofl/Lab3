import person.*;

import java.util.List;

import static person.Name.*;

public class Lab3 {
    public static void main(String[] args) {
        MalishFriend кристер = new MalishFriend(KRISTER.getName(), List.of(), false);
        MalishFriend гунилл = new MalishFriend(GUNILL.getName(), List.of(), false);
        MalishFriend карлосон = new MalishFriend(CARLOSON.getName(), List.of(), true);
        Bimbo bimbo = new Bimbo(List.of(), false);
        Malish malish = new Malish(List.of(кристер, гунилл, карлосон, bimbo), true);
        malish.walk(bimbo, new Park("Вазы"));
        bimbo.think();
        malish.play(
                List.of(кристер,
                        гунилл)
        );
    }
}
