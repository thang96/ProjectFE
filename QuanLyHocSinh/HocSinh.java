package QuanLyHocSinh;

public class HocSinh {
    private int id;
    private String name;
    private int age;
    private String address;
    private double point;
    private String classroom;

    public HocSinh(int id, String name, int age, String address, double point, String classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.point = point;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getPoint() {
        return point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address
                + ", Point: " + point + ", Classroom: " + classroom;
    }
}
