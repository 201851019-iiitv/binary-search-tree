

import java.util.Scanner;

public class DriverHeap {

	public static void main(String[] args) {
		BinarySearchTree ob=new BinarySearchTree();
		Scanner sc=new Scanner(System.in);
		int choice;
		int f = 1;
		while(f==1) {
		System.out.println("1.insert element\n2.delete element\n3.search element\n4.traverse array\n5.exit ");
		System.out.println("please enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("enter the element");
		          f=1;
		         Integer  value1=sc.nextInt();
		         ob.Insert(value1);
		           break;
		case 2:System.out.println(" Your deleted element is");
		Integer  x=sc.nextInt();
                  f=1;
                 ob.Delete(x);
                  System.out.println(" "+x);
                  break;
		case 3:	System.out.println("enter element which u want to search ");
			Integer value=sc.nextInt();
			ob.search(value);
			f=1;
		    break;
		
		case 4:
	     ob.traversal();
	     f=1;
	     break;
		case 5:
			 f=2;
			 break;
		  
		}}


	}

}
