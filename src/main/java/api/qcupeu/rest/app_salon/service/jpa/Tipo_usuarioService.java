package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Sucursal;
import api.qcupeu.rest.app_salon.entity.Tipo_usuario;
import api.qcupeu.rest.app_salon.repository.SucursalRepository;
import api.qcupeu.rest.app_salon.repository.Tipo_UsuarioRepository;
import api.qcupeu.rest.app_salon.service.ITipo_usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Tipo_usuarioService implements ITipo_usuario {
    @Autowired
    private Tipo_UsuarioRepository tipoUsuarioRepository;

    @Override
    public List<Tipo_usuario> buscarTipoUsuario() {
        return tipoUsuarioRepository.findAll();
    }

    @Override
    public void guardar(Tipo_usuario tipoUsuario) {
        tipoUsuarioRepository.save(tipoUsuario);
    }

    @Override
    public void modificar(Tipo_usuario tipoUsuario) {
        tipoUsuarioRepository.save(tipoUsuario);
    }

    @Override
    public Optional<Tipo_usuario> buscarTipoUsuarioId(Integer id) {
        return tipoUsuarioRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        tipoUsuarioRepository.deleteById(id);
    }
}
