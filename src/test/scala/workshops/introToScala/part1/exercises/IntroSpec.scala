package workshops.introToScala.part1.exercises

import workshops.UnitSpec

class IntroSpec extends UnitSpec {
  "New scala adept" should {
    "be able to define a value" in {
      val aValue: String = "i can declare a value!"
      aValue mustBe "i can declare a value!"
    }

    "be able to define a variable" in {
      var anInt = 41
       anInt mustBe 41
       anInt = anInt +1
       anInt mustBe 42
    }

    "be able to define a function" in {
       val add: Int => Int = { arg => arg+1}
       add(2) mustBe 3
    }

    "be able to define a method" in {
      // declare a method (with def) called hello which will accept a name (of type string) and return a string "hello $name"
      def hello(name: String): String = {s"hello $name"}
       hello("Haskell") mustBe "hello Haskell"
    }


    "be able to define a method which accepts functions as arguments" in {
      val handleCorretAnser = (value: String) => s"You are correct. The answer is $value!"
      val handleWrong = (value: String) => s"$value is not a correct answer"

      // create a method called "checkAnswer" which will accept 2 functions and a string (and try to figure out what this function should do basing on tests :) )

      def checkAnswer(funHandlingCorrectAnswer: String => String, funHandlingWrongAnswer: String => String, answer: String): String = {
        if (answer.equals("right")) funHandlingCorrectAnswer(answer)
        else funHandlingWrongAnswer(answer)
      }

       checkAnswer(handleCorretAnser, handleWrong, "wrong") mustBe "wrong is not a correct answer"
       checkAnswer(handleCorretAnser, handleWrong, "right") mustBe "You are correct. The answer is right!"
    }

    "be able to define a function  which returns a function" in {
      def integerGreaterThanFunction(valueShouldBeGreaterThan: Int): Int => Boolean = {
            //funkcja przyjmuje Int, a zwraca funkcje przyjmującą Int i zwracającą boolean
        a: Int => (a > valueShouldBeGreaterThan)
      }

//       uncomment lines below when you are ready to test
      val isIntegerAboveThreshold = integerGreaterThanFunction(5)
      isIntegerAboveThreshold(5) mustBe false
      isIntegerAboveThreshold(4) mustBe false
      isIntegerAboveThreshold(6) mustBe true
    }
  }
}
