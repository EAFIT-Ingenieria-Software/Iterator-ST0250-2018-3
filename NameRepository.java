/*

Crea la clase concreta que implementa la interfaz Container.
Esta clase tiene un inner class NameIterator que implementa
la interfaz Iterator.
*/

public class NameRepository implements Container {
   public String names[] = {"Laura - eafit-201710076010" , "Manuela - eafit-201710044010" ,"Orlando - omontoy"};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }   
   }
}