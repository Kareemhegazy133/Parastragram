package com.khegazy.parstagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("F1JCZXy2W1We4WWGIZA5LkKbU4sJYOK9qGXueTPZ")
                .clientKey("pH3iy7VDdrphq3IxOfd35CjMJBQUaH73z041sD3c")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
