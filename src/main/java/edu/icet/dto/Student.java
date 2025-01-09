package edu.icet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity   // This is the model class but from this annotation it says that you should also work as a entity(database table)
public class Student {  //This is the model class
    @Id // making the id primary key (cuz, every table must contain a primary key)
    @GeneratedValue(strategy = GenerationType.AUTO)  // generating the primary key auto
    private Integer id;
    private String name;
    private String address;
}
