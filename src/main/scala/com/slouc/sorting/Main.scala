package com.slouc.sorting

/**
 * @author slouc
 *
 */
object Main extends App {

  val bubbleSort: Sort = new BubbleSort
  val selectionSort: Sort = new SelectionSort
  
  val init = Common.gen
  val solution = selectionSort.sort(init)
  
  println(init)
  println(solution)
  
}