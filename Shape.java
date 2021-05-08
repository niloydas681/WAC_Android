package WAC1;

import java.util.Scanner;

class Rectangle{
	int l,b;
	Rectangle(int l, int b){
		this.l = l;
		this.b = b;
	}
	
	void area()
	{
		System.out.println("The area of the rectangle is : "+(this.l*this.b));
	}
}

class Square{
	int s;
	Square(int s){
		this.s = s;
	}
	
	void area()
	{
		System.out.println("The area of the square is : "+(this.s*this.s));
	}
}

class Circle{
	int r;
	Circle(int r){
		this.r = r;
	}
	
	void area()
	{
		System.out.println("The area of the circle is : "+(3.14*this.r*this.r));
	}
}

class Triangle{
	int a,b,c;
	Triangle(int a, int b, int c){
		this.a = a;
		this.b=b;
		this.c=c;
	}
	
	void area()
	{
		double s = (this.a+this.b+this.c)/2;
				double area = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
		System.out.println("The area of the triangle is : "+area);
	}
}

public class Shape {
	public static void main(String[] args) {
		Rectangle ob = new Rectangle(3,4);
		ob.area();
		Square ob1 = new Square(3);
		ob1.area();
		Circle ob2 = new Circle(3);
		ob2.area();
		Triangle ob3 = new Triangle(3,4,5);
		ob3.area();
	}
}

