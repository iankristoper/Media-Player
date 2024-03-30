package com.ian.media_player;

/**
 *
 * @author Ian Tagano
 */

//new class for audio and it inherits the base class
public class Audio extends Media
{
    //private data 
    private final String audioFile;
    
    //constructor for the audio class
    public Audio(String audioFile)
    {
        this.audioFile = audioFile;
    }
    
    
    //method overriding 
    @Override 
    public void play()
    {
        System.out.println("Playing audio file " + audioFile);
    }
}
