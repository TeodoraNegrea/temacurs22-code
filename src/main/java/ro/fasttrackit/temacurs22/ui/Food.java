package ro.fasttrackit.temacurs22.ui;

import javax.persistence.*;
import java.util.List;

@Entity
public class Food {
    @Id
    @GeneratedValue
    private int id;
    @Column
    @ElementCollection(targetClass = String.class)
    private List<String> products;
    private DaysOfWeek daysOfWeek;

    public Food(){
    }

    public Food(List<String> products,DaysOfWeek daysOfWeek){
        this.products = products;
        this.daysOfWeek = daysOfWeek;
    }
    public int getId() {
        return id;
    }
    public List<String> getProducts() {
        return products;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }
}
