package com.slouc.sorting

import com.slouc.sorting.sort._

/**
 * @author slouc
 *
 */
object Main extends App {

  val sort: Sort = new QuickSort
  
  val init = Common.gen
  val solution = sort.sort(init)
  
  println(init)
  println(solution)
  
}