/* Binary search
* Efficient search algortihm 
* Time complexity : O(log n)
*/

import scala.util.control.Breaks._

object binarysearch {
  
  def main (args : Array[String])
  {
    var arr = Array(1,4,5,12,55,88)
    println("Enter the search no : ")
    var search = Console.readInt()    
    binsearch(arr,search)
  }
  
  def binsearch (arr : Array[Int],search : Int)
  {
    var low = 0
    var high = arr.length
    var flag=0
    var mid = 0
    breakable 
     { 
        while (high >= low)
        {
           mid = low+ (high-low)/2     
           if (search == arr(mid))
           {
             flag=1      
             break
           }
           else if (search > arr(mid))
           {
             low = mid +1
           }
           else
           {
             high = mid -1
           }  
        }
     }
     if (flag==1)
     {
       println("Found in " + mid + " position")
     }
     else
     {
       println("Not found")
     }
  }
}
