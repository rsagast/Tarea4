package com.intecap.tarea4.response;

import com.intecap.tarea4.model.FabricanteEntity;

import java.util.List;

public class FabricanteResponse {
    private List<FabricanteEntity> fabricanteEntityList;

    public List<FabricanteEntity> getFabricanteEntityList() {
        return fabricanteEntityList;
    }

    public void setFabricanteEntityList(List<FabricanteEntity> fabricanteEntityList) {
        this.fabricanteEntityList = fabricanteEntityList;
    }
}
