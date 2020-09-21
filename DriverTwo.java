import java.util.*;
class ClassOne{
	public void foo(){
		System.out.println("classOne method called");
	}
}
class DriverTwo extends ClassOne{
	
	public void foo(){
		super.foo();
		System.out.println("classTwo method called");
	}
	public static void main(String[] args){
		DriverTwo cl = new DriverTwo();
		cl.foo();
		ClassOne cl2 = new ClassOne();
		cl2.foo();
	}
}