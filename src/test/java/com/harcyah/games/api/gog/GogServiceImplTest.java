package com.harcyah.games.api.gog;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GogServiceImplTest {

    @Test
    void testService() throws Exception {
        // Given
        String file = getClass().getResource("/games.json").getFile();
        GogService service = new GogServiceImpl();

        // When
        GogGamesList games = service.getGames(new File(file));

        // Then
        assertThat(games.getTotal()).isEqualTo(25L);

        List<Item> items = games.getEmbedded().getItems();
        assertThat(items).hasSize(25);

        Game game = items.get(0).getGame();
        assertThat(game.getTitle()).isEqualTo("No Man's Sky");

        Stats stats = items.get(0).getStats().values().iterator().next();
        assertThat(stats.getAchievementsPercentage()).isEqualTo(51);
    }

}
