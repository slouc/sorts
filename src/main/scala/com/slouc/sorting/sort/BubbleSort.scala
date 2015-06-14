package com.slouc.sorting.sort

import com.slouc.sorting.Sort

/**
 * Bubble sort. Best: O(n), Worst:O(N^2)
 *
 * @author slouc
 *
 */
class BubbleSort extends Sort {

  private def solve(list: List[Int]): List[Int] = {
    if (list.size == 1) list
    else {
      val newList = list match {
        case a :: b :: rest if (a > b) => b :: a :: rest
        case l => l
      }
      newList.head :: solve(newList.tail)
    }
  }

  private def iterate(list: List[Int]): List[Int] = {
    if (list.size == 1) list
    else {
      val onePass = solve(list).reverse
      if (isSorted(onePass)) onePass
      else onePass.head :: iterate(onePass.tail)
    }
  }

  def sort(list: List[Int]): List[Int] = iterate(list).reverse

}