package com.aprendizagem.projeto.desafionativohibrido;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jose on 11/03/17.
 */

public class Data {
    /*
    "data":{
    "first_name": "Lucio",
    "twitter": "luciocs",
    "image-uri":"http://static.vhsys.com/vh-drive/produtos/6379058/_a5c6c25.jpg"
  }
    * */
    private String firstName;
    private String twitter;
    @SerializedName("image-uri")
    private String imageUri;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
