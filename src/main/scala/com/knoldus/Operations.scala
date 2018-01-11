package com.knoldus

/**
 * Created by manjot on 11/1/18.
 */
class Operations {

  val four = 4
  val one = 1
  val zero = 0
  val six = 6

  def sum(f: (Int, Int) => Int, num1: Int, num2: Int): Int = {
    f(num1, num2)
  }

  def findSum(str: String): Int = {
    str.toLowerCase match {
      case "square" => sum((num1, num2) => (num1 * num1) + (num2 * num2), four, six)
      case "cube" => sum((num1, num2) => (num1 * num1 * num1) + (num2 * num2 * num2), four, six)
      case "int" => sum((num1, num2) => num1 + num2, four, six)
    }
  }

  def operatingList(list: List[Int], operation: String): Int = {
    def recursiveCall(list: List[Int], f: (Int, Int) => Int, result: Int): Int = {
      list match {
        case Nil => result
        case head :: tail => recursiveCall(tail, f: (Int, Int) => Int, f(head, result))
      }
    }

    operation match {
      case "sum" => recursiveCall(list, (num1, num2) => num1 + num2, zero)
      case "product" => recursiveCall(list, (num1, num2) => num1 * num2, one)
      case "maximum" => recursiveCall(list, (num1, num2) => if (num1 > num2) {
        num1
      } else {
        num2
      }, zero)
    }
  }


}

