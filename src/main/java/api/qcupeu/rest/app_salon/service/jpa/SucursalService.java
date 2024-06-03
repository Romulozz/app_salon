package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Sucursal;
import api.qcupeu.rest.app_salon.repository.SucursalRepository;
import api.qcupeu.rest.app_salon.service.ISucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalService implements ISucursalService {
    @Autowired
    private SucursalRepository sucursalRepository;

    @Override
    public List<Sucursal> buscarSucursal() {
        return sucursalRepository.findAll();
    }

    @Override
    public void guardar(Sucursal sucursal) {
        sucursalRepository.save(sucursal);
    }

    @Override
    public void modificar(Sucursal sucursal) {
        sucursalRepository.save(sucursal);
    }

    @Override
    public Optional<Sucursal> buscarSucursalId(Integer id) {
        return sucursalRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        sucursalRepository.deleteById(id);
    }
}
