package com.example;

import com.example.dao.JsonMovieDAO;
import com.example.dao.MovieDAO;
import com.example.dao.MovieDAOFactory;
import com.example.dao.XmlMovieDAO;

import java.util.List;

public class Main {
    static void main() {
        MovieDAO movieDAO = MovieDAOFactory.getMovieDAO();
        String searchTitle = "Pokemon"; // TODO: Implement the UserInput class
        if(movieDAO instanceof XmlMovieDAO) {
            XmlMovieDAO xmlMovieDAO = (XmlMovieDAO) movieDAO;
            List<com.example.model.xml.MovieSearchResult> results = xmlMovieDAO.search(searchTitle);
            System.out.println("Found " + results.size() + " results for '" + searchTitle + "'.");
            results.forEach(System.out::println);
        } else if(movieDAO instanceof JsonMovieDAO) {
            JsonMovieDAO jsonMovieDAO = (JsonMovieDAO) movieDAO;
            List<com.example.model.json.MovieSearchResult> results = jsonMovieDAO.search(searchTitle);
            System.out.println("Found " + results.size() + " results for '" + searchTitle + "'.");
            results.forEach(System.out::println);
        }
    }
}

