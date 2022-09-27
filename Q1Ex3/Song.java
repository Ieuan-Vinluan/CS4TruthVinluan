public class Song {
    String title;
    String artist;
    String playlist;
    int copiesSold;
    int yearOfRelease;
    boolean isPlaying;

    public Song(String title, String artist, String playlist, int copiesSold, int yearOfRelease) {
        this.title = title;
        this.artist = artist;
        this.playlist = playlist;
        this.copiesSold = copiesSold;
        this.yearOfRelease = yearOfRelease;
        this.isPlaying = false;
    }
    
    // if no arguments are given
    public Song() {
        title = "Single Ladies (Put a Ring on It)";
        artist = "Beyonce";
        copiesSold = 6100000;
        yearOfRelease = 2008;
        isPlaying = false;
    }

    public void describeSong() {
        System.out.printf("\n\"%s\" is a song by %s. It was released in %d and has sold around %d copies. You currently have it in %s.", title, artist, yearOfRelease, copiesSold, playlist);
    }

    public void compareCopiesSold(Song anotherSong) {
        if (copiesSold > anotherSong.copiesSold) System.out.printf("\n\"%s\" has sold more copies than \"%s.\"", title, anotherSong.title);
        else System.out.printf("\n\"%s\" has sold more copies than \"%s.\"", anotherSong.title, title);
    }

    public void compareYearOfRelease(Song anotherSong) {
        if (yearOfRelease > anotherSong.yearOfRelease) System.out.printf("\n\"%s\" was released later than \"%s.\"", title, anotherSong.title);
        else System.out.printf("\n\"%s\" was released later than \"%s.\"", anotherSong.title, title);
    }
    
    public void togglePlaying() {
        isPlaying = !isPlaying;
        if (isPlaying) System.out.printf("\n%s is now playing.", title);
        else System.out.printf("\n%s is now stopped.", title);
    }
    
    public void changePlaylist(String newPlaylist) {
        if (!newPlaylist.equals(playlist)) System.out.printf("\n%s has been moved to %s.", title, newPlaylist);
        else System.out.printf("%s is already in %S!", title, playlist);
    }
}
