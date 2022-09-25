public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
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
	
	public static int getTotalPerformances() {
		return totalPerformances;
	}

	public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
        Singer.totalPerformances += noOfPerformances;
    }

    // if no arguments are given
    public Singer() {
        name = "Taylor Swift";
        noOfPerformances = 218;
        earnings = 23800000;
        favoriteSong = new Song("Lover", "Taylor Swift", 3200000, 2019);
        Singer.totalPerformances += noOfPerformances;
    }

    public void performForAudience(int audience) {
        noOfPerformances += 1;
        Singer.totalPerformances += 1;
        earnings += 100 * audience;
    }
    
    // if performing with another singer
    public void performForAudience(int audience, Singer singer) {
    	noOfPerformances += 1;
    	singer.noOfPerformances += 1;
    	Singer.totalPerformances += 2;
    	
    	// profits are split equally
    	earnings += (100 * audience) / 2;
    	singer.earnings += (100 * audience) / 2;
    }

    public void changeFavSong(Song song) {
        favoriteSong = song;
    }
}
