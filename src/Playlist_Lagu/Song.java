package Playlist_Lagu;

class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song currentSong = head;
            while (currentSong.next != null) {
                currentSong = currentSong.next;
            }
            currentSong.next = newSong;
        }
    }

    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist anda kosong.");
            return;
        }
        Song currentSong = head;
        System.out.println("Tyler Fan Playlist");
        while (currentSong != null) {
            System.out.println(currentSong.title);
            currentSong = currentSong.next;
        }
    }
}