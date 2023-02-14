package mx.edu.utez.ventas.models.transacciones;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "transacciones")
@NoArgsConstructor
@Getter
@Setter
public class Transacciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fecha", nullable = false, length = 50)
    private String fecha;

    public Transacciones(String fecha){
        this.fecha = fecha;
    }

    public Transacciones(long id, String fecha){
        this.id = id;
        this.fecha = fecha;
    }
}