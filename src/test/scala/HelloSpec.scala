import org.scalatest._

import scala.util.Random

class HelloSpec extends WordSpec with MustMatchers {

  "apply" must {



    "return Exception if list is empty with n=1 " in {
      val Ex = intercept[Exception]{Hello.apply(List(),1)}

      assert(Ex.getMessage == "no numbers to choose from")
    }

    "return head of list(1) if List(1) n = 1 " in {

      Hello.apply(List(1),1) mustEqual 1
    }



    val x = Random.nextInt(100)
    s"return head of list(x) if List(x) n = 1 where x= $x " in  {

      Hello.apply(List(x),1) mustEqual x
    }


    "return 10 When given List(10,9) n = 1" in {

      Hello.apply(List(10,9),1) mustEqual 10
    }

    "return exception if index extends list" in {
      val Ex = intercept[Exception]{Hello.apply(List(1,2,3),4)}

      assert(Ex.getMessage == "index not allowed")
    }

    "return 10 when given List(9,10) n = 1" in {

      Hello.apply(List(9,10),1) mustEqual 10
    }

    "return 10 when given List(12,11,11,10) n = 3 " in {

      Hello.apply(List(12,11,11,10),3) mustEqual 10
    }


    "return 10 from a large unordered list containing duplicates, when 10 is the nth(3rd) largest" in {

      Hello.apply(List(10,10,12,13,3,2,2,5),3) mustEqual 10
    }

  }
}
