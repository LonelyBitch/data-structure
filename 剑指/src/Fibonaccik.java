/**
 * 菲波那切数列
 */

public class Fibonaccik {


    public static void main(String[] args) {
       int result =  finbonaccik(4);

        System.out.println(result);
    }

    public static int finbonaccik(int n) {

        int result = 0;
        int preOne = 1;
        int preTwo = 2;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;

        }

        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;

            preTwo = result;

            preOne = preTwo;
        }

        return result;
    }

}
