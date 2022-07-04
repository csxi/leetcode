package hot100.easy;

import hot100.easy.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).*/

public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {

        return true;
    }

    public boolean check(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.val==q.val&&check(p.left,q.right)&&check(q.right,p.left);
    }

        public boolean check2(TreeNode u, TreeNode v) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(u);
            q.offer(v);
            while (!q.isEmpty()) {
                u = q.poll();
                v = q.poll();
                if (u == null && v == null) {
                    continue;
                }
                if ((u == null || v == null) || (u.val != v.val)) {
                    return false;
                }

                q.offer(u.left);
                q.offer(v.right);

                q.offer(u.right);
                q.offer(v.left);
            }
            return true;
        }


}
