  package finalimplents;

public class BinarySearchTree{
	class Node{
		int key;
		Node left,right;
		
	public Node(int item) {
		key=item;
		left=right=null;
	}
	}
	Node root;
	BinarySearchTree(){
		root=null;
	}
	public void Insert(int key) {
		root=insert( root, key);
	}
	Node insert(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		if(key<root.key) {
			root.left=insert(root.left,key);
		}
		if(key>root.key) {
			root.right=insert(root.right,key);
		}
		return root;	
	}
	public void traversal(){
		traversal(root);	
	}
	public void search(int value) {
		search(root,value);
	}
	public Node search(Node root,int key) {
		if(root.key==key||root==null) {
			return root;
		}
		if(root.key<key)
		return search(root.left,key);
		
	return search(root.right,key);		
	}
	public void traversal(Node root) {
		if(root!=null) {
			traversal(root.left);
			System.out.println(root.key);
			traversal(root.right);
			return;
}	
	}
	public void Delete(int key) { 
		     root = delete(root,key);  			
	}
 public Node delete(Node root,int key) {
	 if (root == null) 
	 return root; 
 if (key < root.key) 
     root.left = delete(root.left, key);
	 else if(key > root.key) 
         root.right = delete(root.right, key);
     else
     { 
         if (root.left == null) 
             return root.right; 
         else if (root.right == null) 
             return root.left; 
            root.key=minValue(root.right); 
            root.right = delete(root.right, root.key); 
     } 
    return root; 
 }
 int minValue(Node root) 
 { 
     int minv = root.key; 
     while (root.left != null) 
     { 
         minv = root.left.key; 
         root = root.left; 
     } 
     return minv; 
 } 
 
} 
 
