package August5;

public class Country {
    String name;
    int states;

    public Country(String name, int states) {
        this.name = name;
        this.states = states;
    }

    public void setName1(String name) {
        this.name = name;
    }

    public void getName11() {
        System.out.println(name);
    }
}
