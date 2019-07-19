import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

public class 三角 {

    public static void main(String[] args) {
        print();
    }

    public static void print() {
//        int num = 6;
//        int i = 0;
//        for ( ; i<=6; i++ ){
//            int j=i+1;
//
//            for (int t =0; t<j-i;t++){
//                System.out.print("1");
//            }
//            for ( ; j<=6; j++){
//                System.out.print("6");
//            }
//            System.out.println();
//
//        }

        int i = 0;
        int t = 0;
        for (; i < 6; i++) {

            for (int j = 0; j < 6; j++) {

                if (j <= t) {
                    System.out.print(" ");
                } else {

                    System.out.print('6');
                }
            }
            t += 1;
            System.out.println();
        }
    }
}
