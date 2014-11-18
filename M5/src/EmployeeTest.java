/**
 * Classe que crea empleats.
 * 
 * @author Abderrahim Talhaoui.
 * @version 2.0
 */
class Employee {

   private String myName;
   private double mySalary;

   /**
	 * constructor de la classe Employee.
	 * 
	 * @param name nom del empleat
	 * @param salary salari del empleat
	 */
   public Employee(String name, double salary) {
      myName = name;
      mySalary = salary;
   }

   /**
	 * El mètode getName() retorna el nom del empleat.
	 * 
	 * @return String.
	 */
   public String getName() {
      return myName;
   }

   /**
	 * El mètode getSalary() retorna el salari del empleat.
	 * 
	 * @return double.
	 */
   public double getSalary() {
      return mySalary;
   }

   /**
	 * El mètode raiseSalary() retorna l'augment de sou de percent (en %).
	 * @param percent % de l'augment de sou.
	 * @return void.
	 */
   public void raiseSalary(int percent) {
      mySalary = mySalary +
         percent * 0.01 * mySalary;
   }

   /**
	 * El mètode setSalary() canvia el salari.
	 * 
	 * @return void.
	 */
   public void setSalary(double salary) {
      mySalary = salary;
   }

   /**
	 * El mètode toString() retorna el nom i el salari.
	 * 
	 * @return String.
	 */
   public String toString() {
      return "Name: " + getName() +
             ", Salary: " + getSalary();
   }
}

/**
 * Classe que crea prova la classe Employee.
 * 
 * @author Abderrahim Talhaoui.
 * @version 1.2
 */
public class EmployeeTest {

	   public static void main(String[] args) {
		  /**
		   * creació del empleat Nathan Fillion on li introduim un salari de 25000.
		   * a continuacio mostrem el salari, el tornem a mostrar amb un augment del 10%,
		   * el tornem a mostrar amb un altre augment del 10%, li modifiquem el salari i 
		   * el tornem a mostrar.
		   * 
		   * */
		   int versio = 3;
		   System.out.println("la versio es: "+versio);
		   for (int i = 0; i < 5; i++) {
			System.out.println("ola k ase");
		}
		   
	      Employee mal = 
	         new Employee("Nathan Fillion", 25000.0);
	      System.out.println("mal's salary: " + 
	         mal.getSalary());
	      mal.raiseSalary(10);
	      System.out.println("mal's salary: " + 
	         mal.getSalary());
	      mal.raiseSalary(10);
	      System.out.println("mal's salary: " + 
	         mal.getSalary());
	      mal.setSalary(40000.0);
	      System.out.println("mal's salary: " + 
	         mal.getSalary());

	      /**
		   * creació del empleat Gina Torres on li introduim un salari de 15000.
		   * a continuacio mostrem el salari, el tornem a mostrar amb un augment del 5%,
		   * el tornem a mostrar amb un altre augment del 5%.
		   * 
		   * */
	      Employee zoe = 
	         new Employee("Gina Torres", 15000.0);
	      System.out.println("zoe's salary: " + 
	         zoe.getSalary());
	      zoe.raiseSalary(5);
	      System.out.println("mal's salary: " + 
	         zoe.getSalary());
	      zoe.raiseSalary(5);
	      System.out.println("mal's salary: " + 
	         zoe.getSalary());

	      /**
		   * creació del empleat Summer Glau on li introduim un salari de 22222.22.
		   * a continuacio mostrem el salari, i despres imprimir l'objecte river.
		   * */
	      Employee river = 
	         new Employee("Summer Glau", 22222.22);
	      System.out.println("river's salary: " + 
	         river.getSalary());
	      System.out.println(river);

	      /**
		   * creació del empleat Adam Baldwin on li introduim un salari de 27000.0.
		   *  despres imprimir l'objecte jayne.
		   * */
	      Employee jayne = 
	         new Employee("Adam Baldwin", 27000.0);
	      System.out.println(jayne);
	   }
	}