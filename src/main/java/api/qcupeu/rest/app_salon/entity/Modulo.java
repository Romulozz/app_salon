package api.qcupeu.rest.app_salon.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "modulo")
@SQLDelete(sql = "UPDATE modulo SET status = 0 WHERE id = ?")
@Where(clause = "status = 1")
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String modulo;
    private String segmento;
    private String url;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", modulo='" + modulo + '\'' +
                ", segmento='" + segmento + '\'' +
                ", url='" + url + '\'' +
                ", status=" + status +
                '}';
    }
}
