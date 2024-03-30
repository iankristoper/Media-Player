package com.ian.media_player;

/**
 *
 * @author Ian Tagano
 */

public class Media_Player 
{

    public static void main(String[] args) 
    {
        Media audio = new Audio("Speak now.mp3");
        Media video = new Video("Game of thrones.mp4");
        
        
        System.out.println("Media playing: ");
        audio.play();
        video.play();
        
    }
}
