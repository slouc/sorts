package com.slouc.sorting

/**
 * @author slouc
 *
 */
trait Sort {

  def sort(list: List[Int]): List[Int]
  
  def isSorted(list: List[Int]) = list.sorted == list // FIXME better solution
}