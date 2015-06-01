package com.slouc.sorting

/**
 * Selection sort. Best/Worst: O(N^2)
 *
 * @author slouc
 *
 */
class SelectionSort extends Sort {

  def sort(list: List[Int]): List[Int] = {

    def scan(list: List[Int]): List[Int] = switch(list, list.head, list.min)

    def switch(list: List[Int], fst: Int, scd: Int): List[Int] = {
      def f(elem: Int) = if (elem == fst) scd else if (elem == scd) fst else elem
      if (list.head == scd) list
      else list.map(f)
    }

    def iterate(list: List[Int]): List[Int] = {
      if (list.size == 1) list
      else {
        val onePass = scan(list)
        if (onePass.sorted == onePass) onePass
        else onePass.head :: iterate(onePass.tail)
      }
    }

    iterate(list)

  }

}