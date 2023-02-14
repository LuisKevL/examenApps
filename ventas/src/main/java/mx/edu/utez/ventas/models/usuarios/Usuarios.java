package mx.edu.utez.ventas.models.usuarios;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@Getter
@Setter
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false, length = 50)
    private String name;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "password", length = 50)
    private String password;
    @Column(nullable = false, length = 50)
    private String lista_deseos;
    public Usuarios(String name, String email, String password, String lista_deseos/*, User user*/) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.lista_deseos = lista_deseos;

    }

    public Usuarios(long id, String name, String email, String password, String lista_deseos/*, User user*/) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.lista_deseos = lista_deseos;
    }
}