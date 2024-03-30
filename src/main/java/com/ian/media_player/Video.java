package com.ian.media_player;

/**
 *
 * @author Ian Tagano
 */

public class Video extends Media
{
    //private data 
    private final String videoFile;
    
    //constructor for video class
    public Video(String videoFile)
    {
        this.videoFile = videoFile;
    }
    
    
    //method overriding 
    @Override 
    public void play()
    {
        System.out.println("Playing video file " + videoFile);
    }
}
