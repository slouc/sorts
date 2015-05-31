package com.slouc.sorting

import scala.annotation.tailrec

/**
 * Bubble sort. Best: O(n), Worst:O(N^2)
 * 
 * @author slouc
 *
 */
class BubbleSort extends Sort {

  def sort(list: List[Int]): List[Int] = {
    
    def solve(list: List[Int]): List[Int] = {
      if (list.size == 1) list
      else {
        val newList = list match {
          case a :: b :: rest if (a > b) => b :: a :: rest
          case l => l
        }
        newList.head :: solve(newList.tail)
      }
    }
    
    def iterate(list: List[Int]): List[Int] = {
      if (list.size == 1) list
      else {
        val onePass = solve(list).reverse
        onePass.head :: iterate(onePass.tail)
      }
    }
    
    iterate(list).reverse
  }
}