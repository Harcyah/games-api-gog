package com.harcyah.games.api.gog;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stats {

    @SerializedName("achievementsPercentage")
    private Integer achievementsPercentage;

    @SerializedName("playtime")
    private Integer playtime;

    @SerializedName("lastSession")
    private String lastSession;

}
