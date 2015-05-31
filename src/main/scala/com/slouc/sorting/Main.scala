package com.slouc.sorting

/**
 * @author slouc
 *
 */
object Main extends App {

  val bubbleSort: Sort = new BubbleSort
  
  val init = Common.gen
  val solution = bubbleSort.sort(init)
  
  println(init)
  println(solution)
  
}