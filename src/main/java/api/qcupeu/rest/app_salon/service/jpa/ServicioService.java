package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Empresa;
import api.qcupeu.rest.app_salon.entity.Servicio;
import api.qcupeu.rest.app_salon.repository.EmpresaRepository;
import api.qcupeu.rest.app_salon.repository.ServicioRepository;
import api.qcupeu.rest.app_salon.service.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService implements IServicioService {
    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> buscarServicio() {
        return servicioRepository.findAll();
    }

    @Override
    public void guardar(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public void modificar(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public Optional<Servicio> buscarServicioId(Integer id) {
        return servicioRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        servicioRepository.deleteById(id);
    }
}
