package com.example.dkang.rxandroidexample;

import com.example.dkang.rxandroidexample.models.Current;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by dkang on 15/04/16.
 */
public interface WeatherService {

    @GET("weather?")
    Observable<Current> getCurrent(@Query("q") String city);
}
