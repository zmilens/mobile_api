package com.example.list_details;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("brands")
    Observable<BrandList> brands();

    @GET("brands/{ocpc}")
    Observable<BrandDetail> brand(@Path("ocpc") String ocpc);

}
