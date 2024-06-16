package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Personal;
import api.qcupeu.rest.app_salon.repository.PersonalRepository;
import api.qcupeu.rest.app_salon.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalService implements IPersonalService {
    @Autowired
    private PersonalRepository personalRepository;


    @Override
    public List<Personal> buscarPersonal() {
        return personalRepository.findAll();
    }

    @Override
    public void guardar(Personal personal) {
        personalRepository.save(personal);
    }

    @Override
    public void modificar(Personal personal) {
        personalRepository.save(personal);
    }

    @Override
    public Optional<Personal> buscarPersonalId(Integer id) {
        return personalRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        personalRepository.deleteById(id);
    }
}
