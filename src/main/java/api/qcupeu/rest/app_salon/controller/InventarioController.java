package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.Inventario;
import api.qcupeu.rest.app_salon.service.IAccesoService;
import api.qcupeu.rest.app_salon.service.IInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class InventarioController {
    @Autowired
    private IInventarioService service;

    @GetMapping("/inventario")
    public List<Inventario> buscarInventarios() {
        return service.buscarInventarios();
    }

    @PostMapping("/inventario")
    public Inventario guardar(@RequestBody Inventario inventario) {
        service.guardar(inventario);
        return inventario;
    }

    @PutMapping("/inventario/{id}")
    public Inventario modificar(@RequestBody Inventario inventario){
        service.modificar(inventario);
        return inventario;
    }
    @GetMapping("/inventario/{id}")
    public Optional<Inventario> buscarCitaId(@PathVariable Integer id){
        return service.buscarInventarioId(id);
    }

    @DeleteMapping("/inventario/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Producto eliminado";
    }
}
