package July29;

class Company{
    private String name;
    private String city;
    private double opensAt;

    public Company() {
    }

    public Company(String name, String city, double opensAt) {
        this.name = name;
        this.city = city;
        this.opensAt = opensAt;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", opensAt=" + opensAt +
                '}';
    }
}
public class Constructors {
    public static void main(String[] args) {
        Company company = new Company("People", "Mississauga", 8.00);
        System.out.println(company);

    }
}
