package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.entity.Sucursal;
import api.qcupeu.rest.app_salon.service.ICitaService;
import api.qcupeu.rest.app_salon.service.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class SucursalController {
    @Autowired
    private ISucursalService service;

    @GetMapping("/sucursales")
    public List<Sucursal> buscarSucursal() {
        return service.buscarSucursal();
    }

    @PostMapping("/sucursales")
    public Sucursal guardar(@RequestBody Sucursal sucursal) {
        service.guardar(sucursal);
        return sucursal;
    }

    @PutMapping("/sucursales")
    public Sucursal modificar(@RequestBody Sucursal sucursal){
        service.modificar(sucursal);
        return sucursal;
    }
    @GetMapping("/sucursales/{id}")
    public Optional<Sucursal> buscarSucursalId(@PathVariable Integer id){
        return service.buscarSucursalId(id);
    }

    @DeleteMapping("/sucursales/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Sucursal eliminada";
    }
}
