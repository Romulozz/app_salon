package api.qcupeu.rest.app_salon.repository;

import api.qcupeu.rest.app_salon.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
