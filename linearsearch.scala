/* Linear search 
 * Time complexity - O(N)
*/

import scala.util.control.Breaks._

object linearsearch {
  
  def main (args : Array[String])
  {
    var arr = Array(3,41,24,1,2)
    println("Enter the search no : ")
    var search = Console.readInt()
    
    linearsearch(arr,search)
  }
  
  def linearsearch (arr : Array[Int],search : Int)
  {
    breakable {
    for (i <- 0 to arr.length)
    {
      if (arr(i) == search)
      {
          println("No found in " + (i+1) + " position")  
          break
      }
    }
    
    }
  }
}
