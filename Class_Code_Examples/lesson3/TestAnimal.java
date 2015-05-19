
package lesson3;

public class TestAnimal {
	
	int[] aad = new int[5];
	
	public static void main(String[] args) {
					
		final Animal aa = new Animal ("Zebra", "White and Black", 4, true);
		
		Animal bb = new Animal();
		
		//aa=bb;
	
		System.out.println(aa);	
		
		System.out.println(aa);
		
		String s1 = new String ("Hello");
		String s2 = "Hello";
		
		if(s1.equals(s2)){
			
			System.out.println("equals");			
		}
		else {
			System.out.println("not equals");
		}
		
		//s1 = s2;	
		
		/*

		System.out.println(Animal.getAnimalCount());
		
		Animal a1 = new Animal();
		
		System.out.println(Animal.getAnimalCount());
		
		Animal a2 = new Animal("Zebra");
		
		System.out.println(Animal.getAnimalCount());
		
		Animal a3 = new Animal("Lion", "White");
		Animal a4 = new Animal("Tigris", "White", 2);
		
		System.out.println(Animal.getAnimalCount());
		
		int[] times;
		
		times = new int[5];
		
		for (int i = 0; i < times.length; i++) {
			times[i] = i;
		}
		
		//System.out.println(times);
		
		//String[] words = {"Hello", "World", "I", "Feel", "Great"};
		//int[] ar = {1, 4, 5, 6};

		//System.out.println(words);
		
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
		}
		
		a4.alterArray(times);
		
		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
		}
		
		System.out.println(times[2]);
		
		a4.alterInteger(times[2]);
		
		System.out.println(times[2]);
		
		a4.getColor();
		
		a4.alterArray(times);
				
		int a = 4;
		
		double b = (double)a;
		
		FourLeggedAnimal fla1 = new FourLeggedAnimal();
		FourLeggedAnimal fla2 = new FourLeggedAnimal();
		FourLeggedAnimal fla3 = new FourLeggedAnimal();
		FourLeggedAnimal fla4 = new FourLeggedAnimal();
		FourLeggedAnimal fla5 = new FourLeggedAnimal();
		FourLeggedAnimal fla6 = new FourLeggedAnimal();
		
		*/		
		
		Dog d1 = new Dog();	
	}	
}
