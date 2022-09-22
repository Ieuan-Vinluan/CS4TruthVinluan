public class Song {
    String title;
    String artist;
    int copiesSold;
    int yearOfRelease;

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
