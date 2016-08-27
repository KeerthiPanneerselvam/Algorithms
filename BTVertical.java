import java.util.TreeMap;
import java.util.Set;
import java.util.ArrayList;
public class BTVertical
{
    public void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }
    
    public static TreeMap<Integer,ArrayList> ht = new TreeMap<Integer,ArrayList>();
    public ArrayList al;
    
    public Node verticalprint(Node root, int level)
    {
        if(root == null)
        return null;
        
        Node y = verticalprint(root.left,--level);
        if(y == null)
        {
            level++;
        }
        if(ht.get(level)!=null)
        {
            ArrayList al = ht.get(level);
            al.add(root.data);
            ht.put(level,al);
        }
        else
        {
            al = new ArrayList<>();
            al.add(root.data);
            ht.put(level,al);
        }
        return verticalprint(root.right,++level);
    }
    
    public void display(TreeMap ht)
    {
        Set<Integer> s = ht.keySet();
        for(int keys : s)
        {
            System.out.println(ht.get(keys));
        }
    }
    
    public static void main(String args[])
    {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    
    BTVertical btv = new BTVertical();
    System.out.print("Inorder Traversal : ");
    btv.inorder(root);
    System.out.println("Print Binary Tree Vertically");
    btv.verticalprint(root,0);
    btv.display(ht);
    }
}

class Node
{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}
