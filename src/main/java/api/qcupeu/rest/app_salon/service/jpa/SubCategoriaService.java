package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.SubCategoria;
import api.qcupeu.rest.app_salon.repository.AccesoRepository;
import api.qcupeu.rest.app_salon.repository.SubCategoriaRepository;
import api.qcupeu.rest.app_salon.service.ISubCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoriaService implements ISubCategoriaService {
    @Autowired
    private SubCategoriaRepository repository;

    @Override
        public List<SubCategoria> buscarSubCategorias() {
        return repository.findAll();
    }

    @Override
    public void guardar(SubCategoria subCategoria) {
        repository.save(subCategoria);
    }

    @Override
    public void modificar(SubCategoria subCategoria) {
        repository.save(subCategoria);
    }

    @Override
    public Optional<SubCategoria> buscarSubCategoriaId(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
