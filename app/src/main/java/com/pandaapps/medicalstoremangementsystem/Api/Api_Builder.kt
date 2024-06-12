package com.pandaapps.medicalstoremangementsystem.Api

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface Api_Builder {


    @GET("/getAllUsers")
    suspend fun getAllUser(): UserTest

    @FormUrlEncoded
    @POST("/createUser")
    suspend fun createUser(

        @Field("name") name: String,
        @Field("password") password: String,
        @Field("email") email: String,
        @Field("address") address: String,
        @Field("phone") phone: String,
        @Field("pincode") pinCode: String

    ): Response<UserCreateResponse>

    companion object {
        const val BASE_URL = "http://muhammadaban.pythonanywhere.com"
    }


}