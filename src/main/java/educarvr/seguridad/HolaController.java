package educarvr.seguridad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hello")
    public String hola(){
        return "Hola";
    }
    @GetMapping("/")
    public  String yo(){
        return "holaaaaaaaaaaaa";
    }
}
