package August1;

class CarDetail {
private String name;
private String model;
private int year;

CarDetail(){
    System.out.println("Default Constructor has run");
}

    public CarDetail(String name, String model, int year) {
        this();
        this.name = name;
        this.model = model;
        this.year = year;
    }
    public void getCar(){
        System.out.println("Your Car is :" + year + " " + name + " " + model);
    }
}
