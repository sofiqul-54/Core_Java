
package ObjectAndClass;
public class ClassRoom {
   int id;
   String locatin;

    public ClassRoom() {
    }

    public ClassRoom(int id, String locatin) {
        this.id = id;
        this.locatin = locatin;
    }
    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(101, "4th");
        System.out.println("ID :  " + classRoom1.getId());
        System.out.println("Name :"+ classRoom1.getLocatin());
    }

    public int getId() {
        return id;
    }

    public String getLocatin() {
        return locatin;
    }

   
   
    
}
