package com.learn2crack.recyclerjsonparsing;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RequestInterface {

    @GET("android/jsonandroid/")
    Call<JSONResponse> getJSON();
}
