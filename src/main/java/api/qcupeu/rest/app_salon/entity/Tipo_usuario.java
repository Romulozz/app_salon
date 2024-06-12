package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "tipo_usuario")
@SQLDelete(sql = "UPDATE tipo_usuario SET status = 0 WHERE id = ?")
@Where(clause = "status = 1")
public class Tipo_usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private Integer status;

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tipo_usuario{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", status=" + status +
                '}';
    }
}
