import java.util.*;
// static class Node {
//     int data;
//     Node left;
//     Node right;

//     Node(int data) {
//         this.data = data;
//         left = null;
//         right = null;
//     }
// }
public class levelOrderTraversal {
    public static void main(String[] args) {
                
    }
    public static void solve(Node root, List<List<Integer>> l){
        if(root == null){
            return;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            ArrayList<Integer> res=new ArrayList<>();
            for(int i=q.size(); i>=0; i++){
                Node temp = q.poll();
                res.add(temp.val);

                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            l.add(res);
        }
    }
}
