package uspg.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenParcial2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamenParcial2Application.class, args);

		  Employee CEO = new Employee ("Daniel Sandoval", "CEO", 20000);
		
	      Employee headSales = new Employee ( "Mario Zavala", "Jefe de Ventas", 10000);

	      Employee headMarketing = new Employee ( "Antonio Piche", "Jefe de Marketing", 10000);

	      Employee clerk1 = new Employee ( "Alfonso Mejilla", "Marketing", 9000);
	     
	      Employee clerk2 = new Employee ( "Justin Zapata", "Marketing", 9000);

	      Employee salesExecutive1 = new Employee ( "Otto Reyes", "Ventas", 9000);
	     
	      Employee salesExecutive2 = new Employee ( "Alex Palencia", "Ventas", 9000);

	      CEO.add (headSales);
	      CEO.add (headMarketing);

	      headSales.add (salesExecutive1);
	      headSales.add (salesExecutive2);

	      headMarketing.add (clerk1);
	      headMarketing.add (clerk2);
    
	      for (Employee headEmployee: CEO.getSubordinates ()) {
		         System.out.println (headEmployee);
		         for (Employee employee: headEmployee.getSubordinates ()) {
		            System.out.println (employee);
	         }
	      }		

		
	}

}
