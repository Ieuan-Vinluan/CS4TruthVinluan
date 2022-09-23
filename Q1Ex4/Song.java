public class Song {
    private String title;
    private String artist;
    private int copiesSold;
    private int yearOfRelease;

    public Song(String title, String artist, int copiesSold, int yearOfRelease) {
        this.title = title;
        this.artist = artist;
        this.copiesSold = copiesSold;
        this.yearOfRelease = yearOfRelease;
    }
    
    // if no arguments are given
    public Song() {
        title = "Single Ladies (Put a Ring on It)";
        artist = "Beyonce";
        copiesSold = 6100000;
        yearOfRelease = 2008;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void describeSong() {
        System.out.printf("\n\"%s\" is a song by %s. It was released in %d and has sold around %d copies.", title, artist, yearOfRelease, copiesSold);
    }

    public void compareCopiesSold(Song anotherSong) {
        if (copiesSold > anotherSong.copiesSold) System.out.printf("\n\"%s\" has sold more copies than \"%s.\"", title, anotherSong.title);
        else System.out.printf("\n\"%s\" has sold more copies than \"%s.\"", anotherSong.title, title);
    }

    public void compareYearOfRelease(Song anotherSong) {
        if (yearOfRelease > anotherSong.yearOfRelease) System.out.printf("\n\"%s\" was released later than \"%s.\"", title, anotherSong.title);
        else System.out.printf("\n\"%s\" was released later than \"%s.\"", anotherSong.title, title);
    }
}