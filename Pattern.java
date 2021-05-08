package WAC1;

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {

//int n=5;

//Pattern 1
//for(int i=1;i<=n;i++) {
//	for(int j=1;j<=i;j++)
//		System.out.print("* ");
//	System.out.println();
//}

//int cst=1, nst=5,row=1;
//
//while(row<=n)
//{
//	cst=1;
//	while(cst<=nst)
//	{   
//		System.out.print("* ");
//		cst++;
//	}
//	nst--;
//	row++;
//	System.out.println();
//}




//Pattern 2
//int cst=1, nst=1,row=1,n=5,csp=1,nsp=4;
//
//while(row<=n)
//{
//	csp=1;
//	while(csp<=nsp)
//	{   
//		System.out.print("  ");
//		csp++;
//	}
//	cst=1;
//	while(cst<=nst)
//	{   
//		System.out.print("* ");
//		cst++;
//	}
//	nsp--;
//	nst++;
//	row++;
//	System.out.println();
//}

	
	
//	HW Pattern 1
//	int nst=1,row=1,n=5,nsp=4;
//
//	while(row<=n)
//	{
//		int csp=1;
//		while(csp<=nsp)
//		{   
//			System.out.print(" ");
//			csp++;
//		}
//		int cst=1;
//		while(cst<=nst)
//		{   
//			System.out.print("* ");
//			cst++;
//		}
//		nsp--;
//		nst++;
//		row++;
//		System.out.println();
//	}	
//	
	
	//HW Pattern 2
	int nst=1,row=1,n=9,nsp=4;

	while(row<=n)
	{
		int csp=1;
		while(csp<=nsp)
		{   
			System.out.print(" ");
			csp++;
		}
		int cst=1;
		while(cst<=nst)
		{   
			System.out.print("* ");
			cst++;
		}
		if(row<(n/2+1)) {
			nsp--;
			nst++;
		}
		else if(row>=(n/2+1)) {
			nsp++;
			nst--;
		}
		row++;
		System.out.println();
	}	
	
//	
	
//	HW Pattern 3
//	int nst=5,row=1,n=5,nsp=1;
//
//	while(row<=n)
//	{
//		int csp=1;
//		while(csp<=nsp)
//		{   
//			System.out.print(" ");
//			csp++;
//		}
//		int cst=1;
//		while(cst<=nst)
//		{   
//			System.out.print("* ");
//			cst++;
//		}
//		nsp++;
//		nst--;
//		row++;
//		System.out.println();
//	}	
//	
	
	
	//HW Pattern 4
//		int nst=1,row=1,n=9,nsp=4;
//
//		while(row<=n)
//		{
//			int csp=1;
//			while(csp<=nsp)
//			{   
//				System.out.print("  ");
//				csp++;
//			}
//			int cst=1;
//			while(cst<=nst)
//			{   
//				System.out.print("* ");
//				cst++;
//			}
//			if(row<(n/2+1)) {
//				nsp--;
//				nst++;
//			}
//			else if(row>=(n/2+1)) {
//				nsp++;
//				nst--;
//			}
//			row++;
//			System.out.println();
//		}	
	
	
//end of main	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int nst=6,row=1,n=6,nsp=1;
//
//	while(row<=n)
//	{
//		int csp=1;
//		while(csp<=nsp)
//		{   
//			System.out.print(" ");
//			csp++;
//		}
//		int cst=row;
//		while(cst<=nst)
//		{   
//			System.out.print(cst+" ");
//			cst++;
//		}
//
//		nsp++;
//		row++;
//		System.out.println();
//	}	
//	
//	
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the size of array : ");
//	int n=sc.nextInt();
//	int arr [] = new int[n];
//	System.out.println("Enter the array elements : ");
//	for(int i=0;i<n;i++)
//		arr[i]=sc.nextInt();
//
//	System.out.println("The sub arrays are : ");
//	for (int i=0; i <n; i++) {
//		 for (int j=i; j<n; j++) {
//			 for (int k=i; k<=j; k++) {
//				 System.out.print(arr[k]+" "); 
//			 }
//			 System.out.println();      
//		 }
//		 System.out.println();  
//	}
//       
           
	
	
	
	
	
	
	
	
	
}
}