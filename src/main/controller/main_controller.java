import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * main_controller
 */
@Controller
public class main_controller {

    @GetMapping("/")
    public String holaMundo(){
        return "Hola Mundo";
    }
}