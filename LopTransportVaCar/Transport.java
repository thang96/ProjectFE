package LopTransportVaCar;

public class Transport {

    private String manufacturer;
    private String name;
    private int year;
    private int speed;

    public Transport() {
    }

    public Transport(String manufacturer, String name, int year, int speed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Hãng sản xuất: " + manufacturer);
        System.out.println("Tên xe: " + name);
        System.out.println("Năm: " + year);
        System.out.println("Vận tốc: " + speed);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
