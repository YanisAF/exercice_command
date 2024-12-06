package org.example;

public class RemoteControl {
    private Playlist playlist;

    public void setPlaylist(Playlist playlist){
        this.playlist = playlist;
    }

    public void addMusicInPlaylist(){
        if (playlist != null){
            playlist.execute();
        }else {
            System.out.println("Aucune action n'a été assigné à ce bouton");
        }
    }

    public void deleteMusicInPlaylist(){
        if (playlist == null){
            System.out.println("Playlist vide !!!!");
        }else {
            playlist.execute();
        }
    }
}
