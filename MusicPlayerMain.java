import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return title + " - " + artist;
    }
}


class Playlist {
    private ArrayList<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added successfully!");
    }

    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }

        System.out.println("\n===== Playlist =====");
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }

    public void shufflePlaylist() {
        if (songs.isEmpty()) {
            System.out.println("Playlist is empty!");
            return;
        }

        Collections.shuffle(songs);
        System.out.println("Playlist shuffled successfully!");
    }

    public int getCount() {
        return songs.size();
    }
}

/* ===================== Main Class ===================== */

public class MusicPlayerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();

        int choice;

        do {
            System.out.println("\n==================================");
            System.out.println("      MUSIC PLAYLIST MANAGER");
            System.out.println("==================================");
            System.out.println("1. Add Song");
            System.out.println("2. View Playlist");
            System.out.println("3. Shuffle Playlist");
            System.out.println("4. Total Songs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Song Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    playlist.addSong(new Song(title, artist));
                    break;

                case 2:
                    playlist.displayPlaylist();
                    break;

                case 3:
                    playlist.shufflePlaylist();
                    break;

                case 4:
                    System.out.println("Total Songs: " + playlist.getCount());
                    break;

                case 5:
                    System.out.println("Thank you for using Music Playlist Manager!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
