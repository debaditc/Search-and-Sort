/* Interpolation search 
* Slower than binary search ONLY IF array is small
* Time complexity : O(log log n)
*/

import scala.util.control.Breaks._

object interpolationsearch {
  
  def main (args : Array[String])
  {
    var arr = Array(3,7,11,12,13,15)
    println("Enter the search no : ")
    var search = Console.readInt()
    
    interpol(arr,search)

  }
  
  def interpol (arr : Array[Int],search : Int)
  {
    var low = 0
    var high = arr.length-1
    var flag=0
    var mid = 0
    println(low+" " +high + " "+mid)
    breakable 
    { 
        while (arr(high) != arr(low) && search >= arr(low) && search <= arr(high))
        {
           mid = low+ ((high-low)/(arr(high)-arr(low)))*(search - arr(low)) 
           println(mid)
           
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
