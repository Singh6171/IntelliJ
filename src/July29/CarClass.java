package July29;
class car{
    private String brand;
    private String model;
    private String engine;
    private String type;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
public class CarClass {
    public static void main(String[] args) {
        car car = new car();
        car.setBrand("BMW");
        System.out.println(car.getBrand());
        car.setModel("M5");
        System.out.println(car.getModel());
        car.setEngine("V8 Supercharged");
        System.out.println(car.getEngine());
        car.setType("Sports Car");
        System.out.println(car.getType());
    }
}
