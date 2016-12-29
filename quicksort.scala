/* Quick sort using Recursive function
* Time complexity : O(n log n)
* Learned from alvinalexander scala tutorials
* Efficient sort algorithm
*/

object quicksort {
  
  def main(args : Array[String])
  {
    val unsorted =  Array(23,123,121,27,11,233,9)
    
    val sorted = quicksort(unsorted)
    
    sorted.foreach(println)
    
  }
  
  def quicksort(arr : Array[Int]) : Array[Int] = {   
    if (arr.length <= 1)
      arr
    else
    {
      val pivot = arr(arr.length/2)
      Array.concat(
          quicksort(arr filter (pivot >)),
          arr filter (pivot ==),
          quicksort(arr filter (pivot <))
          ) 
    }
  }
  
}

