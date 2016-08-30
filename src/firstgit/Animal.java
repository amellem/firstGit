
package firstgit;

/**
 *
 * @author amellem
 */
public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
      if(validateAge(age)){
          this.age = age;
      }
    }
    
    private boolean validateAge(int age){
          if(age < 0 || age > 999){
            return false;
        } else {
            return true;
        }
    }
}
