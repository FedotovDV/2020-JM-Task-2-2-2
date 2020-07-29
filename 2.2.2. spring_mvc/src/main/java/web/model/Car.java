package web.model;


//import javax.persistence.*;

//@Entity
//@Table(name = "cars")
public class Car {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "model")
    private String model;

//    @Column(name = "series")
    private int series;
//
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "car")
//    private User owner;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car(Long id, String model, int series) {
        this(model, series);
        this.id = id;
    }

    //
//    public User getOwner() {
//        return owner;
//    }
//
//    public void setOwner(User owner) {
//        this.owner = owner;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", id=" + id +
                ", model ='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}