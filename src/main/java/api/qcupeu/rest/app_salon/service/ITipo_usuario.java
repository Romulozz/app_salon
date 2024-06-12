package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Tipo_usuario;
import api.qcupeu.rest.app_salon.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface ITipo_usuario {
    List<Tipo_usuario> buscarTipoUsuario();
    void guardar(Tipo_usuario tipoUsuario);
    void modificar(Tipo_usuario tipoUsuario);
    Optional<Tipo_usuario> buscarTipoUsuarioId(Integer id);
    void eliminar(Integer id);
}
