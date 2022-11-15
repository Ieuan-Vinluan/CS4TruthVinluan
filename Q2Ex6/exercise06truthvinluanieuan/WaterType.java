package exercise06truthvinluanieuan;

public class WaterType extends Monster {

	public WaterType(String name, int maxHP, int base) {
		super(name, "Water", "Fire", "Grass", maxHP, base);
		this.atk = (int) 0.7 * base;
		this.def = (int) 1.3 * base;
	}
	
	@Override
	public void special() {
		this.def += 2;
		this.hp -= (10 / 100 * this.maxHP);
	}
	
}
