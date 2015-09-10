//Tests are in OOTester.java
public class Classes {

  private int instanceVariable; //Variable of each instance of the class (can be public, but frowned upone because of encapsulation)
  private InnerClass innerClass; //Classes can contain complex objects

  //Constructor with arguement
  public Classes(int x) {
    this.instanceVariable = x; //Technically the this is not needed
    innerClass = new InnerClass();
  }

  //Default constructor
  public Classes() {
    this(0); //Call other constructor
  }

  //Public method
  public int getInt() {
    return instanceVariable;
  }

  //Private method, can only be called from other class methods
  private void privMethod() {
    System.out.println("Private Method");
  }

  public void callPriv() {
    privMethod();
  }

  //Static methods don't need an isntance of the class
  public static void statMethod() {
    System.out.println("Static Method");
  }

  //Good practice to override the 'toString' method
  @Override
  public String toString() {
    return "Some string representation of the superclass";
  }

  //Classes can contain other classes, can only be instantiated from within this class
  private class InnerClass {
    public InnerClass() {
      System.out.println("Inner Class Created");
    }
  }
}

