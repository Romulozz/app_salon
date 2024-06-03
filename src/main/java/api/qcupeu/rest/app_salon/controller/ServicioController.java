package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Empresa;
import api.qcupeu.rest.app_salon.entity.Servicio;
import api.qcupeu.rest.app_salon.service.IEmpresaService;
import api.qcupeu.rest.app_salon.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class ServicioController {

    @Autowired
    private IServicioService service;

    @GetMapping("/servicios")
    public List<Servicio> buscarEmpresas() {
        return service.buscarServicio();
    }

    @PostMapping("/servicios")
    public Servicio guardar(@RequestBody Servicio servicio) {
        service.guardar(servicio);
        return servicio;
    }

    @PutMapping("/servicios")
    public Servicio modificar(@RequestBody Servicio servicio){
        service.modificar(servicio);
        return servicio;
    }
    @GetMapping("/servicios/{id}")
    public Optional<Servicio> buscarServicioId(@PathVariable Integer id){
        return service.buscarServicioId(id);
    }

    @DeleteMapping("/servicios/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Servicio eliminado";
    }
}
