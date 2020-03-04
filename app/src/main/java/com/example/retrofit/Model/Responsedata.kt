package com.example.retrofit.Model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class Responsedata(
    @SerializedName("args")
    val args: Args,
    @SerializedName("data")
    val `data`: String,
    @SerializedName("files")
    val files: Files,
    @SerializedName("form")
    val form: Form,
    @SerializedName("headers")
    val headers: Headers,
    @SerializedName("json")
    val json: Any,
    @SerializedName("url")
    val url: String
) {
    @Keep
    class Args(
    )

    @Keep
    class Files(
    )

    @Keep
    class Form(
    )

    @Keep
    data class Headers(
        @SerializedName("accept")
        val accept: String,
        @SerializedName("accept-encoding")
        val acceptEncoding: String,
        @SerializedName("accept-language")
        val acceptLanguage: String,
        @SerializedName("authorization")
        val authorization: String,
        @SerializedName("cache-control")
        val cacheControl: String,
        @SerializedName("content-length")
        val contentLength: String,
        @SerializedName("content-type")
        val contentType: String,
        @SerializedName("cookie")
        val cookie: String,
        @SerializedName("host")
        val host: String,
        @SerializedName("origin")
        val origin: String,
        @SerializedName("postman-token")
        val postmanToken: String,
        @SerializedName("sec-fetch-dest")
        val secFetchDest: String,
        @SerializedName("sec-fetch-mode")
        val secFetchMode: String,
        @SerializedName("sec-fetch-site")
        val secFetchSite: String,
        @SerializedName("user-agent")
        val userAgent: String,
        @SerializedName("x-forwarded-port")
        val xForwardedPort: String,
        @SerializedName("x-forwarded-proto")
        val xForwardedProto: String
    )
}