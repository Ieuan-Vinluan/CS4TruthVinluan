public class Ex01TruthVinluan {
	String name;
	int wins;
	String location;
	public static void main(String[] args) {
		Ex01TruthVinluan schoolOne = new Ex01TruthVinluan();
		schoolOne.name = "Ateneo de Manila University";
		schoolOne.wins = 14;
		schoolOne.location = "Quezon City";
		
		Ex01TruthVinluan schoolTwo = new Ex01TruthVinluan();
		schoolTwo.name = "University of the Philippines";
		schoolTwo.wins = 9;
		schoolTwo.location = "Quezon City";
		
		Ex01TruthVinluan schoolThree = new Ex01TruthVinluan();
		schoolThree.name = "University of Santo Tomas";
		schoolThree.wins = 8;
		schoolThree.location = "Manila City";
		
		System.out.println("School 1\nName: " + schoolOne.name + "\nWins: " + schoolOne.wins + "\nLocation: " + schoolOne.location + "\n");
		System.out.println("School 2\nName: " + schoolTwo.name + "\nWins: " + schoolTwo.wins + "\nLocation: " + schoolTwo.location + "\n");
		System.out.println("School 3\nName: " + schoolThree.name + "\nWins: " + schoolThree.wins + "\nLocation: " + schoolThree.location + "\n");
		
		int totalWins = schoolOne.wins + schoolTwo.wins + schoolThree.wins; // (operation: addition)
		boolean moreWins = schoolOne.wins > schoolTwo.wins; // (operation: comparison)
		boolean sameCity = (schoolOne.location.equals(schoolTwo.location)) && (schoolTwo.location.equals(schoolThree.location)); // (operation: comparison)
		
                System.out.println("Total Wins: " + totalWins + " // (operation: addition)");
                System.out.println("Ateneo de Manila University has more wins than University of the Philippines: " + moreWins + " // (operation: comparison)");
                System.out.println("All three schools are located in the same city: " + sameCity + " // (operation: comparison)");
	}
	
}
