package com.dh.meli.asperolas.controller;

import com.dh.meli.asperolas.exception.NotFoundException;
import com.dh.meli.asperolas.model.Joia;
import com.dh.meli.asperolas.service.JoiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joias")
public class JoiaController {

    @Autowired
    private JoiaService service;

    @GetMapping
    public ResponseEntity<List<Joia>> getAll(){
        return new ResponseEntity(service.getAll(), HttpStatus.OK);
    }

    @PostMapping("/inserir")
    public ResponseEntity<Joia> createJoia(@RequestBody Joia joia){
        Joia newJoia = service.create(joia);
        return new ResponseEntity(newJoia, HttpStatus.CREATED);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Joia> update(@RequestBody Joia joia, @RequestParam long id) throws NotFoundException {
        Joia updateJoia = service.update(joia, id);
        return new ResponseEntity(updateJoia, HttpStatus.OK);
    }

    @DeleteMapping("/excluir")
    public ResponseEntity<Void> deleteJoia(@RequestParam long id) throws NotFoundException {
        service.delete(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
