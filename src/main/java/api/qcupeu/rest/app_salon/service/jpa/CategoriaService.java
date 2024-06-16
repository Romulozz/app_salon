package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.Categoria;
import api.qcupeu.rest.app_salon.repository.AccesoRepository;
import api.qcupeu.rest.app_salon.repository.CategoriaRepository;
import api.qcupeu.rest.app_salon.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService implements ICategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> buscarCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public void guardar(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void modificar(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> buscarCategoriaId(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
