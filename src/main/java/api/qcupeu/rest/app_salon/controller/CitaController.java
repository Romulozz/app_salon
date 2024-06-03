package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.service.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class CitaController {
    @Autowired
    private ICitaService service;

    @GetMapping("/citas")
    public List<Cita> buscarCitas() {
        return service.buscarCitas();
    }

    @PostMapping("/citas")
    public Cita guardar(@RequestBody Cita cita) {
        service.guardar(cita);
        return cita;
    }

    @PutMapping("/citas")
    public Cita modificar(@RequestBody Cita cita){
        service.modificar(cita);
        return cita;
    }
    @GetMapping("/citas/{id}")
    public Optional<Cita> buscarCitaId(@PathVariable Integer id){
        return service.buscarCitaId(id);
    }

    @DeleteMapping("/citas/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Cita eliminada";
    }
}
