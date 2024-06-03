package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.entity.Usuario;
import api.qcupeu.rest.app_salon.service.ICitaService;
import api.qcupeu.rest.app_salon.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class UsuarioController {

    @Autowired
    private IUsuarioService service;

    @GetMapping("/usuarios")
    public List<Usuario> buscarUsuario() {
        return service.buscarUsuario();
    }

    @PostMapping("/usuarios")
    public Usuario guardar(@RequestBody Usuario usuario) {
        service.guardar(usuario);
        return usuario;
    }

    @PutMapping("/usuarios")
    public Usuario modificar(@RequestBody Usuario usuario){
        service.modificar(usuario);
        return usuario;
    }
    @GetMapping("/usuarios/{id}")
    public Optional<Usuario> buscarCitaId(@PathVariable Integer id){
        return service.buscarUsuarioId(id);
    }

    @DeleteMapping("/usuarios/{id}")
    public String eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return "Usuario eliminado";
    }
}
