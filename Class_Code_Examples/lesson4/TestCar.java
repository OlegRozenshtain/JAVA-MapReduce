package lesson4;

public class TestCar {

	public static void main(String[] args) {
		
		Engine engine = new Engine(2100, 220);
		
		FastCar fastCar1 = new FastCar("White", engine);
		
		fastCar1.drive(45);
		
		FastCar fastCar2 = new FastCar("Red", engine);
		fastCar2.stopDriving();
		System.out.println(fastCar2.toString());
		
		SlowCar slowCar = new SlowCar();
				
		Car[] cars = new Car[4];
		
		cars[0] = slowCar;
		cars[1] = fastCar1;
		cars[2] = fastCar2;
		cars[3] = new SlowCar();		
		
		SlowCar sc = (SlowCar)cars[3];
		
		slowCar.drive(14);
		fastCar1.drive(23);
		fastCar2.drive(65);
		sc.drive(222);
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].drive(i+10);
			
		fastCar1.move(1,4);
		}		
	}
}
