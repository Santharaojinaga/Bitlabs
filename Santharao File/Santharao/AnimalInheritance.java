/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow

*/

//Add Animal class and Create Sound() method 
class Animal
  {
    
  String makeSound()
    {
     return("sounds");
    }
  }
 //Add Horse class that extends Animal class
class Horse extends Animal{
  String makeSound()
  {
  return(" wee wee");
  }
}
//Add Cat class that extends Animal class
class Cat extends Animal{
  String makeSound()
  {
    return("meow meow");
  }
}
  
class AnimalInheritance {
 
//Add main method here
public static void main(String[] args)
  {
    //Create all 3 Animal objects and add to an array 
Animal[] obj= new Animal[3];
    obj[0]= new Animal();
    obj[1]= new Horse();
    obj[2]= new Cat();
//Loop over the array and print sound it makes
for(int i=0;i<obj.length;i++)
  {
    System.out.println(obj[i].makeSound());
  }
}

}
