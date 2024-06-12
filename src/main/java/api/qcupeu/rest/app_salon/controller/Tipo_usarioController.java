package api.qcupeu.rest.app_salon.controller;

import api.qcupeu.rest.app_salon.entity.Tipo_usuario;
import api.qcupeu.rest.app_salon.entity.Usuario;
import api.qcupeu.rest.app_salon.service.ITipo_usuario;
import api.qcupeu.rest.app_salon.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app-salon")
public class Tipo_usarioController {
    @Autowired
    private ITipo_usuario usuario;

    @GetMapping("/tipo-usuarios")
    public List<Tipo_usuario> buscarTipoUsuario() {
        return usuario.buscarTipoUsuario();
    }

    @PostMapping("/tipo-usuarios")
    public Tipo_usuario guardar(@RequestBody Tipo_usuario tipoUsuario) {
        usuario.guardar(tipoUsuario);
        return tipoUsuario;
    }

    @PutMapping("/tipo-usuarios")
    public Tipo_usuario modificar(@RequestBody Tipo_usuario tipoUsuario){
        usuario.modificar(tipoUsuario);
        return tipoUsuario;
    }
    @GetMapping("/tipo-usuarios/{id}")
    public Optional<Tipo_usuario> buscarCitaId(@PathVariable Integer id){
        return usuario.buscarTipoUsuarioId(id);
    }

    @DeleteMapping("/tipo-usuarios/{id}")
    public String eliminar(@PathVariable Integer id){
        usuario.eliminar(id);
        return "Tipo de Usuarios eliminado";
    }
}
