
package ObjectAndClass;

public class students {
    String name;
    int id;

    public students() {
    }

    public students(String name, double id) {
        this.name = name;
        this.id = (int) id;
    }
    
    public static void main(String[] args) {
        students a1 = new students();
        a1.setId(1000);
        a1.setName("Sofiqul");
        System.out.println(a1);
        students a2 = new students("Azad", 1244633);
        System.out.println(a2);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        return "students{" + "name=" + name + ", id=" + id + '}';
    }
    
}
