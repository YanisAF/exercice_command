package org.example;

public class DeleteMusic implements Playlist{
    private ThePlaylist thePlaylist;

    public DeleteMusic(ThePlaylist thePlaylist){
        this.thePlaylist = thePlaylist;
    }

    @Override
    public void execute(){
        thePlaylist.deleteMusic();
    }
}
