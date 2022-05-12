package com.santarelle.movie.controllers;

import com.santarelle.movie.dto.MovieDTO;
import com.santarelle.movie.dto.ScoreDTO;
import com.santarelle.movie.services.MovieService;
import com.santarelle.movie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        return scoreService.saveScore(dto);
    }

}
