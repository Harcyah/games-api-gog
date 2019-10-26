package com.harcyah.games.api.gog;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;

public class GogServiceImpl implements GogService {

    private final Gson gson;

    public GogServiceImpl() {
        this.gson = new Gson();
    }

    @Override
    public GogGamesList getGames(File file) throws Exception {
        FileReader reader = new FileReader(file);
        return gson.fromJson(reader, GogGamesList.class);
    }

}
