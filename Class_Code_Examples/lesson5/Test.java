package lesson5;

public class Test {

	public static void main(String[] args) {
		
		CloudMemory cm = new CloudMemory(2048);
		
		Node cluster[] = new Node[5]; 

		for (int i = 0; i < cluster.length; i++) {
			
			cluster[i] = new Node(cm);
		}
		
		System.out.println(cluster[0].getCloudMemorySize());
		System.out.println(cluster[4].getCloudMemorySize());

		cm.setSize(4096);
		
		System.out.println(cluster[0].getCloudMemorySize());
		
		
		for (int i = 0; i < cluster.length; i++) {
			System.out.println(cluster[i].cm);
		}
	}
}
