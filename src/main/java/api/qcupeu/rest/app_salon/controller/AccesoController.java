package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.service.IAccesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class AccesoController {
    @Autowired
    private IAccesoService service;

    @GetMapping("/accesos")
    public List<Acceso> buscarAccesos() {
        return service.buscarAccesos();
    }

    @PostMapping("/accesos")
    public Acceso guardar(@RequestBody Acceso acceso) {
        service.guardar(acceso);
        return acceso;
    }

    @PutMapping("/accesos")
    public Acceso modificar(@RequestBody Acceso acceso){
        service.modificar(acceso);
        return acceso;
    }
    @GetMapping("/accesos/{id}")
    public Optional<Acceso> buscarCitaId(@PathVariable Integer id){
        return service.buscarAccesoId(id);
    }

    @DeleteMapping("/accesos/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Acceso eliminado";
    }
}
