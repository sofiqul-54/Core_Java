
package Method;
public class MethodEx6 {
    int x = 10;
    int y = 5;
    public static void main(String[] args) {
        MethodEx6  m = new MethodEx6();
       int rs =  m.makeSum(m.x, m.y, 50, 10);
        System.out.println("Result :" + rs);
    }
    public int makeSum (int num1, int num2, int num3, int num4){
    int sum = num1 + num2 + num3 + num4;
    return sum;
    }
}
