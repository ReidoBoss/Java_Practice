public class Main{
   public static void main (String ... args){
      
      Array array = new Array();
      //1
      array.insert(1);
      array.insert(2);
      array.insert(3);
      array.insert(4);
      array.insert(5);
      array.insert(6);
      //2
      array.delete(1);
      //3
      array.search(6);
      //4
      int access = array.access(2);
      System.out.println("Accessed index: "+access);
      //5
      array.update(2,69);
      //6
      int size = array.size();
      System.out.println("array size: "+size);
      //7
      int[] tempArray = {1,2,3,4,5};
      
      array.display();
      
      

   }
}

// 1.Insertion: Add an element at a specified index in the array.
// 2.Deletion: Remove an element from the array at a specified index.
// 3.Search: Find the index of a specified element in the array.
// 4.Access: Retrieve the element at a specified index in the array.
// 5.Update: Modify the value of an element at a specified index in the array.
// 6.Size/Length: Get the number of elements currently in the array.
// 7.Concatenate: Combine two arrays into a single array.
// 8.Sorting: Implement sorting algorithms like bubble sort, selection sort, or merge sort to sort the elements of the array.
// 9.Searching: Implement searching algorithms like linear search or binary search to find elements in the array.
// 10.Unique Elements: Remove duplicate elements from the array.
// 11.Subarray Operations: Perform operations on subarrays, such as finding the maximum sum subarray or reversing a subarray.

