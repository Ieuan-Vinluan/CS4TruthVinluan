package exercise06truthvinluanieuan;

public class WaterType extends Monster {

	public WaterType(String name, int maxHP, int base) {
		super(name, "Water", "Fire", "Grass", maxHP, base);
		this.setAtk((int) (0.7 * base));
		this.setDef((int) (1.3 * base));
	}
	
	@Override
	public void special() {
		this.setDef(this.getDef() + 2);
		this.setHp(this.getHP() - 10 / 100 * this.getMaxHP());
	}
	
}
