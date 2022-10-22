package person;

public enum Name {
    KRISTER("Кристер"),
    GUNILL("Гунилл"),
    BIMBO("Бимбо"),
    MALISH("Малыш"),
    CARLOSON("Карлосон");

    private String name;

    Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
