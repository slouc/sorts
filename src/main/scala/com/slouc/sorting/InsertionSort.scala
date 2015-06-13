package com.slouc.sorting

import scala.annotation.tailrec

/**
 * Insertion sort. Best: O(n), Worst:O(N^2)
 *
 * @author slouc
 *
 */
class InsertionSort extends Sort {

  def sort(list: List[Int]): List[Int] = {
    
    def solve(list1: List[Int], list2: List[Int]): (List[Int], List[Int]) = {
      if (list2 == Nil) (list1, list2)
      else (insert(list2.head, list1), list2.tail)
    }
    
    def insert(elem: Int, list: List[Int]): List[Int] = (elem :: list).sorted

    def iterate(list1: List[Int], list2: List[Int]): List[Int] = {
      if (list2 == Nil) list1
      else {
        val (newList1, newList2) = solve(list1, list2)
        if (newList2 == Nil || isSorted(newList2) && (newList2.head > newList1.last)) 
          newList1 ::: newList2
        else iterate(newList1, newList2)
      }
    }
    iterate(List(list.head), list.tail)
  }
}