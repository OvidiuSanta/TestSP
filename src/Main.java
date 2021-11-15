public class Main {
    public static void main(String[] args) {
        MediaPlayer MyPlayer = new MediaPlayer("MyYoutubb");

        Playlist MyPlaylist = new Playlist("Favorite");
        Videoclip video1 = new Videoclip("Stana Cartoons", 2048);
        MyPlaylist.add(video1);
        MyPlaylist.addPlaylistElement("www.google.com/melodii/oscar-scuze/32");
        MyPlaylist.addPlaylistElement("www.google.com/GIF/Party/10");

        MyPlayer.addElement(MyPlaylist);
        MyPlayer.print();
    }
}
