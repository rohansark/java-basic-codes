import java.util.*;
interface MyInterface{
	int var=0;
	public void foo();
}
interface MyInterface2{
	public void loo();
}
class MyClass implements MyInterface, MyInterface2{
	public void foo(){
		System.out.println("foo method call from MyClass");
	}
	public void loo(){
		System.out.println("loo method call from MyClass");
	}
}
class Driver{
	public static void main(String[] args){
		MyClass obj = new MyClass();
		obj.foo();
		obj.loo();
	}
}
