import java.util.*;
 abstract class Shape{
	public abstract void noofsides();
	}
class Rectangle extends Shape{
	public void noofsides(){
		System.out.println("Number of sides of reactangle is 4");
		}
	}
class Triangle extends Shape{
	public void noofsides(){
		System.out.println("Number of sides of triangle is 3");
		}
	}
class Hexagon extends Shape{
	public void noofsides(){
		System.out.println("Number of sides of hexagon is 6.");
		}
	}
class Test{
	public static void main(String[] args){
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		r.noofsides();
		t.noofsides();
		h.noofsides();
		}
	}
	
	
