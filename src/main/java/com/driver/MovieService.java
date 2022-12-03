package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public void addMovie(Movie movie){
        movieRepository.saveMovie(movie);
    }
    public void addDirector(Director director){
        movieRepository.saveDirector(director);
    }
    public void createDirectorMoviePair(String movie, String director){
        movieRepository.saveMovieDirectorPair(movie, director);
    }
    public Movie findMovie(String movie){
        return movieRepository.findMovie(movie);
    }
    public Director findDirector(String director){
        return movieRepository.findDirector(director);
    }
    public List<String> findMoviesByDirectorName(String director){
        return movieRepository.findMovieOfDirector(director);
    }
    public List<String> findAllMovies(){
        return movieRepository.findAllMovie();
    }
    public void removeDirectorByName(String director){
        movieRepository.deleteDirector(director);
    }
    public void removeAllDirectors(){
        movieRepository.deleteAllDirector();
    }
}
