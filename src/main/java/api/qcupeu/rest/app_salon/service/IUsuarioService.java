package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> buscarUsuario();
    void guardar(Usuario usuario);
    void modificar(Usuario usuario);
    Optional<Usuario> buscarUsuarioId(Integer id);
    void eliminar(Integer id);
}
