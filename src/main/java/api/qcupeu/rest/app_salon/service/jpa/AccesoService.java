package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.repository.AccesoRepository;
import api.qcupeu.rest.app_salon.service.IAccesoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccesoService implements IAccesoService {
    @Autowired
    private AccesoRepository accesoRepository;

    @Override
    public List<Acceso> buscarAccesos() {
        return accesoRepository.findAll();
    }

    @Override
    public void guardar(Acceso acceso) {
        accesoRepository.save(acceso);
    }

    @Override
    public void modificar(Acceso acceso) {
        accesoRepository.save(acceso);
    }

    @Override
    public Optional<Acceso> buscarAccesoId(Integer id) {
        return accesoRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        accesoRepository.deleteById(id);
    }
}
