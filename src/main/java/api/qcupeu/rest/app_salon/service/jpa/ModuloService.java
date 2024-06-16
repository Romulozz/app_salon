package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Modulo;
import api.qcupeu.rest.app_salon.repository.ModuloRepository;
import api.qcupeu.rest.app_salon.service.IModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloService implements IModuloService {
    @Autowired
    private ModuloRepository moduloRepository;


    @Override
    public List<Modulo> buscarModulo() {
        return moduloRepository.findAll();
    }

    @Override
    public void guardar(Modulo modulo) {
        moduloRepository.save(modulo);
    }

    @Override
    public void modificar(Modulo modulo) {
        moduloRepository.save(modulo);
    }

    @Override
    public Optional<Modulo> buscarModuloId(Integer id) {
        return moduloRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        moduloRepository.deleteById(id);
    }
}
