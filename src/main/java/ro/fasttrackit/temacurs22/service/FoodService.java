package ro.fasttrackit.temacurs22.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.temacurs22.repository.FoodRepository;
import ro.fasttrackit.temacurs22.ui.Food;

import java.util.List;
@Service
public class FoodService {
    private final FoodRepository repository;

    public FoodService(FoodRepository repository){
        this.repository = repository;
    }
    public List<Food> getAll(){
        return repository.findAll();
    }
}
