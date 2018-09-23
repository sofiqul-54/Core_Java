package ObjectAndClass;

public class Animals {

    int code;
    String name;
    String color;
   
    
    public static void main(String[] args) {
      Animals animal = new Animals();
      animal.setCode(101);
      animal.setName("TOMMY");
      animal.setColor("Golden");
      
        System.out.println("Animal Code :" +animal.getCode());
        System.out.println("Dog Name : " + animal.getName());
        System.out.println("Dog Color :" + animal.getColor());
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
