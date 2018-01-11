package com.knoldus

import org.apache.log4j.Logger

/**
 * Created by manjot on 11/1/18.
 */
object Application extends App {
  val log = Logger.getLogger(this.getClass)
  log.info("Hello")
  var obj = new Operations()
  val one = 1
  val two = 2
  val three = 3
  val four = 4
  val five = 5
  val six = 6
  val list = List(one, two, three, four, five, six)
  log.info("\n")
  log.info(obj.operatingList(list, "sum"))
  log.info("\n")
  log.info(obj.operatingList(list, "product"))
  log.info("\n")
  log.info(obj.operatingList(list, "maximum"))
  log.info("\n")
  log.info(obj.findSum("square"))
  log.info("\n")
  log.info(obj.findSum("cube"))
  log.info("\n")
  log.info(obj.findSum("int"))
}
