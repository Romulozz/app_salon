package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.DetallesCita;

import java.util.List;
import java.util.Optional;

public interface IDetallesCitaService {
    List<DetallesCita> buscarDetallesCita();
    void guardar(DetallesCita detallesCita);
    void modificar(DetallesCita detallesCita);
    Optional<DetallesCita> buscarDetallesCitaId(Integer id);
    void eliminar(Integer id);
}
