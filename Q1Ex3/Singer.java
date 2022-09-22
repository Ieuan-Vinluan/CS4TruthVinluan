public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;

    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }

    // if no arguments are given
    public Singer() {
        name = "Taylor Swift";
        noOfPerformances = 218;
        earnings = 23800000;
        favoriteSong = new Song("Lover", "Taylor Swift", 3200000, 2019);
    }

    public void performForAudience(int audience) {
        noOfPerformances += 1; // increase number of performances by 1
        earnings += 100 * audience; // increase earnings by 100 for each person
    }

    public void changeFavSong(Song song) {
        favoriteSong = song; // change favorite song
    }
}
