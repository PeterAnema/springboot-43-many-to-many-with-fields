package nl.gettoworktogether.manytomany.model;

import javax.persistence.*;
import java.util.Set;

@Entity
class Student {

    @Id
    Long id;

    @OneToMany(mappedBy = "student")
    Set<CourseRating> ratings;

    // additional properties
    // standard constructors, getters, and setters
}