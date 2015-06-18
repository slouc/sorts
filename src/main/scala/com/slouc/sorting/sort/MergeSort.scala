package com.slouc.sorting.sort

import com.slouc.sorting.Sort

/**
 * Merge sort. Best: O(n log n), Average: O(n log n), Worst: O(n log n)
 * 
 * @author slouc
 *
 */
class MergeSort extends Sort {

  def divideAndMerge(list: List[Int]): List[Int] = {
    val (left, right) = list.splitAt(list.size / 2)
    left match {
      case Nil => right
      case _ => merge(divideAndMerge(left), divideAndMerge(right))
    }
    
  }

  def merge(list1: List[Int], list2: List[Int]): List[Int] = {
    (list1, list2) match {
      case (Nil, c) => c
      case (c, Nil) => c
      case (c1, c2) => {
        if (c1.head < c2.head) c1.head :: merge(c1.tail, c2)
        else c2.head :: merge(c1, c2.tail)
      }
    }
  }

  def sort(list: List[Int]): List[Int] = divideAndMerge(list)

}