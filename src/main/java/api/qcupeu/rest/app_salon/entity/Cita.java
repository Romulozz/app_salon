package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

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
    private BigDecimal monto;
    private char metodo_pago;
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

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public char getMetodoPago() {
        return metodo_pago;
    }

    public void setMetodoPago(char metodoPago) {
        this.metodo_pago = metodoPago;
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
                ", monto=" + monto +
                ", metodoPago=" + metodo_pago +
                ", status=" + status +
                '}';
    }
}
