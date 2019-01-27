package project05;

public class Text {

	public static void main(String[] args) {
		
		DoubleCycleNode node1=new DoubleCycleNode(1);
		DoubleCycleNode node2=new DoubleCycleNode(2);
		DoubleCycleNode node3=new DoubleCycleNode(3);
	
        node1.append(node2);
        node2.append(node3);
        node3.append(node1);
        System.out.println(node2.getPre().getData());
        System.out.println(node2.getData());
        System.out.println(node2.getNext().getData());
        System.out.println(node3.getNext().getData());
        
	}

}
