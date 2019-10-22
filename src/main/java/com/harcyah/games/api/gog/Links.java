package com.harcyah.games.api.gog;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Links {

    @SerializedName("self")
    private Href self;

    @SerializedName("first")
    private Href first;

    @SerializedName("last")
    private Href last;

}
