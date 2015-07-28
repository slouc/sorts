package com.slouc.sorting

import scala.math.BigInt.probablePrime
import scala.util.Random
import com.slouc.sorting.sort.MergeSort
import com.slouc.sorting.sort.InsertionSort

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