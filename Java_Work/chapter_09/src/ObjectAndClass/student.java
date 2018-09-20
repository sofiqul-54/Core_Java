
package ObjectAndClass;

import privet.Student;

public class student {
   private final int id;
   private final String name;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + '}';
    }
   
  public Student displayDetails(){
  Student s = new Student(100, "Trump");
  return s;
  }
  
}
