package com.harcyah.games.api.gog;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class GogServiceImpl implements GogService {

    private final Gson gson;

    public GogServiceImpl() {
        this.gson = new Gson();
    }

    @Override
    public GogGamesList getGames(File file) throws Exception {
        try (FileReader reader = new FileReader(file, StandardCharsets.UTF_8)) {
            return gson.fromJson(reader, GogGamesList.class);
        }
    }

}
