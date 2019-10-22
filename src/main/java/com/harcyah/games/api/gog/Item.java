package com.harcyah.games.api.gog;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Item {

    @SerializedName("game")
    private Game game;

    @SerializedName("stats")
    private Map<String, Stats> stats;

}
