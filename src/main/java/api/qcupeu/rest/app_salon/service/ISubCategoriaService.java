package api.qcupeu.rest.app_salon.service;

import api.qcupeu.rest.app_salon.entity.SubCategoria;

import java.util.List;
import java.util.Optional;

public interface ISubCategoriaService {
    List<SubCategoria> buscarSubCategorias();
    void guardar(SubCategoria subCategoria);
    void modificar(SubCategoria subCategoria);
    Optional<SubCategoria> buscarSubCategoriaId(Integer id);
    void eliminar(Integer id);
}
