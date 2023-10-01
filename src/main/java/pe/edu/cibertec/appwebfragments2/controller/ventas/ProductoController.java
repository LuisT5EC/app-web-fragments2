package pe.edu.cibertec.appwebfragments2.controller.ventas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ventas/producto")
public class ProductoController {

    @GetMapping("/registrar")
    public String registrarProducto(){
        return "ventas/producto";
    }
}
