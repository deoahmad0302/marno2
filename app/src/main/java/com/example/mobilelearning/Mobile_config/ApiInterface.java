package com.example.mobilelearning.Mobile_config;

//import com.example.mobilelearning.Kursus.JawabanModel;

import com.example.mobilelearning.Kursus.KursusListAdapter;
import com.example.mobilelearning.response.LoginResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> loginUser(@Field("username") String username, @Field("password") String password);

}
