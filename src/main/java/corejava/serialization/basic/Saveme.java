package corejava.serialization.basic;

import java.io.*;
class Part implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int val;
	public Part()
	{
		System.out.println("in Part constructor");
	}
	public void setVal(int val)
	{
		this.val=val;
	}
	public int getVal()
	{
		return val;
	}
	
}
class base implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int var;
	
	public base()
	{
		System.out.println("in base constructor");
	}
	public void setVar(int var)
	{
		this.var=var;
	}
	public int getVar()
	{
		return var;
	}
}
public class Saveme extends base 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int num;
	private Part part=new Part();
	public Saveme()
	{
		System.out.println("in saveme const");
		
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public Part getPart()
	{
		return part;
	}
	
  
}