# games-api-gog

A java parser of `https://www.gog.com/u/<user>/games/stats?sort=recent_playtime&order=desc`.

Example:

```
File file = new File("/path/to/xml");
GogService service = new GogServiceImpl();
GogGamesList games = service.getGames(file);
```
