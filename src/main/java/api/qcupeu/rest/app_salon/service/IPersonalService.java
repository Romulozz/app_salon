package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Personal;

import java.util.List;
import java.util.Optional;

public interface IPersonalService {
    List<Personal> buscarPersonal();
    void guardar(Personal personal);
    void modificar(Personal personal);
    Optional<Personal> buscarPersonalId(Integer id);
    void eliminar(Integer id);
}
