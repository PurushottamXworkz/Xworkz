package entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Table(name="event")
@Entity
@Setter
@Getter
@ToString
public class EventEntity {
    @Id
    @Column(name="event_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int event_id;
    @Column(name="event_name")
    private String event_Name;
    @Column(name="event_organizer")
    private String event_organizer;
    @Column(name="event_attendee")
    private String event_attendee;
    @Column(name="contact")
    private long contact;
    @Column(name="address")
    private String address;
}
