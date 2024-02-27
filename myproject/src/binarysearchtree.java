
public class binarysearchtree {
	treenode root;
	int count;
class treenode{
	treenode left;
	treenode right;
	int ele;
	treenode(int e){
		this.ele=e;
	}
}
public void preorder(treenode root) {
	if(root==null)return;
	System.out.println(root.ele);
	preorder(root.left);
	preorder(root.right);
}

public void createbinarytree() {
	treenode first=new treenode(1);
	treenode second=new treenode(2);
	treenode third=new treenode(3);
	treenode four=new treenode(4);
	treenode five=new treenode(5);
	treenode six=new treenode(6);
	treenode seven=new treenode(7);
	
	root=first;
	first.left=second;
	first.right=third;
	second.left=four;
	second.right=five;
	third.left=six;
	third.right=seven;
}
public static void main(String[] args) {
	binarysearchtree b=new binarysearchtree();
	b.createbinarytree();
	b.preorder(b.root);
}
}
