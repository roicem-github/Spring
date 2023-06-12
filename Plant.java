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
    
    public Integer getId() {
        return this.id;
    }
    public void setId() {
        this.id = id;
    }
     public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    public void setQuantity() {
        this.quantity = quantity;
    }    
    public Integer getWateringFrequency() {
        return this.wateringFrequency;
    }
    public void setWateringFrequency() {
        this.wateringFrequency = wateringFrequency;
    }  
    public boolean getHasFruit() {
        return this.hasFruit;
    }
    public void setHasFruit() {
        this.hasFruit = hasFruit;
    }    
}  
