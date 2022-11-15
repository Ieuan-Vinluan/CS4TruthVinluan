package exercise06truthvinluanieuan;

public class GrassType extends Monster {

	public GrassType(String name, int maxHP, int base) {
		super(name, "Grass", "Water", "Fire", maxHP, base);
		this.atk = base;
		this.def = base;
	}
	
	@Override
	public void rest() {
		this.hp += (this.maxHP / 2);
		if (this.hp > this.maxHP) this.hp = this.maxHP; // if hp is greater than maxHP, set hp to maxHP
	}
	
	@Override
	public void special() {
		this.hp += (20 / 100 * this.maxHP);
		if (this.hp > this.maxHP) this.hp = this.maxHP; // if hp is greater than maxHP, set hp to maxHP
	}
	
}
