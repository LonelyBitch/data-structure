import java.util.HashMap;
import java.util.Map;

public class RandoPool {

    public static class pool<K>{
        private Map<K,Integer> map1;
        private Map<Integer , K> map2;
        Integer size;

        public  pool(){

            map1 = new HashMap<K, Integer>();
            map2 = new HashMap<Integer, K>();
            size = 0;
        }

        public  void insert(K key){

            if (this.map1.containsKey(key)){
                map1.put(key,size);
                map2.put(size++,key);

                String s = "s";
                Integer.parseInt(s);

            }
        }

        public void  delete(K key){
            if (map1.containsKey(key)){
                return;
            }
            int lastIndex = --size;
            int deleteIndex = map1.get(key);

            K lastKey = map2.get(deleteIndex);
            map1.put(lastKey,deleteIndex);
            map2.put(deleteIndex,lastKey);
            map1.remove(key);
            map2.remove(lastKey);

        }

        public K getRandom(){

            if (this.size==0){
                return null;
            }
            int ranDom = (int) (Math.random()*this.size);
            return map2.get(ranDom);
        }

    }


}
