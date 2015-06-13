package com.slouc.sorting

/**
 * @author slouc
 *
 */
object Main extends App {

  val sort: Sort = new InsertionSort
  
  val init = Common.gen
  val solution = sort.sort(init)
  
  println(init)
  println(solution)
  
}