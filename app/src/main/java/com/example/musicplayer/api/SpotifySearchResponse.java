
package com.example.musicplayer.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SpotifySearchResponse {
    @SerializedName("tracks")
    public List<SpotifyTrack> tracks;

    @SerializedName("total")
    public int total;
}
