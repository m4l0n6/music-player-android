package com.example.musicplayer.api;

import com.example.musicplayer.login.LoginActivity;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface SpotifyApi {

    // --- Auth Endpoint ---
    @POST("/api/auth/login")
    Call<LoginActivity.AuthTokenResponse> login(@Body LoginActivity.LoginRequest loginRequest);

    // --- Music Endpoints ---
    @POST("/api/spotify/tracks/search")
    Call<SpotifySearchResponse> searchTracks(@Body JsonObject body);

    @POST("/api/spotify/recommendations")
    Call<List<SpotifyTrack>> getRecommendations(@Body JsonObject body);

    @GET("/api/spotify/tracks/{track_id}")
    Call<SpotifyTrack> getTrackDetails(@Path("track_id") String trackId);
}
