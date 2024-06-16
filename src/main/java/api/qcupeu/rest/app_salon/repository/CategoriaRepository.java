package api.qcupeu.rest.app_salon.repository;

import api.qcupeu.rest.app_salon.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
