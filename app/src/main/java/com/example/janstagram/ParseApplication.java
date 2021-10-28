package com.example.janstagram;
import com.parse.Parse;
import com.parse.ParseObject;
import android.app.Application;

    public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
        @Override
        public void onCreate() {
                super.onCreate();

                ParseObject.registerSubclass(Post.class);
                Parse.initialize(new Parse.Configuration.Builder(this)
                        .applicationId("VoNE2f4UzspAsE7Cet9qlO1hHoxlM5cPmkiwWY0m")
                        .clientKey("eNs6VIXKAlz4IxB9zBEsQpMcAh7QWRJ75T2O0CUd")
                        .server("https://parseapi.back4app.com")
                        .build()
                );
            }
    }

