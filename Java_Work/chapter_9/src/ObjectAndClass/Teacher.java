package ObjectAndClass;
//Setter & Getter Based(First value set then value get)

public class Teacher {
// Work -1 : Instant Variable Declare

    int id;
    String name;
    int age;
    String educationQualification;

// Work -2 : Default Constraction Add (Optional)
// Work -3 : Take a Main Method or any method (Optional)
// Work -4 : Create Setter method 

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }
    
    
    public static void main(String[] args) {
        // Work -5 : Create Object using default Constractor
// Work -6 : Set Value within Object teacher
        Teacher teacher = new Teacher();
        teacher.setId(2000);
        teacher.setName("Sofiqul Islam");
        teacher.setAge(28);
        teacher.setEducationQualification("MBA");
        
        Teacher t2 = new Teacher();
        t2.setId(3000);
        t2.setName("Zohiqul Islam");
        t2.setAge(30);
        t2.setEducationQualification("MIT");
        
        
        
        System.out.println("ID   "+teacher.getId()+"  Name  "+teacher.getName()+"  Age  "
                +teacher.getAge()+" Edu "+teacher.getEducationQualification());
        System.out.println("===================================================");
        System.out.println("ID :"+teacher.getId());
        System.out.println("Name :"+teacher.getName());
        System.out.println("Age :" +teacher.getAge());
        System.out.println("Education :" + teacher.getEducationQualification());
        
         System.out.println("===================================================");
        System.out.println("ID :"+t2.getId());
        System.out.println("Name :"+t2.getName());
        System.out.println("Age :" +t2.getAge());
        System.out.println("Education :" + t2.getEducationQualification());
    }

// Work -7 : generate getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEducationQualification() {
        return educationQualification;
    }
    
}
