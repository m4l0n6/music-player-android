package com.example.musicplayer;

public class Song {
    public String id;      // Spotify Track ID
    public String title;   // Tên bài hát
    public String artist;  // Tên ca sĩ
    public String cover;   // URL ảnh bìa
    public String audio;   // URL nhạc preview
    public String lyrics;  // Lời bài hát

    public Song(String id, String title, String artist, String cover, String audio, String lyrics) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.cover = cover;
        this.audio = audio;
        this.lyrics = lyrics;
    }
}
