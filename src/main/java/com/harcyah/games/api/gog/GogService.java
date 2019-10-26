package com.harcyah.games.api.gog;

import java.io.File;

public interface GogService {

    GogGamesList getGames(File file) throws Exception;

}
