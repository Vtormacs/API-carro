package App.Service;

import App.Entity.Entrada;
import App.Entity.Resultado;
import org.springframework.stereotype.Service;

@Service
public class CalculosService {

    public Resultado calcular(Entrada entrada) {

        Resultado resultado = new Resultado();
        Integer soma = 0;

        if (entrada.getLista() != null) {
            for (int i = 0; i < entrada.getLista().size(); i++) {
                soma += entrada.getLista().get(i);
            }

        }
        resultado.setSoma(soma);
        double media = (double) (soma/entrada.getLista().size());
        resultado.setMedia(media);
        return resultado;
    }
}
