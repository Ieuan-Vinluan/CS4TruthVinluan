public class Main {
    public static void main(String[] args) {
        // 3 instances of Subject
        Subject math = new Subject("Mathematics 4", 1.3, 10);
        Subject english = new Subject("English 4", 1.0, 10);
        Subject computerScience = new Subject("Computer Science 4", 1.0, 10);
            
        // 2 instances of Song
        Song songOne = new Song("...Baby One More Time", "Britney Spears", 10000000, 1998);
        Song songTwo = new Song("All I Want for Christmas Is You", "Mariah Carey", 16000000, 1994);
        
        // 1 instance of Singer
        Singer singerOne = new Singer("Beyonce", 226, 4500000, new Song()); // favorite song is assigned using a constructor
        singerOne.performForAudience(12); // perform for 12 people
        singerOne.favoriteSong = new Song("Lover", "Taylor Swift", 3200000, 2019); // change favorite song
    }
}
