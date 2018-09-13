package Method;

public class MedthodEx7 {
    

    public static void main(String[] args) {
MedthodEx7 m = new MedthodEx7(){
}
    }

    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int makemulti(int num1, int num2) {
        int multirs = num1 * num2;
        return multirs;
    }

    public int makeSubstitution (int n1, int n2){
    int rs =makemulti(n1, n2) - makeSum(n1, n2);
    return rs;
    }
}
