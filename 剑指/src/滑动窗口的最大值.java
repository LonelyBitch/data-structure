


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class 滑动窗口的最大值 {


    public ArrayList<Integer> findMaxNum(int[] arr, int size) {

        ArrayList<Integer> max = new ArrayList<>();

        if (arr.length == 0 || arr == null || size <= 0 || size > arr.length) {
            return null;
        }

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i= 0; i<size-1; i++){

            while (!deque.isEmpty()&& arr[i]>arr[deque.getFirst()]){
                deque.remove();
            }
            deque.addLast(i);
        }

        for (int i =size-1; i<arr.length; i++){
            while (!deque.isEmpty()&& arr[i]>arr[deque.getFirst()]){
                deque.removeLast();
            }
            while (!deque.isEmpty()&& (i-deque.getFirst())>size){
                deque.removeFirst();
            }
            deque.addLast(i);
            max.add(arr[deque.getFirst()]);
        }

        return max;



    }
}
