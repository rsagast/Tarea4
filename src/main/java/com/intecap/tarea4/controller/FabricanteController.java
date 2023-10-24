package com.intecap.tarea4.controller;

import com.intecap.tarea4.model.FabricanteEntity;
import com.intecap.tarea4.response.FabricanteResponseRest;
import com.intecap.tarea4.service.IFabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/tarea4")
public class FabricanteController {

    @Autowired
    private IFabricanteService fabricanteService;

    @GetMapping("/fabricantes")
    public ResponseEntity<FabricanteResponseRest> darFabricantes(){
         return fabricanteService.buscarFabricante();
    }

    @GetMapping("/fabricantes/{id}")
    public ResponseEntity<FabricanteResponseRest> darFabricantesId(@PathVariable Long id){
        return fabricanteService.buscarFabricanteId(id);
    }

    @PostMapping("/fabricantes")
    public ResponseEntity<FabricanteResponseRest> crearFabricante(@RequestBody FabricanteEntity request){
        return fabricanteService.crearFabricante(request);
    }

    @PutMapping("/fabricantes/{id}")
    public ResponseEntity<FabricanteResponseRest> actualizarFabricante(@RequestBody FabricanteEntity request, @PathVariable Long id){
        return fabricanteService.actualizarFabricante(request,id);
    }

    @DeleteMapping("/fabricantes/{id}")
    public ResponseEntity<FabricanteResponseRest> eliminarFabricante(@PathVariable Long id){
        return fabricanteService.eliminarFabricante(id);
    }

}