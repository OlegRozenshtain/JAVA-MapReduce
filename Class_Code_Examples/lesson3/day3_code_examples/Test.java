package lesson3.day3_code_examples;

public class Test {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String doSomething() {

		return this.getName() + " acquired from doSomething";
		// equivalent to:
		// return getName() + " acquired from doSomething";
	}

	public static void main(String[] args) {

		Test test = new Test();

		test.setName("Moran");
		System.out.println(test.getName());
		// inside Test's Class definition - can see private members
		// test.?
				
		Test2 t2 = new Test2();

		// outside Test2's class definition - can't see private members
		//t2.?
	}
}
