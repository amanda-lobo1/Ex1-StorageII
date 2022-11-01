package com.dh.meli.asperolas.service;

import com.dh.meli.asperolas.exception.NotFoundException;
import com.dh.meli.asperolas.model.Joia;

import java.util.List;
import java.util.Optional;

public interface IJoia {
    List<Joia> getAll();
    Joia create(Joia joia);
    void delete(long id) throws NotFoundException;
    Joia update(Joia updateJoia, long id) throws NotFoundException;
}
