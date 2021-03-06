package se.lexicon.genericExamples.genericInterfaceExamples;

import se.lexicon.genericExamples.genericInterfaceExamples.model.Course;
import se.lexicon.genericExamples.genericInterfaceExamples.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoImpl implements CourseDao {


  private List<Course> courseList = new ArrayList<>();


  @Override
  public List<Course> findByName(String name) {

    // todo: implement it
    return null;
  }

  @Override
  public List<Course> findByStartDate(LocalDate localDate) {
    // todo: implement it
    return null;
  }

  @Override
  public Course save(Course course) {
    // todo: implement it
    return null;
  }

  @Override
  public Course update(Course course) {
    // todo: implement it

    return null;
  }

  @Override
  public boolean remove(String s) {
    // todo: implement it

    return false;
  }

  @Override
  public Course findById(String s) {
    if (s == null) throw new IllegalArgumentException("Id is null");
    for (Course element : courseList) {
      if (element.getCourseName().equalsIgnoreCase(s)) {
        return element;
      }
    }
    return null;
  }

  @Override
  public List<Course> getAll() {
    return null;
  }
}
