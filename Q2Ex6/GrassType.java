package exercise06truthvinluanieuan;

public class GrassType extends Monster {

	public GrassType(String name, int maxHP, int base) {
		super(name, "Grass", "Water", "Fire", maxHP, base);
		this.setAtk(base);
		this.setDef(base);
	}
	
	@Override
	public void rest() {
		this.setHp(this.getHP() + 1 / 2 * this.getMaxHP());
		if (this.getHP() > this.getMaxHP()) this.setHp(this.getMaxHP()); // if hp is greater than maxHP, set hp to maxHP
	}
	
	@Override
	public void special() {
		this.setHp(this.getHP() + 20 / 100 * this.getMaxHP());
		if (this.getHP() > this.getMaxHP()) this.setHp(this.getMaxHP()); // if hp is greater than maxHP, set hp to maxHP
	}
	
}
