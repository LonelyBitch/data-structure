/**
 * 数值的整数次方
 */
public class 数值的整数次方 {

    public static void main(String[] args) {
        double power = power(3, 4);
        System.out.println(power);
    }

    public static double power(double base, int exponent) {

        if (exponent == 0) return 1;
        if (exponent == 1) return base;//定义递归的基本情况

        boolean Nagative = false;
        if (exponent < 0) {
            Nagative = true;
        }

        double result = power(base, exponent / 2);
        result *= result;

        if (exponent%2!=0) result *= base;

        return  result;

    }

}
