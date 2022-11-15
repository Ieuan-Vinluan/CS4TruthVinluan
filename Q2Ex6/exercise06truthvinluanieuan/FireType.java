package exercise06truthvinluanieuan;

public class FireType extends Monster {

	public FireType(String name, int maxHP, int base) {
		super(name, "Fire", "Grass", "Water", maxHP, base);
		this.atk = (int) (1.3 * base);
		this.def = (int) (0.7 * base);
	}
	
	@Override
	public void special() {
		this.atk += 2;
		this.hp -= (10 / 100 * this.maxHP);
	}
	
}
