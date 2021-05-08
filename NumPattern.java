package WAC1;

import java.util.Scanner;

public class NumPattern {
public static void main(String[] args) {
//	int nst=1,row=1,n=5,nsp=8;
//
//	while(row<=n)
//	{
//		int csp=1;
//		while(csp<=nsp)
//		{   
//			System.out.print(" ");
//			csp++;
//		}
//		int cst=0;
//		while(cst<=nst)
//		{   
//			System.out.print(comb(row,cst)+" ");
//			cst++;
//		}
//
//		nsp--;
//		nst++;
//		row++;
//		System.out.println();
//	}	
//}
//	
//	public static int fact(int n) 
//	{
//	      int f=1;
//
//	      for(f = 1; n > 1; n--){
//	         f *= n;
//	      }
//	      return f;
//	   }
//	
//	  public static int comb(int n,int r) {
//	      return ( fact(n) / ( fact(n-r) * fact(r) ));
//	   }
//
//
//	  
	
	
	
//	  int nst=1,row=1,n=5;
//
//		while(row<=n)
//		{
//			
//			int cst=1;
//			while(cst<=nst)
//			{   
//				System.out.print(comb(row,cst)+" ");
//				cst++;
//			}
//
//			nsp--;
//			nst++;
//			row++;
//			System.out.println();
//			
//	
//			
//		}	
//	}
//	  
//	  
//	  
	  
Scanner sc= new Scanner(System.in);
System.out.println("n=");
int n=sc.nextInt();


//pattern 2
	int nst=(n/2+1),row=1,nsp=0,cst=0;

	while(row<=n)
	{
		int csp=0;
		while(csp<=nsp)
		{   
			System.out.print(" ");
			csp++;
		}
		cst=row;
		if(row<(n/2+1)) {
			while(cst<=nst)
			{   
				System.out.print(cst+" ");
				cst++;
			}
			nsp++;
		}
		else if(row>=(n/2+1)) {
			cst=n+1-row;
			while(cst<=nst)
			{   
				System.out.print(cst+" ");
				cst++;
			}
			nsp--;
		}
		row++;
		System.out.println();
	}


	//pattern 3  

//	int nst=1,row=1,nsp=0,cst=1;
//
//	while(row<=n)
//	{
//	
//		cst=1;
//		int cpy=n;
//		
//			while(cst<=nst)
//			{   
//				System.out.print(cpy+" ");
//				cpy--;
//				cst++;
//			}
//			nst++;
//			row++;
//			System.out.println();
//		}
	
	
//	pattern 4
//	int nst=1,row=1,nsp=0,cst=1,v=1;
//
//	while(row<=n)
//	{
//	
//		cst=1;
//		
//			while(cst<=nst)
//			{   
//				System.out.print(v+" ");
//				v++;
//				cst++;
//			}
//			nst++;
//			row++;
//			System.out.println();
//		}

	
	
	
	
	
	
}	
}	  
	  
