package com.aclecio.crudspring.repository;
import com.aclecio.crudspring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {    
    
}
