package FiveDay;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 用两个map结构 实现insert delet getRamdom 时间复杂度为O(1) 的需求
 * <p>
 * 在添加过程当中key作为第一个map的key value 用当前结构所存储的数据量的大小序号来标志
 * 在删除的时候 在第一个表找到对应的index值 从第二个里面删除 同时：将最后一个key 跟将要删除的key进行交换 然后删除最后一个序号
 */
public class FiveDay {
    public class pool {
        private Map<String, Integer> map1;
        private Map<Integer, String> map2;
        private int size;

        public void pool() {
            map1 = new HashMap<String, Integer>();
            map2 = new HashMap<Integer, String>();

            this.size = size;

        }

        public void insert(String key) {
            if (!map1.containsKey(key)) {
                map1.put(key, size++);
                map2.put(size, key);
            }

        }

        public String getRandom() {
            if (this.size == 0) {
                return null;
            }
            return this.map2.get((int) (Math.random() * this.size));
        }

        public void delete(String key) {
            if (map1.containsKey(key)) {
                Integer index = map1.get(key);
                String str = map2.get(--size);
                map2.put(index, str);
                map1.put(str,index);

                map1.remove(key);
                map2.remove(size);
            }
        }
    }


}
