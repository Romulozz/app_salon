package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.repository.CitaRepository;
import api.qcupeu.rest.app_salon.service.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService implements ICitaService {
    @Autowired
    private CitaRepository citaRepository;

    @Override
    public List<Cita> buscarCitas() {
        return citaRepository.findAll();
    }

    @Override
    public void guardar(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public void modificar(Cita cita) {
        citaRepository.save(cita);
    }

    @Override
    public Optional<Cita> buscarCitaId(Integer id) {
        return citaRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        citaRepository.deleteById(id);
    }

}
