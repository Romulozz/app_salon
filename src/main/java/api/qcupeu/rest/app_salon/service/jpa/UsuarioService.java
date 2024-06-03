package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Cita;
import api.qcupeu.rest.app_salon.entity.Usuario;
import api.qcupeu.rest.app_salon.repository.CitaRepository;
import api.qcupeu.rest.app_salon.repository.UsuarioRepository;
import api.qcupeu.rest.app_salon.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> buscarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void guardar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void modificar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> buscarUsuarioId(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
