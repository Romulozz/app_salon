package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.SubCategoria;
import api.qcupeu.rest.app_salon.service.ISubCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class SubCategoriaController {
    @Autowired
    private ISubCategoriaService service;

    @GetMapping("/sub-categorias")
    public List<SubCategoria> buscarSubCategorias() {
        return service.buscarSubCategorias();
    }

    @PostMapping("/sub-categorias")
    public SubCategoria guardar(@RequestBody SubCategoria subCategoria) {
        service.guardar(subCategoria);
        return subCategoria;
    }

    @PutMapping("/sub-categorias")
    public SubCategoria modificar(@RequestBody SubCategoria subCategoria){
        service.modificar(subCategoria);
        return subCategoria;
    }
    @GetMapping("/sub-categorias/{id}")
    public Optional<SubCategoria> buscarCitaId(@PathVariable Integer id){
        return service.buscarSubCategoriaId(id);
    }

    @DeleteMapping("/sub-categorias/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Sub categoria eliminada";
    }
}
