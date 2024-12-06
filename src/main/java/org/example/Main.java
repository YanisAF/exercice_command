package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ThePlaylist playlistDeBase = new ThePlaylist();
        Playlist addMusic = new AddMusic(playlistDeBase);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setPlaylist(addMusic);
        remoteControl.addMusicInPlaylist();

        Playlist deleteMusic = new DeleteMusic(playlistDeBase);
        remoteControl.setPlaylist(deleteMusic);
        remoteControl.deleteMusicInPlaylist();


    }
}