package com.khegazy.parstagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String Key_DESCRIPTION = "Description";
    public static final String Key_Image = "Image";
    public static final String Key_USER = "User";

    public String getDescription(){
        return getString(Key_DESCRIPTION);
    }

    public void setDescription(String description){
        put(Key_DESCRIPTION, description);
    }

    public ParseFile getImage() {
        return getParseFile(Key_Image);
    }

    public void setImage(ParseFile parseFile) {
        put(Key_Image, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(Key_USER);
    }

    public void setUser(ParseUser user) {
        put(Key_USER, user);
    }
}
