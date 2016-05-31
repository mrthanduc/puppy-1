package com.honguyenthaonguyen.recyclerviewdemo;

import android.util.Base64;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by NGUYEN on 5/31/2016.
 */
public class BasicAuthInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder requestBuilder = chain.request().newBuilder();

        String username = "ck_e4c748a686683244d9aab8d324cc4b11998f3c17";
        String password = "cs_f7d363ade888e259064612def92f19ad149a1cbc";
        String credentials = username + ":" + password;
        // create Base64 encodet string
        final String basic =
                "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
        requestBuilder.addHeader("Authorization", basic);
        return chain.proceed(requestBuilder.build());
    }
}
