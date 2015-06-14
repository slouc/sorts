package com.slouc.sorting.sort

import com.slouc.sorting.Sort

/**
 * Quick sort. Best/average: O(n log(n)), Worst:O(N^2)
 *
 * @author slouc
 *
 */
class QuickSort extends Sort {

  def sort(list: List[Int]): List[Int] = list match {
    case Nil => list
    case _ :: Nil => list
    case _ => {
      val pivot = list.head
      val (smaller, larger) = list.tail.partition(_ < pivot)
      sort(smaller) ++ List(pivot) ++ sort(larger)
    }
  }

}