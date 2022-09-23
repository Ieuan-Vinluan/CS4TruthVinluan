public class Song {
    private String title;
    private String artist;
    private String playlist;
    private int copiesSold;
    private int yearOfRelease;
    private boolean isPlaying = false;

    public Song(String title, String artist, String playlist, int copiesSold, int yearOfRelease) {
        this.title = title;
        this.artist = artist;
        this.playlist = playlist;
        this.copiesSold = copiesSold;
        this.yearOfRelease = yearOfRelease;
    }
    
    // if no arguments are given
    public Song() {
        title = "Single Ladies (Put a Ring on It)";
        artist = "Beyonce";
        playlist = "Beyonce songs";
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

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
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
    
    public boolean isPlaying() {
        return isPlaying;
    }
    
    public void togglePlaying() {
            isPlaying = !isPlaying;
            if (isPlaying) System.out.printf("\n%s is now playing.", title);
            else System.out.printf("\n%s is now stopped.", title);
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
    
    public void changePlaylist(String newPlaylist) {
        if (!newPlaylist.equals(playlist)) System.out.printf("\n%s has been moved to %s.", title, newPlaylist);
        else System.out.printf("%s is already in %S!", title, playlist);
    }
}