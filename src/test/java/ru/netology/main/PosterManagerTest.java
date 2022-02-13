package ru.netology.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {
    @Test
    public void shouldReturnAll() {
        PosterManager manager = new PosterManager();
        manager.addNewPoster("matrix");
        manager.addNewPoster("clan soprano");
        manager.addNewPoster("1+1");

        String[] expected = {"matrix", "clan soprano", "1+1"};
        String[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastPosters() {
        PosterManager manager = new PosterManager();

        manager.addNewPoster("matrix");
        manager.addNewPoster("clan soprano");
        manager.addNewPoster("1+1");

        String[] expected = {"1+1", "clan soprano", "matrix"};
        String[] actual = manager.getLastMovies();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastPostersWithLimit() {
        PosterManager manager = new PosterManager(2);

        manager.addNewPoster("matrix");
        manager.addNewPoster("clan soprano");
        manager.addNewPoster("1+1");

        String[] expected = {"1+1", "clan soprano"};
        String[] actual = manager.getLastMovies();

        assertArrayEquals(expected, actual);
    }

}