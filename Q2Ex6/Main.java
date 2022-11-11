package exercise06truthvinluanieuan;


public class Main {
	public static void main(String[] args) {
		
		// create Monsters
		WaterType swampert = new WaterType("Seismitoad", 404, 110);
		FireType blaziken = new FireType("Infernape", 270, 480);
		GrassType kartana = new GrassType("Ferrothorn", 220, 181);
		
		// water vs fire
		while (swampert.getHP() > 0 && blaziken.getHP() > 0) {
			blaziken.attack(swampert);
			if (swampert.getHP() <= 0) break; // if one of the Monsters faint, then the loop ends
			swampert.attack(blaziken);
			if (blaziken.getHP() <= 0) break;
		}
		
		System.out.println("\n");
		// set Monsters' health back to max to prepare for future battles
		swampert.setHp(swampert.getMaxHP());
		blaziken.setHp(blaziken.getMaxHP());
		
		// fire vs grass
		while (blaziken.getHP() > 0 && kartana.getHP() > 0) {
			kartana.attack(blaziken);
			if (blaziken.getHP() <= 0) break;
			blaziken.attack(kartana);
			if (kartana.getHP() <= 0) break;
		}
		
		System.out.println("\n");
		// set Monsters' health back to max to prepare for future battles
		blaziken.setHp(blaziken.getMaxHP());
		kartana.setHp(kartana.getMaxHP());
		
		// grass vs water
		while (kartana.getHP() > 0 && swampert.getHP() > 0) {
			kartana.attack(swampert);
			if (swampert.getHP() <= 0) break;
			swampert.attack(kartana);
			if (kartana.getHP() <= 0) break;
		}
	}
}
