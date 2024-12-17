package com.login.news.api

import com.login.news.models.LoginRequest
import com.login.news.models.LoginResponse
import com.login.news.models.RegisterRequest
import com.login.news.models.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("API_BASIC/register.php")
    fun register(
        @Field("username") username: String,
        @Field("password") password: String,
        @Field("fullname") fullname: String,
        @Field("email") email: String
    ): Call<RegisterResponse>

    @FormUrlEncoded
    @POST("API_BASIC/login.php")
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Call<LoginResponse>


}