package mx.edu.utez.ventas.controllers.productos;

import mx.edu.utez.ventas.services.productos.ProductosService;
import mx.edu.utez.ventas.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api-ventass/productos")
@CrossOrigin(origins = {"*"})
public class ProductosController {
    @Autowired
    private ProductosService service;

    @GetMapping("/")
    public ResponseEntity<CustomResponse<List>Productos>>>getAll(){

    }
    @PostMapping("/")
    // URL: http://localhost:8080/api-firstapp/category/
    public ResponseEntity<CustomResponse<Category>> insert(@RequestBody CategoryDto category, @Valid BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(
                    new CustomResponse<>(null, true, 400, "The category already exists"),
                    HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(
                this.service.insert(category.castToCategory()), HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    // URL: http://localhost:8080/api-firstapp/category/{id}
    public ResponseEntity<CustomResponse<Category>> update(@PathVariable("id") Long id, @RequestBody CategoryDto category, @Valid BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(
                    new CustomResponse<>(null, true, 400, "The category already exists"),
                    HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(
                this.service.update(category.castToCategory()), HttpStatus.OK
        );
    }
    @PatchMapping("/{id}")
    // URL: http://localhost:8080/api-firstapp/category/{id}
    public ResponseEntity<CustomResponse<Boolean>> patch(@PathVariable("id") Long id, @RequestBody CategoryDto category, @Valid BindingResult result) {
        if (result.hasErrors()) {
            return new ResponseEntity<>(
                    new CustomResponse<>(null, true, 400, "The category already exists"),
                    HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(
                this.service.changeStatus(category.castToCategory()), HttpStatus.OK
        );
    }
}


}
