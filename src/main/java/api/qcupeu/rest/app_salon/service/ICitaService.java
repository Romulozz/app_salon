package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Cita;

import java.util.List;
import java.util.Optional;

public interface ICitaService {
    List<Cita> buscarCitas();
    void guardar(Cita cita);
    void modificar(Cita cita);
    Optional<Cita> buscarCitaId(Integer id);
    void eliminar(Integer id);
}
