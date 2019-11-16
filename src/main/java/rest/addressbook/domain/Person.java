package rest.addressbook.domain;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * A person entry in an address book
 */
public class Person {

  private String name;
  private int id;
  private String email;
  private URI href;
  private List<PhoneNumber> phoneList = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addPhone(PhoneNumber phone) {
    getPhoneList().add(phone);
  }

  public List<PhoneNumber> getPhoneList() {
    return phoneList;
  }

  public void setPhoneList(List<PhoneNumber> phones) {
    this.phoneList = phones;
  }

  public boolean hasEmail() {
    return getEmail() != null;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null) {
      return false;
    }

    // Fields may be null
    if (this.getClass() == other.getClass()) {
      Person otherPerson = (Person) other;
      return ((this.name == null && otherPerson.name == null)
          || (this.name != null && this.name.equals(otherPerson.name)))
          && this.id == otherPerson.id
          && ((this.email == null && otherPerson.email == null)
          || this.email != null && this.email.equals(otherPerson.email))
          && ((this.href == null && otherPerson.href == null)
          || (this.href != null && this.href.equals(otherPerson.href)))
          && this.phoneList.equals(otherPerson.phoneList);
    } else {
      return false;
    }
  }
}
