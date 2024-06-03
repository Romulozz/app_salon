package api.qcupeu.rest.app_salon.service;


import api.qcupeu.rest.app_salon.entity.Sucursal;
import java.util.List;
import java.util.Optional;

public interface ISucursalService {
    List<Sucursal> buscarSucursal();
    void guardar(Sucursal sucursal);
    void modificar(Sucursal sucursal);
    Optional<Sucursal> buscarSucursalId(Integer id);
    void eliminar(Integer id);
}
