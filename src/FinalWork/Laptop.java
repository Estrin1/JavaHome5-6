package FinalWork;


public class Laptop {
    private String name;
    private String color;
    private String os;
    private int ram;
    public int HDD;
    public int price;

    public Laptop(String name, String color, String os, Integer ram, Integer HDD, Integer price) {
        this.name = name;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.HDD = HDD;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getOs() {
        return this.os;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHDD() {
        return this.HDD;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("\nLaptops:\n" +
                "name:" + this.name + "\n" +
                "color: " + this.color + "\n" +
                "os: " + this.os + "\n" +
                "ram: " + this.ram + " Gb\n" +
                "HDD: " + this.HDD + " Gb\n" +
                "price: " + this.price + " Rub\n");
    }
//     public Object includes(Object b, String t){


//    public String equalsL(Object b, String c) {
//        if (b instanceof Laptop){
//            ((Laptop) b).getName()
        }





