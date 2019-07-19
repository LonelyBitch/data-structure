import java.util.ArrayList;

public class 圆圈中最后剩下的数字 {

    public int  LastNumber(int n , int m){

        if (n<1||m<1) return -1;

        int step =0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<n; i++){
            list.add(i);

        }

        int removeIndex = 0;
        while (list.size()>1){
            removeIndex = (step+m-1)%list.size();
            list.remove(removeIndex);
        }

        return list.get(0);

    }
}
