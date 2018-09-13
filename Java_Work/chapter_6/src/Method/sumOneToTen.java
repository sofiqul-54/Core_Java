package Method;
public class sumOneToTen {
    int x = 10;
    int y = 5;
    public static void main(String[] args) {
        MethodEx6  m = new MethodEx6();
       int rs =  m.makeSum(1, 2,3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Result :" + rs);
    }
    public int makeSum (int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10){
    int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
    return sum;
    }
}