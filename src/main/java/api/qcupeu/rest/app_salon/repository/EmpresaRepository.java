package api.qcupeu.rest.app_salon.repository;

import api.qcupeu.rest.app_salon.entity.Empresa;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
