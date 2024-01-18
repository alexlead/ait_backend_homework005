package de.aittr.g_31_2_rest.controllers;

import de.aittr.g_31_2_rest.domain.Cat;
import de.aittr.g_31_2_rest.services.CatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {

    private CatService service;

    public CatController(CatService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cat> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Cat getById(@PathVariable int id) {

        return service.getById(id);
    }

//    @GetMapping("/get")
//    public Cat getById (@RequestParam int id) {
//        return service.getById(id);
//    }

}
