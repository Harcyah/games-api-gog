package com.harcyah.games.api.gog;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("url")
    private String url;

    @SerializedName("achievementSupport")
    private boolean achievementSupport;

    @SerializedName("image")
    private String image;

}
