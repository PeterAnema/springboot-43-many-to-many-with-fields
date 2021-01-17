package nl.gettoworktogether.manytomany.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
class Course {

    @Id
    Long id;

    @OneToMany(mappedBy = "course")
    Set<CourseRating> ratings;

    // additional properties
    // standard constructors, getters, and setters
}