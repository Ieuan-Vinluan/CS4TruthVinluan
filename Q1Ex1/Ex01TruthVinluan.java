public class Ex01TruthVinluan {
	String name;
	int wins;
	String city;
	public static void main(String[] args) {
		Ex01TruthVinluan schoolOne = new Ex01TruthVinluan();
		schoolOne.name = "Ateneo de Manila University";
		schoolOne.wins = 14;
		schoolOne.city = "Quezon City";
		
		Ex01TruthVinluan schoolTwo = new Ex01TruthVinluan();
		schoolTwo.name = "University of the Philippines";
		schoolTwo.wins = 9;
		schoolTwo.city = "Quezon City";
		
		Ex01TruthVinluan schoolThree = new Ex01TruthVinluan();
		schoolThree.name = "University of Santo Tomas";
		schoolThree.wins = 8;
		schoolThree.city = "Manila City";
		
		System.out.println("School 1\nName: " + schoolOne.name + "\nWins: " + schoolOne.wins + "\nCity: " + schoolOne.city + "\n");
		System.out.println("School 2\nName: " + schoolTwo.name + "\nWins: " + schoolTwo.wins + "\nCity: " + schoolTwo.city + "\n");
		System.out.println("School 3\nName: " + schoolThree.name + "\nWins: " + schoolThree.wins + "\nCity: " + schoolThree.city + "\n");
		
		int totalWins = schoolOne.wins + schoolTwo.wins + schoolThree.wins; // (operation: addition)
		boolean moreWins = schoolOne.wins > schoolTwo.wins; // (operation: comparison)
		boolean sameCity = (schoolOne.city.equals(schoolTwo.city)) && (schoolTwo.city.equals(schoolThree.city)); // (operation: comparison)
		
		System.out.println("Total Wins: " + totalWins + " // (operation: addition)\nAteneo de Manila University has more wins than University of the Philippines: " + moreWins + " // (operation: comparison)\nAll three schools are located in the same city: " + sameCity + " // (operation: comparison)");
	}
	
}
