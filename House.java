/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom(){
    if (this.hasDiningRoom = true){
      return true;
    } else {
      return false;
    }
  }

  public int nResidents(){
    int nResidents = residents.size();
    return nResidents;
  }

  public void moveIn(Student s){
    if (residents.contains(s)){
      System.out.println("This Student is already moved in");
    } else {
      residents.add(s);
    }
  }

  public Student moveOut(Student s){
    if (residents.contains(s)){
      residents.remove(s);
    } else {
      System.out.println("This Student is already moved in out");
    }
    return s;
  }

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