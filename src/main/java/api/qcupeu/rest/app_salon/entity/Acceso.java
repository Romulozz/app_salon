package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "acceso")
@SQLDelete(sql = "UPDATE acceso SET status = 0 WHERE id = ?")
@Where(clause = "status = 1")
public class Acceso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer status;
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo_usuario;
    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private Modulo modulo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TipoUsuario getTipoUsuario() {
        return tipo_usuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipo_usuario = tipoUsuario;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Acceso{" +
                "id=" + id +
                ", status=" + status +
                ", tipoUsuario=" + tipo_usuario +
                ", modulo=" + modulo +
                '}';
    }
}
