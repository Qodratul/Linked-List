package Playlist_Lagu;

public class PlaylistRun {
    public static void main(String[] args) {
        Playlist yourPlaylist = new Playlist();

        yourPlaylist.addSong("EARFQUAKE - Tyler, The Creator");
        yourPlaylist.addSong("BEST INTEREST - Tyler, The Creator");
        yourPlaylist.addSong("A BOY IS A GUN* - Tyler, The Creator");
        yourPlaylist.addSong("NEW MAGIC WAND - Tyler, The Creator");
        yourPlaylist.addSong("See You Again (feat.Kali Uchis) - Tyler, The Creator");

        yourPlaylist.displayPlaylist();
    }
}