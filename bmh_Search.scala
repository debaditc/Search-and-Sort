/*
Implementation of Boyer Moore Horspool Algorithm

This algo is used to search and determing substring inside a string

*/


import scala.util._
import collection.mutable.HashMap

object bmh_Search {
  
  def main (args : Array[String])
  {
    var str = "trusthardtoothbrushes"
    var search = "tooth"
    
    //Contruct Bad match table
    var len1 = search.length()
    var len2 = str.length()
    var badmatch_map = new HashMap[Char,Integer]()  { override def default(key:Char) = len1}
    
    for ( i <- 0 to len1 -1)
    {
      println(search.charAt(i))
      if(i!=len1-1)
      {
        badmatch_map.put(search.charAt(i),len1-i-1)
      }
      else
      {
        badmatch_map.put(search.charAt(i),len1)
      }
    }
   
    println(badmatch_map)
    println("======================")
    var j = len1-1
    var i = len1-1
    
    while(i <= len2-1)
    {
      println("I - " + i + "===== J - " + j)
      if(str.charAt(i) == search.charAt(j)  )
      {
        println(str.charAt(i)+"-------"+search.charAt(j)) 
        j=j-1
        i=i-1
      }
      else
      {
        println(str.charAt(i)+"-------"+search.charAt(j))
        i= i + badmatch_map(str.charAt(i))
        //Use option for other characters
        j=len1-1
      }
      
      if(j<0)
      {
        println("Match found at " + (i+1) )
        System.exit(0)
      }
      
      println("I - " + i + "===== J - " + j)
      println(" ")
      
    }

  }
  
}
