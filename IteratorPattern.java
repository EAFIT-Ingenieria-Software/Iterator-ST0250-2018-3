/*
Usa la clase NameRepository para obtener Iterator 
e imprimir los nombres.
*/

public class IteratorPattern {
  
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }   
   }
}