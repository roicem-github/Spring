import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Column

@Entity
@Table(name="PLANTS")
public class Plant {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name"NAME")
    private String name;
    @Column(name"QUANTITY")
    private Integer quantity;
    @Column(name"WATERING_FREQUENCY")
    private Integer wateringFrequency;
    @Column(name"HAS_FRUIT")
    private Boolean hasFruit;
}  
