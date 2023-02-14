package mx.edu.utez.ventas.controllers.productos.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.ventas.models.productos.Productos;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductosDto {
    private long id;

    @NotNull
    @NotBlank
    @Length(min = 1, max = 150)
    private String name;
    private String category;
    private String precio;
    private Boolean disponibilidad;

    public Productos castProductos(){
        return new Productos(
                this.id,
                this.name,
                this.category,
                this.precio,
                this.disponibilidad,
                null
        );
    }
}
