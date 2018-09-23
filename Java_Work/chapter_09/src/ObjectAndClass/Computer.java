
package ObjectAndClass;
public class Computer {
    int serialNumber;
    String brand;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setSerialNumber(154784);
        computer.setBrand("HP");
        int x = computer.getSerialNumber();
        String b = computer.getBrand();
        System.out.println("X :"+x +" B : "+b);
        
    }
    
    
}
