package App.Service;

import App.Entity.Carro;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    public String save(Carro carro) {

        return "Carro salvo com sucesso!";
    }

    public Carro findById(int id) {
        if (id == 1) {
            Carro carro = new Carro();

            carro.setNome("Palio");
            carro.setMarca("Fiat");
            carro.getModelo("Economic");
            carro.setAno(2013);

            return carro;
        } else {
            return null;
        }
    }

}
