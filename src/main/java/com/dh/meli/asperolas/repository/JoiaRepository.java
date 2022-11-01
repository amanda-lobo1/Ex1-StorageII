package com.dh.meli.asperolas.repository;

import com.dh.meli.asperolas.model.Joia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoiaRepository extends JpaRepository<Joia, Long> {
}
