package exercise07truthvinluanieuan;


public class Main {
	public static void main(String[] args) {
		
		// Create a Trainer, Monster, NPC, and Location.
		Trainer cheren = new Trainer("Cheren");
		NPC testNPC = new NPC("Steven", "Oh. My. ROCKS!! So RIVETING!!!");
		Location home = new Location("Gonzaga", "overpriced burgers");
		Monster cinderace = new FireType("Greninja", 240, 130);
		
		// Have the Trainer interact with each.
		cheren.inspect(cinderace);
		cheren.inspect(testNPC);
		cheren.inspect(home);
	}
}
