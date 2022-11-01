package com.dh.meli.asperolas.service;

import com.dh.meli.asperolas.exception.NotFoundException;
import com.dh.meli.asperolas.model.Joia;
import com.dh.meli.asperolas.repository.JoiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JoiaService implements IJoia{

    @Autowired
    private JoiaRepository repository;


    @Override
    public List<Joia> getAll() {
        return repository.findAll();
    }

    @Override
    public Joia create(Joia joia) {
        Joia newJoia = repository.save(joia);
        return newJoia;
    }

    @Override
    public void delete(long id) throws NotFoundException {
        repository.deleteById(id);
    }

    @Override
    public Joia update(Joia updateJoia, long id) throws NotFoundException{
        Optional<Joia> optionalJoia = repository.findById(id);

        if (!repository.findById(id).isPresent()){
            throw new NotFoundException("Not Found!");
        }
        Joia newJoia = optionalJoia.get();

        if (updateJoia.getPeso() != null){
            newJoia.setPeso(updateJoia.getPeso());
        }

        if (updateJoia.getMaterial() != null){
            newJoia.setMaterial(updateJoia.getMaterial());
        }

        if (updateJoia.getQuilates() != null){
            newJoia.setQuilates(updateJoia.getQuilates());
        }

        return repository.save(newJoia);
    }
}
