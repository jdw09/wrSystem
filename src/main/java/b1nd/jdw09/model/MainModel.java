package b1nd.jdw09.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "washer")
@Getter
@Setter

public class MainModel
{
    @Id
    int id;
    String name;
    String location;
    String time;
    boolean using;

    public Boolean getUsing() {
        return using;
    }
}
