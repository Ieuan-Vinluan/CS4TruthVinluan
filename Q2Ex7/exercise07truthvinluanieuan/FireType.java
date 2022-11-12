package exercise07truthvinluanieuan;

public class FireType extends Monster {

	public FireType(String name, int maxHP, int base) {
		super(name, "Fire", "Grass", "Water", maxHP, base);
		this.setAtk((int) (1.3 * base));
		this.setDef((int) (0.7 * base));
	}
	
	@Override
	public void special() {
		this.setAtk(this.getAtk() + 2);
		this.setHp(this.getHP() - 10 / 100 * this.getMaxHP());
	}
	
}
