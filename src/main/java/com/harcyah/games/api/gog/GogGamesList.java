package com.harcyah.games.api.gog;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GogGamesList {

    @SerializedName("page")
    private int page;

    @SerializedName("limit")
    private int limit;

    @SerializedName("pages")
    private int pages;

    @SerializedName("total")
    private int total;

    @SerializedName("_links")
    private Links links;

    @SerializedName("_embedded")
    private Embedded embedded;

}
