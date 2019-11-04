package com.example.composite;

/**
 * @author Abraham Ginting (abraham.ginting@dana.id)
 * @version CompositeDemo, v 0.1 2019-11-04 20:13 by Abraham Ginting
 */
public class CompositeDemo {

    public static StringBuffer compositeBuilder = new StringBuffer();

    public static void main(String[] args) {
        Directory music = new Directory("MUSIC");
        Directory scorpions = new Directory("SCORPIONS");
        Directory dio = new Directory("DIO");

        File track1 = new File("Don't worry, be happy.mp3");
        File track2 = new File("track2.m3u");
        File track3 = new File("Wind of change.mp3");
        File track4 = new File("Big city night.mp3");
        File track5 = new File("Rainbow in the dark.mp3");

        music.add(track1);
        music.add(scorpions);
        music.add(track2);

        scorpions.add(track3);
        scorpions.add(track4);
        scorpions.add(dio);

        dio.add(track5);

        music.ls();
    }
}
