package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.entity.SucursalServicio;
import api.qcupeu.rest.app_salon.service.ICitaService;
import api.qcupeu.rest.app_salon.service.ISucursalServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class SucursalServicioController {
    @Autowired
    private ISucursalServicioService service;

    @GetMapping("/sucursal-servicio")
    public List<SucursalServicio> buscarSucursalServicio() {
        return service.buscarSucursalServicios();
    }

    @PostMapping("/sucursal-servicio")
    public SucursalServicio guardar(@RequestBody SucursalServicio sucursalServicio) {
        service.guardar(sucursalServicio);
        return sucursalServicio;
    }

    @PutMapping("/sucursal-servicio")
    public SucursalServicio modificar(@RequestBody SucursalServicio sucursalServicio){
        service.modificar(sucursalServicio);
        return sucursalServicio;
    }
    @GetMapping("/sucursal-servicio/{id}")
    public Optional<SucursalServicio> buscarCitaId(@PathVariable Integer id){
        return service.buscarSucursalServicioId(id);
    }

    @DeleteMapping("/sucursal-servicio/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Sucursal-Servicio eliminada";
    }
}
