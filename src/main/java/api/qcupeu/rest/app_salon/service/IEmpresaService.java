package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Empresa;

import java.util.List;
import java.util.Optional;

public interface IEmpresaService {
    List<Empresa> buscarEmpresas();
    void guardar(Empresa empresa);
    void modificar(Empresa empresa);
    Optional<Empresa> buscarEmpresaId(Integer id);
    void eliminar(Integer id);
}

