package ru.netology.main;

public class PosterManager {
    private int resultLimit;
    private String[] posters = new String[0];

    public void addNewPoster(String movieName) {
        String[] tmp = new String[posters.length + 1];

        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = movieName;

        posters = tmp;
    }

    public String[] getAll() {
        return posters;
    }

    public String[] getLastMovies() {

        int actualLimit = resultLimit;  // 10
        if (resultLimit > posters.length) {
            actualLimit = posters.length; // 3
        }
        String[] results = new String[actualLimit]; // [, , ] 3

        int startIndex = posters.length - 1; // last item of posters
        int endIndex = posters.length - actualLimit; // index of last result
        int k = 0; // 0

        for (int i = startIndex; i >= endIndex; i--) {
            results[k] = posters[i]; // ["", "", ""]
            k = k + 1;
        }

        return results;
    }

    PosterManager() {
        resultLimit = 10;
    }
    PosterManager(int limit) {
        resultLimit = limit;
    }
}
