package com.intecap.tarea4.model.dao;

import com.intecap.tarea4.model.ArticuloEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticuloDAO extends JpaRepository<ArticuloEntity,Long> {
}
