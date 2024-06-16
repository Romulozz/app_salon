package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Acceso;
import api.qcupeu.rest.app_salon.entity.SucursalServicio;
import api.qcupeu.rest.app_salon.repository.ISucursalServicioRepository;
import api.qcupeu.rest.app_salon.service.ISucursalServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalServicioService implements ISucursalServicioService {
    @Autowired
    private ISucursalServicioRepository sucursalServicioRepository;

    @Override
    public List<SucursalServicio> buscarSucursalServicios() {
        return sucursalServicioRepository.findAll();
    }

    @Override
    public void guardar(SucursalServicio sucursalServicio) {
        sucursalServicioRepository.save(sucursalServicio);
    }

    @Override
    public void modificar(SucursalServicio sucursalServicio) {
        sucursalServicioRepository.save(sucursalServicio);
    }

    @Override
    public Optional<SucursalServicio> buscarSucursalServicioId(Integer id) {
        return sucursalServicioRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        sucursalServicioRepository.deleteById(id);
    }
}
