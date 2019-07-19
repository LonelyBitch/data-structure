public class 从1到n1出现的个数 {

    public int countOne2(int n) {
        int count = 0;
        int i = 1;
        int current = 0;
        int before = 0;
        int after = 0;
        int temp = 0;
        while (before != 0) {

            before = n / (int) Math.pow(10, i);
            temp = n % (int) Math.pow(10, i);
            current = temp / (int) Math.pow(10, i - 1);
            after = temp % (int) Math.pow(10, i - 1);


            if (current == 1) {
                count += before * (int) Math.pow(10, i - 1) + after + 1;
            } else if (current < 1) {
                count += before * (int) Math.pow(10, i - 1);
            } else {
                count += (before) + 1 * (int) Math.pow(10, i - 1);
            }
            i++;
        }
        return count;
    }
}
