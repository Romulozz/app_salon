package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "sub_categoria")
@SQLDelete(sql = "UPDATE sub_categoria SET status = 0 WHERE id = ?")
@Where(clause = "status = 1")
public class SubCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    private String logo_subCategoria;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getLogo_subCategoria() {
        return logo_subCategoria;
    }

    public void setLogo_subCategoria(String logo_subCategoria) {
        this.logo_subCategoria = logo_subCategoria;
    }

    @Override
    public String toString() {
        return "SubCategoria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", status=" + status +
                ", categoria=" + categoria +
                ", logo_subCategoria='" + logo_subCategoria + '\'' +
                '}';
    }
}
