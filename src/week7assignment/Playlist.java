package week7assignment;

public class Playlist {
    private final String[] songs;
    private final int capacity;
    private int count;

    public Playlist(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        this.capacity = capacity;
        this.songs = new String[capacity];
        this.count = 0;
    }

    public void addSong(String song) {
        if (song == null) {
            return;
        }
        if (count >= capacity) {
            System.out.println("Rejected: playlist is full.");
            return;
        }
        songs[count] = song;
        count++;
    }

    public int getSongCount() {
        return count;
    }

    public String[] getSongs() {
        String[] copy = new String[count];
        for (int i = 0; i < count; i++) {
            copy[i] = songs[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        System.out.println(p.getSongs()[0]);
        System.out.println(p.getSongs()[1]);
        System.out.println(p.getSongCount());
    }
}
