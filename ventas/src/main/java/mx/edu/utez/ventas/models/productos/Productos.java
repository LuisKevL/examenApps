package mx.edu.utez.ventas.models.productos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "Productos") // This tells Hibernate to name the table "categories"
@NoArgsConstructor // This tells Lombok to generate a constructor with no parameters
@AllArgsConstructor // This tells Lombok to generate a constructor with all parameters
@Setter // This tells Lombok to generate setters for all fields
@Getter // This tells Lombok to generate getters for all fields
public class Productos {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
    private long id;
    @Column(nullable = false, length = 150, unique = true)
    private String name;
    @Column(nullable = false, length = 150, unique = true)
    private String category;
    @Column(nullable = false, length = 150, unique = true)
    private String precio;
    @Column(name = "disponibilidad", nullable = false, columnDefinition = "tinyint default 1") // This makes the status field not nullable and sets the default value to 1
    private Boolean disponibilidad;

    public Productos(long id, String name, String category, String precio, Boolean disponibilidad, Object o) {
    }
}
