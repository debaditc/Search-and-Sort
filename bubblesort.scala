/* Bubble Sort 
* Easiest sort but not efficient
* Time complexity - O(N^2)
*/

object bubblesort {
  def main( args : Array[String])
  {
    var arr = Array(23,12,1,6,31,1)
    bubble(arr)
  }
  
  def bubble(arr : Array[Int])
  {  
    for ( i <- 0 to arr.length-1)
    {
      for (j <- i+1 to arr.length-1)
      {
        if (arr(i) > arr(j))
        {
          var t = arr(i)
          arr(i) = arr(j)
          arr(j) = t
        }
      }
    }
    println("Array - " + arr.mkString(","))
    
   }

}
