package objects;

import javax.persistence.Entity;

/**
 * Bean Annotation.
 */
@Entity
public class ReportingPerson extends Person {

  public ReportingPerson() {

  }

  public ReportingPerson(String name, String firstName, String phoneNumber) {
    super(name, firstName, phoneNumber);
  }

}