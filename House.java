/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
   * constructor
   * @param name name of house
   * @param address address of house
   * @param nFloors number of floors in the house
   * @param hasDiningRoom if the house has a dining hall
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
   * method if the hosue has a dining room
   * @return returns true/false if the house has/doesn't have a dining room
   */
  public boolean hasDiningRoom(){
    if (this.hasDiningRoom = true){
      return true;
    } else {
      return false;
    }
  }

  /**
   * method for the number of residents
   * @return the amount of residents in the house
   */
  public int nResidents(){
    int nResidents = residents.size();
    return nResidents;
  }

  /**
   * method to move a student in
   * @param s the student moving into the house
   */
  public void moveIn(Student s){
    if (residents.contains(s)){
      System.out.println("This Student is already moved in");
    } else {
      residents.add(s);
    }
  }

  /**
   * method to move a student out
   * @param s the student moving out
   * @return returns the name of the student moving out
   */
  public Student moveOut(Student s){
    if (residents.contains(s)){
      residents.remove(s);
    } else {
      System.out.println("This Student is already moved in out");
    }
    return s;
  }

  /**
   * method to check if someone is a resident
   * @param s the studnet being checked
   * @return returns true/false if the student is/isn't a resident in the house
   */
  public boolean isResident(Student s){
    if (residents.contains(s)){
      System.out.println("This student is a resident");
      return true;
    } else {
      System.out.println("This student is not a resident");
      return false;
    }
  }

  public static void main(String[] args) {
    House myHouse = new House("Albright House", "7 Bedford Terrace", 4, false);
  }
}