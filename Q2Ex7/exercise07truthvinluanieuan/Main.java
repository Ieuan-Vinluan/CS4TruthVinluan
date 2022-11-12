package exercise07truthvinluanieuan;


public class Main {
	public static void main(String[] args) {
		Trainer cheren = new Trainer("Cheren");
		NPC testNPC = new NPC("Steven", "omg rocks wow");
		Location home = new Location("Gonzaga", "overpriced burgers");
		FireType cinderace = new FireType("ace of spades", 240, 130);
		
		cheren.inspect(cinderace);
		cheren.inspect(testNPC);
		cheren.inspect(home);
	}
}
