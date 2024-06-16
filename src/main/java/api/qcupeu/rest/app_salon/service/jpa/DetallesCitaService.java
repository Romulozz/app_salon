package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.DetallesCita;
import api.qcupeu.rest.app_salon.repository.AccesoRepository;
import api.qcupeu.rest.app_salon.repository.DetallesCitaRepository;
import api.qcupeu.rest.app_salon.service.IDetallesCitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesCitaService implements IDetallesCitaService {
    @Autowired
    private DetallesCitaRepository detallesCitaRepository;

    @Override
    public List<DetallesCita> buscarDetallesCita() {
        return detallesCitaRepository.findAll();
    }

    @Override
    public void guardar(DetallesCita detallesCita) {
        detallesCitaRepository.save(detallesCita);
    }

    @Override
    public void modificar(DetallesCita detallesCita) {
        detallesCitaRepository.save(detallesCita);
    }

    @Override
    public Optional<DetallesCita> buscarDetallesCitaId(Integer id) {
        return detallesCitaRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        detallesCitaRepository.deleteById(id);
    }
}
