public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    public static int totalPerformances = 0;

    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        totalPerformances += noOfPerformances;
    }

    // if no arguments are given
    public Singer() {
        name = "Taylor Swift";
        noOfPerformances = 218;
        earnings = 23800000;
        favoriteSong = new Song("Lover", "Taylor Swift", "flop", 3200000, 2019);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public void setFavoriteSong(Song favoriteSong) {
        this.favoriteSong = favoriteSong;
    }

    public void performForAudience(int audience) {
        noOfPerformances += 1; // increase number of performances by 1
        earnings += 100 * audience; // increase earnings by 100 for each person
    }
    
    public void performForAudience(Singer anotherSinger, int audience) {
        noOfPerformances += 1; // increase number of performances by 1
        earnings += 100 * audience; // increase earnings by 100 for each person
        
        anotherSinger.noOfPerformances += 1; // increase number of performances by 1
        anotherSinger.earnings += 100 * audience; // increase earnings by 100 for each person
    }

    public void changeFavSong(Song song) {
        favoriteSong = song; // change favorite song
    }
}
