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
      case "square" => sum((a, b) => (a * a) + (b * b), four, six)
      case "cube" => sum((a, b) => (a * a * a) + (b * b * b), four, six)
      case "int" => sum((a, b) => a + b, four, six)
    }
  }

  def operatingList(list: List[Int], operation: String): Int = {
    def recCall(list: List[Int], f: (Int, Int) => Int, result: Int): Int = {
      list match {
        case Nil => result
        case head :: tail => recCall(tail, f: (Int, Int) => Int, f(head, result))
      }
    }

    operation match {
      case "sum" => recCall(list, (a, b) => a + b, zero)
      case "product" => recCall(list, (a, b) => a * b, one)
      case "maximum" => recCall(list, (a, b) => if (a > b) {
        a
      } else {
        b
      }, zero)
    }
  }


}

