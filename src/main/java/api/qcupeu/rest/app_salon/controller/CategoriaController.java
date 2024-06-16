package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.Categoria;
import api.qcupeu.rest.app_salon.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class CategoriaController {
    @Autowired
    private ICategoriaService service;

    @GetMapping("/categorias")
    public List<Categoria> buscarCategorias() {
        return service.buscarCategorias();
    }

    @PostMapping("/categorias")
    public Categoria guardar(@RequestBody Categoria categoria) {
        service.guardar(categoria);
        return categoria;
    }

    @PutMapping("/categorias")
    public Categoria modificar(@RequestBody Categoria categoria){
        service.modificar(categoria);
        return categoria;
    }
    @GetMapping("/categorias/{id}")
    public Optional<Categoria> buscarCitaId(@PathVariable Integer id){
        return service.buscarCategoriaId(id);
    }

    @DeleteMapping("/categorias/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Categoria eliminada";
    }
}
