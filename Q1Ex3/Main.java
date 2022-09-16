public class Main {

    public static void main(String[] args) {

        Subject math = new Subject("Mathematics 4", 1.3, 10);
        Subject english = new Subject("English 4", 1.0, 10);
        Subject computerScience = new Subject("Computer Science 4", 1.0, 10);

        Song songOne = new Song("...Baby One More Time", "Britney Spears", 10000000, 1998);
        Song songTwo = new Song("All I Want for Christmas Is You", "Mariah Carey", 16000000, 1994);

        Singer singerOne = new Singer("Beyonce", 226, 4500000, new Song());
        singerOne.performForAudience(12);
        singerOne.favoriteSong = new Song("Lover", "Taylor Swift", 3200000, 2019);
    }
}
