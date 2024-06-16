package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.DetallesCita;
import api.qcupeu.rest.app_salon.service.IAccesoService;
import api.qcupeu.rest.app_salon.service.IDetallesCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class DetallesCitaController {
    @Autowired
    private IDetallesCitaService service;

    @GetMapping("/detalles-cita")
    public List<DetallesCita> buscarDetallesCita() {
        return service.buscarDetallesCita();
    }

    @PostMapping("/detalles-cita")
    public DetallesCita guardar(@RequestBody DetallesCita detallesCita) {
        service.guardar(detallesCita);
        return detallesCita;
    }

    @PutMapping("/detalles-cita")
    public DetallesCita modificar(@RequestBody DetallesCita detallesCita){
        service.modificar(detallesCita);
        return detallesCita;
    }
    @GetMapping("/detalles-cita/{id}")
    public Optional<DetallesCita> buscarCitaId(@PathVariable Integer id){
        return service.buscarDetallesCitaId(id);
    }

    @DeleteMapping("/detalles-cita/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Detalles-Cita eliminado";
    }
}
