public class IsTreeBST {
	
	static Node root;
	
	public static void main(String[] args) {
		 IsTreeBST itbts = new IsTreeBST();
		 IsTreeBST.root = itbts.new Node(4);
		 IsTreeBST.root.addNode(3);
		 IsTreeBST.root.addNode(6);
		 IsTreeBST.root.addNode(1);
		 IsTreeBST.root.addNode(2);
		 IsTreeBST.root.addNode(5);
		 IsTreeBST.root.addNode(7);
		 IsTreeBST.root.printInOrder(root);
		 System.out.println(checkBST(IsTreeBST.root));
	}
	

    static boolean checkBST(Node root) {    	
       return isFullBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    static boolean isFullBST(Node n, int max, int min){
         if(n==null){        	
            return true;
        }
        if(n.data < min || n.data > max){        	
            return false;
        }        
        
        return (min < n.data && n.data < max && isFullBST(n.left, n.data, min) && isFullBST(n.right, max, n.data));
    }
	
	class Node{
		int data;
		Node left, right;
		
		public Node(int data){
			this.data = data;
			left = right = null;			
		}
		
		public void addNode(int value){
			if(value <= data){
				if(left == null){
					left = new Node(value);
				} else {
					left.addNode(value);
				}
			} else{
				if(right == null){
					right = new Node(value);
				} else {
					right.addNode(value);
				}
			}
		}
		public void printInOrder(Node n){
			if(n.left!=null){
				printInOrder(n.left);
			}
			System.out.print(n.data+"");
			if(n.right!=null){
				printInOrder(n.right);
			}
			
		}
	}

}
