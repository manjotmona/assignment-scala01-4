package com.knoldus

import org.apache.log4j.Logger

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

    operation.toLowerCase match {
      case "sum" => recursiveCall(list, (num1, num2) => num1 + num2, zero)
      case "product" => recursiveCall(list, (num1, num2) => num1 * num2, one)
      case "maximum" => recursiveCall(list, (num1, num2) => if (num1 > num2) {
        num1
      } else {
        num2
      }, zero)
    }
  }

  val log = Logger.getLogger(this.getClass)
  def generatingPascalNumber(column: Int, row: Int): Int = {
    if (column == 0 || column == row) {
      1
    } else {
      generatingPascalNumber(column - 1, row - 1) + generatingPascalNumber(column, row - 1)
    }
  }

  def printingPascal() {
    log.info("Pascal's Triangle\n")
    for (row <- 0 to 4) {
      for (space <- 1 to 4 - row) {
        log.info(" ")
      }
      for (column <- 0 to row) {
        log.info(generatingPascalNumber(column, row) + " ")
      }
      log.info("\n")
    }
  }

}

