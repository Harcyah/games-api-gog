package com.harcyah.games.api.gog;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GogServiceImpl implements GogService {

    private static final Gson GSON = new Gson();

    private final GogGamesList games;

    public GogServiceImpl(String path) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        this.games = GSON.fromJson(reader, GogGamesList.class);
    }

    @Override
    public GogGamesList getGames() {
        return games;
    }

}
