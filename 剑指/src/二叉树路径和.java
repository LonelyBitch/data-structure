import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 二叉树路径和 {

    List<ArrayList<Integer>> resultList = new ArrayList<>();
    public List<ArrayList<Integer>> findPath(Node head ,int target){

        findPath(head,target,new ArrayList<Integer>());

        return resultList;

    }

    public void findPath(Node node, int target, ArrayList<Integer> path){

        if (node==null) return ;

        path.add(node.value);
        target-=node.value;

        if (target==0&&node.left==null&& node.right==null){
            resultList.add(new ArrayList<>(path));
        }else {
            findPath(node.left,target,path);
            findPath(node.right,target,path);
        }

        path.remove(path.size()-1);

    }




}
