package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "simple_date")
public class SimpleDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "only_date")
    private LocalDate onlyDate;

    @Column(name = "only_time")
    private LocalTime localTime;

    @Column(name = "date_with_time")
    private LocalDateTime dateWithTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getOnlyDate() {
        return onlyDate;
    }

    public void setOnlyDate(LocalDate onlyDate) {
        this.onlyDate = onlyDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public LocalDateTime getDateWithTime() {
        return dateWithTime;
    }

    public void setDateWithTime(LocalDateTime dateWithTime) {
        this.dateWithTime = dateWithTime;
    }
}
