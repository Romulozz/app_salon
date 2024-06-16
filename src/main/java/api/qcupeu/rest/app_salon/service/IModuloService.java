package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Modulo;
import api.qcupeu.rest.app_salon.entity.Servicio;

import java.util.List;
import java.util.Optional;

public interface IModuloService {
    List<Modulo> buscarModulo();
    void guardar(Modulo modulo);
    void modificar(Modulo modulo);
    Optional<Modulo> buscarModuloId(Integer id);
    void eliminar(Integer id);
}
