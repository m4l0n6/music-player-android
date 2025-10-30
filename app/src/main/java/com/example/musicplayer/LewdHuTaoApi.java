// LewdHuTaoApi.java
package com.example.musicplayer;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LewdHuTaoApi {
    @GET("lyrics_endpoint")
    default // Thay bằng endpoint thật
    Call<LewdHuTaoResponse> getSongs() {
        return null;
    }
}
