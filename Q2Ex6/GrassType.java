package exercise06truthvinluanieuan;

public class GrassType extends Monster {

	public GrassType(String name, int maxHP, int base) {
		super(name, "Grass", "Water", "Fire", maxHP, base);
		
		/* There is no need to set the values for the atk and def values of the GrassType
		 * becausee it has already been set in the SimpleMonster class.
		 */
	}
	
	public void rest() {
		this.setHp(this.getHP() + 50 / 100 * this.getMaxHP());
	}
	
	@Override
	public void special() {
		this.setHp(this.getHP() + 20 / 100 * this.getMaxHP());
	}
	
}
