package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Inventario;
import api.qcupeu.rest.app_salon.repository.InvetarioRepository;
import api.qcupeu.rest.app_salon.service.IInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioService implements IInventarioService {
    @Autowired
    private InvetarioRepository invetarioRepository;

    @Override
    public List<Inventario> buscarInventarios() {
        return invetarioRepository.findAll();
    }

    @Override
    public void guardar(Inventario inventario) {
        invetarioRepository.save(inventario);
    }

    @Override
    public void modificar(Inventario inventario) {
        invetarioRepository.save(inventario);
    }

    @Override
    public Optional<Inventario> buscarInventarioId(Integer id) {
        return invetarioRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        invetarioRepository.deleteById(id);
    }
}
