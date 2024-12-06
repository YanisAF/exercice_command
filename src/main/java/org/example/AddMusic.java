package org.example;

public class AddMusic implements Playlist{
    private ThePlaylist thePlaylist;

    public AddMusic(ThePlaylist thePlaylist){
        this.thePlaylist = thePlaylist;
    }

    @Override
    public void execute(){
        thePlaylist.addMusic();
    }
}
