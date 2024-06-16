package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "detalles_cita")
@SQLDelete(sql = "UPDATE detalles_cita SET status = 0 WHERE id = ?")
@Where(clause = "status = 1")
public class DetallesCita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private Integer status;
    @ManyToOne
    @JoinColumn(name = "cita_id")
    private Cita Cita;

    @ManyToOne
        @JoinColumn(name = "sucursal_servicio_id")
    private SucursalServicio sucursalServicio;

    @ManyToOne
    @JoinColumn(name = "personal_id")
    private Personal personal;

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

    public api.qcupeu.rest.app_salon.entity.Cita getCita() {
        return Cita;
    }

    public void setCita(api.qcupeu.rest.app_salon.entity.Cita cita) {
        Cita = cita;
    }

    public SucursalServicio getSucursalServicio() {
        return sucursalServicio;
    }

    public void setSucursalServicio(SucursalServicio sucursalServicio) {
        this.sucursalServicio = sucursalServicio;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "DetallesCita{" +
                "id=" + id +
                ", status=" + status +
                ", Cita=" + Cita +
                ", sucursalServicio=" + sucursalServicio +
                ", personal=" + personal +
                '}';
    }
}
