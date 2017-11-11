package com.regent.tech.bitcoin_converter;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by root on 11/11/17.
 */

interface MainService {
    @GET("price")
    Call<ResponseBody> exchangeRate(
            @Query("fsym") String crypto,
            @Query("tsyms") String other
    );
}
