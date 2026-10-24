package corejava.optional.demos;

import java.util.Optional;

class MyClass
{
	public String disp()
	{
		return "In disp";
	}
}

public class Test1 
{
	private static MyClass ref1=null;
	private static MyClass ref2=new MyClass();
	public static void main(String[] args) 
	{
		//in traditional method what we use to do is we check with if else 
		//to avoid nullPointerException
		//but with help of Optional<> we can avoid it easily
		//it will return Optional.Empty if ref is referring to a null
		System.out.println("************************************");
		Optional<MyClass> op1=Optional.ofNullable(ref1);//so this ref1 contains null
		System.out.println("Op1 contains: "+ref1);
		System.out.println(op1.isPresent());//false
		System.out.println();
		op1.ifPresent(k->System.out.println(k.disp()));	//
		
		
		//////////////////////////////////////////////////////////////////
		System.out.println("*******************Now for Op2  ***************");
		Optional<MyClass> op2=Optional.ofNullable(ref2);
		System.out.println("Op2 contains: "+ref2);
		op2.ifPresent(l->System.out.println(l.disp()));
		System.out.println();
		//////////////////////////////////////////////////////////////////////
		System.out.println("using orElse()");
		//as op1 is empty we can't invoke disp() of MyClass :(
		System.out.println(op1.map(MyClass::disp).orElse("Ref1 contains null"));
		
	}
}
