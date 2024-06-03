package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Empresa;
import api.qcupeu.rest.app_salon.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class EmpresaController {
    @Autowired
    private IEmpresaService service;

    @GetMapping("/empresas")
    public List<Empresa> buscarEmpresas() {
        return service.buscarEmpresas();
    }

    @PostMapping("/empresas")
    public Empresa guardar(@RequestBody Empresa empresa) {
        service.guardar(empresa);
        return empresa;
    }

    @PutMapping("/empresas")
    public Empresa modificar(@RequestBody Empresa empresa){
        service.modificar(empresa);
        return empresa;
    }
    @GetMapping("/empresas/{id}")
    public Optional<Empresa> buscarEmpresaId(@PathVariable Integer id){
        return service.buscarEmpresaId(id);
    }

    @DeleteMapping("/empresas/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Empresa eliminada";
    }

}
