package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Empresa;
import api.qcupeu.rest.app_salon.entity.Servicio;

import java.util.List;
import java.util.Optional;

public interface IServicioService {
    List<Servicio> buscarServicio();
    void guardar(Servicio servicio);
    void modificar(Servicio servicio);
    Optional<Servicio> buscarServicioId(Integer id);
    void eliminar(Integer id);
}
