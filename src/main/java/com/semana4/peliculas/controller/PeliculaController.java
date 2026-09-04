package com.semana4.peliculas.controller;


import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.*;

 
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;

import com.semana4.peliculas.model.Pelicula;
import com.semana4.peliculas.service.PeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public List<Pelicula>  getAllPeliculas() {
        return peliculaService.getAllPeliculas();
    }

    @GetMapping("/{id}")
    public Optional<Pelicula> getPeliculaById(@PathVariable Long id) {
        return peliculaService.getPeliculaById(id);
    }
    

}
