package App.Controller;

import App.Entity.Entrada;
import App.Entity.Resultado;
import App.Service.CalculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculosController {

    @Autowired//faz que seja instaciedo um unico objeto para essa aplicacao, vai alocar uma vez na memoria
    private CalculosService calculosService;

    @GetMapping("/calcular")
    public ResponseEntity<Resultado> calcular( @RequestBody Entrada entrada) {
        try {
            Resultado resultado = this.calculosService.calcular(entrada);
            return new ResponseEntity<Resultado>(resultado, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
