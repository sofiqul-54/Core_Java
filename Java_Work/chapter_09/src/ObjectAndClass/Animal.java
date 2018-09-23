package ObjectAndClass;
//Class is a blue print of Object

public class  Animal extends Object {
    //Animal Object's State
    //Instant Variable/class levele variable also can imagin variable

    String name;
    String color;
    double age;
    String race;

    //Default Constractor  has no argument or parameters.
    public Animal() {
    }

    //Argumentive Constractor
    public Animal(String name, String color, double age, String race) {
       //Current Instant
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
    }

    
    
    // Animal Object's Behavior
    void bite() {

    }

    void eat() {

    }

    void run() {

    }
    
    void work(){
        
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        //First Animal is class referance
        //animal is object name
        // = is operator
        // new is operator for creating object
        // last Animal is Constractor
        Animal jerry = new Animal();
        Animal nova = new Animal();
        Animal macop = new Animal("Mostafiz", "White", 25.5, "ASIAN");
        System.out.println(macop);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + '}';
    }

}
