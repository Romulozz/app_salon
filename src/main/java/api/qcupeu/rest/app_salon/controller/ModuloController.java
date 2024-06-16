package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.entity.Modulo;
import api.qcupeu.rest.app_salon.service.ICitaService;
import api.qcupeu.rest.app_salon.service.IModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class ModuloController {
    @Autowired
    private IModuloService service;

    @GetMapping("/modulos")
    public List<Modulo> buscarCitas() {
        return service.buscarModulo();
    }

    @PostMapping("/modulos")
    public Modulo guardar(@RequestBody Modulo modulo) {
        service.guardar(modulo);
        return modulo;
    }

    @PutMapping("/modulos")
    public Modulo modificar(@RequestBody Modulo modulo){
        service.modificar(modulo);
        return modulo;
    }
    @GetMapping("/modulos/{id}")
    public Optional<Modulo> buscarModuloId(@PathVariable Integer id){
        return service.buscarModuloId(id);
    }

    @DeleteMapping("/modulos/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Modulo eliminado";
    }
}


