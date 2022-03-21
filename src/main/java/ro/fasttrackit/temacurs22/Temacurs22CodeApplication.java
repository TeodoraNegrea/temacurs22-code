package ro.fasttrackit.temacurs22;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.temacurs22.repository.FoodRepository;
import ro.fasttrackit.temacurs22.ui.Food;

import java.util.List;

import static ro.fasttrackit.temacurs22.ui.DaysOfWeek.*;

@SpringBootApplication
public class Temacurs22CodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Temacurs22CodeApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartUp(FoodRepository repository){
        return args -> {
            repository.saveAll(List.of(
                new Food(List.of("Lapte","Cereale","Orez cu legume","Gris cu lapte"), MONDAY),
                new Food(List.of("Oua fierte cu avocado","Mazare cu carne","Clatite americane cu unt de arahide"), TUESDAY),
                new Food(List.of("Terci de ovaz","Tocanita de cartofi","Fructe"), WEDNESDAY),
                new Food(List.of("Paine cu ou","Dovlecel pane cu pilaf de orez","Chec cu lapte"), THURSDAY),
                new Food(List.of("Budinca de chia","Linte cu soia","Prajitura cu mere"), FRIDAY),
                new Food(List.of("Omleta","Placinta cu branza","Mamaliga cu lapte"), SATURDAY),
                new Food(List.of("Ochiuri de oua cu bacon","Cartofi si carne la cuptor","Prajitura cu nuca"),SUNDAY)

            ));
        };
    }
}
