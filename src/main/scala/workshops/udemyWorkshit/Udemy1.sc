object FirstWorksheet {
  //VAL VS VAR
  val a = 5
  //in java equivalent is final
  //When you declare val you make reference val a to object in memory contains 5
  // and you can't change this object
  var b = 6
  //No primitives types, all are object.
  // In reality when compiling, Integer type goes to primitives int.

  b = 7
  //Now we assignement reference b to new object

  var c: Int = 1

  val (d, f) = (3, 5)
  //Patterns - tuple (krotka), f.e when function wants to return multiple values

  //IF EXPRESSION
  val next = if (a < 9) true else false
  //in scala if is expression, which we can assignemnt to variable
  //  Boolean next2 = (a < 9 ? true : false) equivalent in java - ternery operator
  //in java IF is a statement (twierdzeniem)  in scala is expression

  if (a < 9) a
  if (a < 9) a else ()
  // look at type returned value is common type for Unit and Int type AnyVal
  if (a > 9) "hi" else ()

  //MATCH EXPRESSION - switch in java

  val result = a match {
    case 0 => "zero"
    case 1 => "one"
    case _ => "Something bigger"
    // _ is absolutely anything - default in java
  }

  val result1 = a * 3 match {
    case 0 => "zero"
    case 1 => "one"
    case i => "Something bigger, " + i
  }

  val result2 = (a * 3, b) match {
    case (0, _) => "zero"
    case (_, 1) => "one"
    case i => "Something bigger, " + i
  }

  val result3 = a match {
    case 0 => "zero"
    case b => "Same as b"
    //b is creating here a new variable and it's anything
    case _ => "Something bigger"
  }
  //when we wants use variable b we need `b` but b must be a val not var :
  val result4 = a match {
    case 0 => "zero"
//    case `b` => "Same as b"
    case _ => "Something bigger"
  }
  
}