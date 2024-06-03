package api.qcupeu.rest.app_salon.service.jpa;

import api.qcupeu.rest.app_salon.entity.Empresa;
import api.qcupeu.rest.app_salon.repository.EmpresaRepository;
import api.qcupeu.rest.app_salon.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService implements IEmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> buscarEmpresas() {
        return empresaRepository.findAll();
    }

    @Override
    public void guardar(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public void modificar(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public Optional<Empresa> buscarEmpresaId(Integer id) {
        return empresaRepository.findById(id);
    }

    @Override
    public void eliminar(Integer id) {
        empresaRepository.deleteById(id);
    }
}
