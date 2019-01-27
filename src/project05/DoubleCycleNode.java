package project05;

public class DoubleCycleNode {
	
	//Ë«ÏòÑ­»·Á´±í
	
	private DoubleCycleNode pre=this;
	
	private DoubleCycleNode next=this;
	
	private int data;
	
	public DoubleCycleNode(int data)
	{
		this.data=data;
	}
	
	public void append(DoubleCycleNode node)
	{
		this.next=node;
		node.pre=this;
	}
	
	public int getData()
	{
		return data;
	}
	
	public DoubleCycleNode getPre()
	{
		return pre;
	}
	
	public DoubleCycleNode getNext()
	{
		return next;
	}
}
