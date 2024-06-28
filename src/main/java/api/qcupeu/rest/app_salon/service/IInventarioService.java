package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.Inventario;

import java.util.List;
import java.util.Optional;

public interface IInventarioService {
    List<Inventario> buscarInventarios();
    void guardar(Inventario inventario);
    void modificar(Inventario inventario);
    Optional<Inventario> buscarInventarioId(Integer id);
    void eliminar(Integer id);
}
