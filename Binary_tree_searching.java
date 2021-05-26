class Binary_tree
{
	static class Node
	{
		int data;
		Node right;
		Node left;
		
		Node(int d)
		{
			data = d;
			right = null;
			left = null;
		}
	}
	
	static class LinkedList 
	{
		Node head;
		boolean flag=true;
		public void insert(int data)
		{
			Node temp;
			Node New = new Node(data);
			if(head==null)
			{
				head = New;
			}
			else
			{
				temp = head;
				while(true)
				{
					if(data<temp.data)
					{
						if(temp.left==null)
						{
							temp.left = New;
							break;
						}
						
						else
						{
							temp = temp.left;
						}
					}
					
					else
					{
						if(temp.right==null)
						{
							temp.right = New;
							break;
						}
						
						else
						{
							temp = temp.right;
						}
					}
				}
			}
		}
		
		void inorder(Node node)
		{
			if(node==null)
			return;
			inorder(node.left);
			System.out.println(node.data+ " ");
			inorder(node.right);
		}
		
		public void search(Node node,int search)
		{
			
			if(flag)
			{
				if(node==null)
				{
					System.out.println("LinkedList is Empty");
					return;
				}
			}
			flag = false;
			if(node==null)
				{
					System.out.println(search + " is not exist in LinkedList");
					return;
				}
			
			else{
				if(node.data==search)
				{
					System.out.println("True");
					return;
				}
			}
			
			if(search<node.data)
			{
				search(node.left,search);
			}
			
			else{
				search(node.right,search);
			}
		}
		
		void display()
		{
			inorder(head);
		}
		
		void searching()
		{
			search(head,8);
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.insert(5);
		ll.insert(4);
		ll.insert(6);
		ll.insert(1);
		ll.insert(10);
		ll.insert(0);
		ll.display();
		ll.searching();
	}
}