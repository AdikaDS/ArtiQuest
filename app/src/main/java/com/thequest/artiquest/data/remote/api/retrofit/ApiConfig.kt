package com.thequest.artiquest.data.remote.api.retrofit

import com.thequest.artiquest.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiConfig {
    companion object {
        fun getApiService(): ApiService {
//            val authInterceptor = Interceptor { chain ->
//                val req = chain.request()
//                val requestHeaders = req.newBuilder()
//                    .addHeader("Authorization", "token ${BuildConfig.API_KEY}")
//                    .build()
//                chain.proceed(requestHeaders)
//            }
//            val client = OkHttpClient.Builder()
//                .addInterceptor(authInterceptor)
//                .build()
            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
//                .client(client)
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}