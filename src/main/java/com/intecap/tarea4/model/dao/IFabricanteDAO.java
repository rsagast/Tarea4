package com.intecap.tarea4.model.dao;

import com.intecap.tarea4.model.FabricanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFabricanteDAO extends JpaRepository<FabricanteEntity,Long> {
}
