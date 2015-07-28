package com.slouc.sorting.sort

import com.slouc.sorting.Sort

/**
 * Insertion sort. Best: O(n), Worst:O(N^2)
 *
 * @author slouc
 *
 */
class InsertionSort extends Sort {

  private def insert(elem: Int, list: List[Int]): List[Int] = {
    if (list == Nil || elem < list.head) elem :: list
    else list.head :: insert(elem, list.tail)
  }

  def sort(list: List[Int]): List[Int] = {
    if (list == Nil) Nil
    else insert(list.head, sort(list.tail))
  }

}