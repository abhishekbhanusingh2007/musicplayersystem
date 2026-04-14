/**
 * MusicPlayerMain.java
 * Entry point and test driver for the Music Playlist Management System.
 *
 * This class:
 *  1. Creates a Playlist object
 *  2. Creates Song objects and adds them to the playlist
 *  3. Displays the original playlist order
 *  4. Shuffles the playlist using Fisher-Yates algorithm
 *  5. Displays the shuffled playlist order
 *
 * Author : Abhishek Bhanu Singh
 * ERP    : RU-25-10046
 * Course : B.Tech CSE — OOP Lab
 */
public class MusicPlayerMain {

    public static void main(String[] args) {

        // ── Print Welcome Banner ──────────────────────────────────────────
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║        Music Playlist Manager        ║");
        System.out.println("╚══════════════════════════════════════╝");

        // ── Step 1: Create a Playlist with capacity for 6 songs ───────────
        Playlist myPlaylist = new Playlist(6);

        // ── Step 2: Create Song objects and add them to the playlist ──────
        myPlaylist.addSong(new Song("Believer",        "Imagine Dragons"));
        myPlaylist.addSong(new Song("Shape of You",    "Ed Sheeran"));
        myPlaylist.addSong(new Song("Blinding Lights",  "The Weeknd"));
        myPlaylist.addSong(new Song("Levitating",       "Dua Lipa"));
        myPlaylist.addSong(new Song("Stay",             "Justin Bieber & The Kid LAROI"));
        myPlaylist.addSong(new Song("Peaches",          "Justin Bieber"));

        // ── Step 3: Display the original playlist ─────────────────────────
        System.out.println("\nPlaylist:");
        myPlaylist.displayPlaylist();

        // ── Step 4: Shuffle the playlist ──────────────────────────────────
        System.out.println("\nShuffling Playlist...\n");
        myPlaylist.shufflePlaylist();

        // ── Step 5: Display the shuffled playlist ─────────────────────────
        System.out.println("Shuffled Playlist:");
        myPlaylist.displayPlaylist();

        // ── Show total song count ─────────────────────────────────────────
        System.out.println("\nTotal songs in playlist: " + myPlaylist.getCount());
        System.out.println("\n[Program ended successfully]");
    }
}
