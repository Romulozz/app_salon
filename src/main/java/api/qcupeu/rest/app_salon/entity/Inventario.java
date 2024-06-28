package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import java.math.BigDecimal;

@Entity
@Table(name = "inventario")
@SQLDelete(sql = "UPDATE inventario SET status = 0 WHERE id = ?")
@Where(clause = "status = 1")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private Integer cantidad;
    private BigDecimal precio;
    private Integer status;
    @ManyToOne
    @JoinColumn(name = "sucursalServicio_id")
    private SucursalServicio sucursalServicio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SucursalServicio getSucursalServicio() {
        return sucursalServicio;
    }

    public void setSucursalServicio(SucursalServicio sucursalServicio) {
        this.sucursalServicio = sucursalServicio;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", status=" + status +
                ", sucursalServicio=" + sucursalServicio +
                '}';
    }
}
