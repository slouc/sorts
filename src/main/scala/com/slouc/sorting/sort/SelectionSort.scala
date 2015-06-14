package com.slouc.sorting.sort

import com.slouc.sorting.Sort

/**
 * Selection sort. Best/Worst: O(N^2)
 *
 * @author slouc
 *
 */
class SelectionSort extends Sort {

  private def scan(list: List[Int]): List[Int] = switch(list, list.head, list.min)

  private def switch(list: List[Int], fst: Int, scd: Int): List[Int] = {
    def f(elem: Int) = if (elem == fst) scd else if (elem == scd) fst else elem
    if (list.head == scd) list
    else list.map(f)
  }

  private def iterate(list: List[Int]): List[Int] = {
    if (list.size == 1) list
    else {
      val onePass = scan(list)
      if (isSorted(onePass)) onePass
      else onePass.head :: iterate(onePass.tail)
    }
  }

  def sort(list: List[Int]): List[Int] = iterate(list)

}