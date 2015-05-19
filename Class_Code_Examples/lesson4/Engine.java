package lesson4;

public class Engine {
	
	private final int CC;
	private final int HP;
	
	public Engine(int cc, int hp) {

		CC = cc;
		HP = hp;
	}
	
	public Engine(Engine e) {
		
		CC = e.CC;
		HP = e.HP;
	}
		
	public int getCc() {
		return CC;
	}

	public int getHp() {
		return HP;
	}

	@Override
	public String toString() {
		return "Engine [CC=" + CC + ", HP=" + HP + "]";
	}	
}
