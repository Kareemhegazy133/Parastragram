package com.khegazy.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("F1JCZXy2W1We4WWGIZA5LkKbU4sJYOK9qGXueTPZ")
                .clientKey("pH3iy7VDdrphq3IxOfd35CjMJBQUaH73z041sD3c")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
