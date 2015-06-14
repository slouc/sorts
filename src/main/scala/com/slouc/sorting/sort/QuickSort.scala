package com.slouc.sorting.sort

import scala.collection.mutable.ListBuffer
import com.slouc.sorting.Sort

/**
 * Quick sort. Best/average: O(n log(n)), Worst:O(N^2)
 *
 * @author slouc
 *
 */
class QuickSort extends Sort {

  def sort(list: List[Int]): List[Int] = {
    if (list == Nil || list.size == 1) list
    else {
      val pivot = list.head
      val (smaller, larger) = list.tail.partition(_ < pivot)
      sort(smaller) ++ List(pivot) ++ sort(larger)
    }
  }

}