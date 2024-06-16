package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.SucursalServicio;

import java.util.List;
import java.util.Optional;

public interface ISucursalServicioService {
    List<SucursalServicio> buscarSucursalServicios();
    void guardar(SucursalServicio sucursalServicio);
    void modificar(SucursalServicio sucursalServicio);
    Optional<SucursalServicio> buscarSucursalServicioId(Integer id);
    void eliminar(Integer id);
}
