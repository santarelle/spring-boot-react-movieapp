package com.santarelle.movie.services;

import com.santarelle.movie.dto.MovieDTO;
import com.santarelle.movie.entities.Movie;
import com.santarelle.movie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(MovieDTO::new);
        return page;
    }

    public MovieDTO findById(Long id) {
        Movie result = repository.findById(id).get();
        MovieDTO movie = new MovieDTO(result);
        return movie;
    }
}
