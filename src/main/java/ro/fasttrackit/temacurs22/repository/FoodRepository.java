package ro.fasttrackit.temacurs22.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.temacurs22.ui.Food;


public interface FoodRepository extends JpaRepository<Food, Integer> {

}
