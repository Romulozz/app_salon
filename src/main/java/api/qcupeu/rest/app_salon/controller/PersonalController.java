package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Personal;
import api.qcupeu.rest.app_salon.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class PersonalController {
    @Autowired
    private IPersonalService service;

    @GetMapping("/personal")
    public List<Personal> buscarPersonal(){
        return service.buscarPersonal();
    }

    @PostMapping("/personal")
    public Personal guardar(@RequestBody Personal personal){
        service.guardar(personal);
        return personal;
    }

    @PutMapping("/personal")
    public Personal modificar(@RequestBody Personal personal){
        service.modificar(personal);
        return personal;
    }

    @GetMapping("/personal/{id}")
    public Optional<Personal> buscarPersonalId(@PathVariable Integer id){
        return service.buscarPersonalId(id);
    }

    @DeleteMapping("/personal/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Personal eliminado";
    }
}
