package Tarea_2_DAV;

import Factory.*;
import Singleton.*;
import Builder.*;
import Observer.*;
import java.util.Scanner;

/**
 *
 * @author Richardson Laínez - 11711075
 */
public class Main {
    public static void main(String[] args) {
        int opcion_principal = -1;
        Scanner sc = new Scanner(System.in);
        while(opcion_principal != 0){
            System.out.println("---------MENÚ PRINCIPAL---------");
            System.out.println("1.-Singleron\n"
                    + "2.-Factory\n"
                    + "3.-Observer\n"
                    + "4.-Builder\n"
                    + "0.-Salir\n"
                    + "Ingrese el número de una opción (por ejemplo: 1, 2...)");
            opcion_principal = sc.nextInt();
            
            System.out.println("");
            switch (opcion_principal) {
                case 1:
                    System.out.println("---------SINGLETON---------");
                    Singleton();
                    break;
                    
                case 2:
                    System.out.println("---------FACTORY---------");
                    Factory();
                    break;
                
                case 3:
                    System.out.println("---------OBSERVER---------");
                    Observer();
                    break;
                    
                case 4:
                    System.out.println("---------BUILDER1---------");
                    Builder();
                    break;
                    
                case 0:
                    System.out.println("¡Buen día!");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Por favor, ingrese una opción válida");;
            }
            System.out.println("");
        }
    }
    
    
    public static void Singleton(){
        System.out.println("Intancia 1");
        EagerSingleton instan1 = EagerSingleton.getInstance();
        System.out.println("Instancia 2");
        EagerSingleton instan2 = EagerSingleton.getInstance();
        System.out.println("\nComparación de instancias:");
        System.out.println(instan1.getInstance() == instan2.getInstance());
    }
    
    public static void Factory(){
        Car small = new CarFactory().buildCar(CarType.SMALL);
        Car luxury = new CarFactory().buildCar(CarType.LUXURY);
        Car sedan = new CarFactory().buildCar(CarType.SEDAN);
        System.out.println("Tipo : "+small.getModel());
        System.out.println("Tipo : "+luxury.getModel());
        System.out.println("Tipo: "+sedan.getModel());
    }
    
    public static void Observer(){
        HeadHunter hunter = new HeadHunter();
        JobSeeker usuario1 = new JobSeeker("Juana");
        hunter.registerObserver(usuario1);
        
        JobSeeker usuario2 = new JobSeeker("Maria");
        hunter.registerObserver(usuario2);
        
        JobSeeker usuario3 = new JobSeeker("Pedro");
        hunter.registerObserver(usuario3);
        
        JobSeeker usuario4 = new JobSeeker("Ricky");
        hunter.registerObserver(usuario4);
        
        hunter.addJob("Conductor");
        System.out.println(hunter.getJobs().get(0));
        
        hunter.notifyAllObserver();
        System.out.println("");
    }
    
    public static void Builder(){
        MealDirector mealDirector = new MealDirector();
        mealDirector.makeMeal(new SandwichMealBuilder());
    }
}


