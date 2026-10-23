package com.example.dao;

import com.example.model.Movie;
import com.example.model.json.TmdbMovieResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface MovieDAO<T> {


    /**
     * Retrieves all movies from the data source that match the title
     *
     * @param title The title of the movie
     * @return A list of all movies that match the title
     */
    public List<T> search(String title);
}