public class Array{
   int [] array = new int[0];
   

   
   
  
   
   public void display(){
      for(int i=0;i<array.length;i++){
         System.out.print(array[i]+" ");
      }
      System.out.println();
   }
   
   public void insert(int value){
      int [] tempArray = new int[array.length+1];
      for(int i =0; i< array.length;i++){
         tempArray[i] = array[i];
      }
      tempArray[tempArray.length-1] = value;      
      array = tempArray;
   }   
   
   public void delete (int value){
      for(int i = 0; i < array.length ; i++){
         if(value == array[i]){
            int[] tempArray = new int[array.length-1];
            int index=0;
            for(int j = 0; j < array.length ; j++){
               if(i!=j){
                  tempArray[index++] = array[j];
               }
            }
            array = tempArray;
            return;
         }
      }
      
      System.out.println(value+" does not exist in the array");
   }
   
   public void search (int value){
      for(int i = 0 ; i < array.length ;i++){
         if(value == array[i]){
            System.out.println(value+" found at index "+i);
            
         }  
      }
   }
   
   public int access (int index){
      if(index > array.length-1){
         System.out.println("index is greater than the array length");
         return 0;
      }
      else{
         for(int i = 0; i < index+1; i++){
            if(index == i){
               return array[i];
            }
         }           
      }

      return 0;
   }
   
   public void update(int index, int value){
      for(int i = 0 ; i < array.length ; i++){
         if(i == index){
            array[index] = value;
            return;
         }
      }
      System.out.println("value not found");
   }
   
   public int size(){
      return array.length;
   }
   

}