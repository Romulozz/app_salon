package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Table(name = "cita")
@SQLDelete(sql = "UPDATE cita SET status = 0 WHERE id = ?")
@Where(clause = "status = 1")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private LocalDateTime fecha;
    private LocalDateTime hora;
    private char metodo_pago;
    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private Servicio servicio;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public char getMetodoPago() {
        return metodo_pago;
    }

    public void setMetodoPago(char metodoPago) {
        this.metodo_pago = metodoPago;
    }

    public char getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(char metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", metodo_pago=" + metodo_pago +
                ", servicio=" + servicio +
                ", status=" + status +
                '}';
    }
}
