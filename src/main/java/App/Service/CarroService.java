package App.Service;

import App.Entity.Carro;
import App.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public String save(Carro carro) {

        this.carroRepository.save(carro);

        return "Carro salvo com sucesso!";
    }

    public Carro findById(Long id) {
        Optional<Carro> carro =this.carroRepository.findById(id);
        return carro.get();
    }

}
