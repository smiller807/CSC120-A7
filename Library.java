/* This is a stub for the Library class */
import java.util.Hashtable;
public class Library extends Building{

private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title){
      if(collection.contains(title)){
        System.out.println("This title is already in the collection");
      } else {
        collection.put(title,true);
      }
    }
    public String removeTitle(String title){
      if(collection.contains(title)){
        collection.remove(title,true);
      } else {
        System.out.println("This title is not in the collection");

      }
      return title;
    }
    public void checkOut(String title){
      if(collection.contains(title)){
        collection.put(title,false);
      }
    }
    public void returnBook(String title){
      if(collection.contains(title)){
        collection.put(title,true);
      }
    }
    public boolean containsTitle(String title){
      if(collection.contains(title)){
          return true;
      } else {
        return false;
      }
    }
    public boolean isAvailable(String title){
      if (collection.containsKey(title)) { 
        Boolean value = collection.get(title);
        if (value == true) { 
            return true;
        }
      }
      return false;
    }
    public void printCollection(){
      System.out.println(collection);
    }
  
    public static void main(String[] args) {
      Library newLibrary = new Library("Neilson Library", "Seeyle Lawn", 4);
    }
  
  }