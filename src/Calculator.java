public class Calculator {
    static int power(int num1,int num2)
    {
        return (int) Math.pow(num1,num2);
    }
    static double power(double num1,double num2)
    {
        return Math.pow(num1,num2);
    }


}
class Test
{
    public static void main(String[] args) {
        System.out.println(Calculator.power(10,3));
        System.out.println(Calculator.power(20,2));
    }
}