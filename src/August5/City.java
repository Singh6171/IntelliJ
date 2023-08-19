package August5;

public class City extends Country{
    String name;
    int sectors;
    City(){
        super("India", 29);
    }

    public String getCityName() {
        return name;
    }

    public void setCityName(String cityName) {
        this.name = cityName;
    }

    public int getSectors() {
        return sectors;
    }

    public void setSectors(int sectors) {
        this.sectors = sectors;
    }
}
