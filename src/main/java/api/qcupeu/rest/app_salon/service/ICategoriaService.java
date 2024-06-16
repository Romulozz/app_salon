package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService{
    List<Categoria> buscarCategorias();
    void guardar(Categoria categoria);
    void modificar(Categoria categoria);
    Optional<Categoria> buscarCategoriaId(Integer id);
    void eliminar(Integer id);
}
