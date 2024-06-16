package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Acceso;

import java.util.List;
import java.util.Optional;

public interface IAccesoService {
    List<Acceso> buscarAccesos();
    void guardar(Acceso acceso);
    void modificar(Acceso acceso);
    Optional<Acceso> buscarAccesoId(Integer id);
    void eliminar(Integer id);
}
