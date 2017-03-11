package com.aprendizagem.projeto.desafionativohibrido;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jose on 11/03/17.
 */

public class Dados {
    /*
    POST https://hooks.zapier.com/hooks/catch/275658/mlzgvd/
{
  "experience":"mobile-dev-bh",
  "event":"untappd-checkin",
  "data":{
    "first_name": "Lucio",
    "twitter": "luciocs",
    "image-uri":"http://static.vhsys.com/vh-drive/produtos/6379058/_a5c6c25.jpg"
  }
}
    * */
    private String experience;
    private String event;
    @SerializedName("data")
    private Data data;

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
