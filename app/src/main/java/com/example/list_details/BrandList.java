package com.example.list_details;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BrandList {
    @SerializedName("data")
    List<Brand> brands;
}
