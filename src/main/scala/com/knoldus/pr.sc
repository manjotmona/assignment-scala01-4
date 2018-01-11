def operateList(list: List[Int], operation: String ): Int = {
  def recCall(list: List[Int], f:(Int,Int)=>Int, result: Int): Int ={
    list match{
      case Nil => result
      case head :: tail => recCall(tail,f:(Int,Int)=>Int,f(head,result))
    }

  }
  operation match {
    case "sum" => recCall(list,(a,b) => a+b,0 )
    case "product" => recCall(list,(a,b) => a*b,1)
    case "maximum" => recCall(list,(a,b) =>if (a > b) a else b ,0)
  }

}
val list = List(1,2,3)

operateList(list,"maximum")