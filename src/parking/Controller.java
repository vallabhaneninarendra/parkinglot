package parking;

import java.util.HashMap;
import java.util.Map;

public class Controller {
	
  Map<Integer,Car> cars=new HashMap<Integer,Car>();
   Integer totalNumberofSlots = 2;
   
  public int parkCar(String color,String regNo)
   {
	   int slot=getNextSlot();
	   
	   Car car=new Car(slot, color,regNo);
	   cars.put(slot, car);  
	   return slot;
   }
   
 public int getNextSlot()
   {
	   int next=0;
	   for(int i=1;i<=totalNumberofSlots;i++ )
	   {	
		   System.out.println("Avilable cars in parking "+cars.size() );
		   if(cars.get(i) == null)
		   {
		   System.out.println("Avilable slot is "+i);
		   return i;		   
		   }
	   }	   
	   return next;	   
   }
   //loop through map
// public void showDetails()
//   {
//	   for(int i=1;i<=totalNumberofSlots;i++ )
//	   {
//		   if(cars.get(i) != null)
//		   {
//		   System.out.println(cars.get(i).toString());
//		   }		   
//	   }	   
//   }

 public void showDetails(HashMap<Integer, Car> cars) {
     if(cars.size() == 0) {
         System.out.println("\n *********  slots are empty ********* \n");
         return;
     }
     for (Map.Entry<Integer,Car> entry : cars.entrySet()) {
         System.out.println("\n **** car details slot :" + entry.getKey());
         System.out.println("car registration number: " + entry.getValue().getRegistrationNumbers());
         System.out.println("car color: " + entry.getValue().getCarColors());
     }
 }
  
Map<Integer, Car> unParking(String slot) 
{
	String slot2 = slot;
    cars.remove(slot2);
	System.out.println("Slot removed "+slot2);
	return cars;	 
 }

}
