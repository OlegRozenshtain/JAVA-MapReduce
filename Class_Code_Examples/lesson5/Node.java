package lesson5;

public class Node {
	
	CloudMemory cm;
	
	public Node(CloudMemory cm) {
		
		this.cm = cm;		
	}
	
	public int getCloudMemorySize() {
		
		return cm.getSize();
	}	
}
