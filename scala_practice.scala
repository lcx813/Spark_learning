// primitive expressions 
// number
1
// boolean value
true
false
// text, string
"Hello, Scala!"

// compound expressions
1+2
"Hello, " ++ "Scala!"

// Method calls
"Hello, Scala!".size
"Hello, Scala!".toUpperCase
-42.abs
16.toHexString
(0 to 10).contains(10)
(0 until 10).contains(10)
"foo".drop(1)
"bar".take(2)

// Operators are methods
3+2 == 3.+(2)
1.to(10) == (1 to 10)

// Defination and evaluation
def square(x: Double) = x * x
square(10)

def square(x: Double): Double = x * x
square(10)

def sumOfSquares(x: Double, y: Double) = square(x) + square(y)
sumOfSquares(1, 2)

val x = 2
val y = square(x)

// CONDITIONAL EXPRESSIONS
def abs(x: Double) = if(x >= 0) x else -x
abs(-9)

val b = false
!b
b && b
b || b

// BLOCKS IN SCALA
{
    val x = 3
    x * x
}

// SEMICOLONS
// In Scala, semicolons at the end of lines are in most cases optional.
val x = 1;

// AGGREGATING INFORMATION WITH CASE CLASSES
case class Note(
  name: String,
  duration: String,
  octave: Int
)
val c3 = Note("C", "Quarter", 3)
c3.name
c3.duration
c3.octave

// PATTERN MATCHING
case class Rest(duration: String)
case class Note(name: String, duration: String, octave: Int)
def symbolDuration(symbol: Symbol): String =
  symbol match {
    case Note(name, duration, octave) => duration
    case Rest(duration) => duration
  }


(x: Int) => x * x * x




/**val vs. var**/
var a = 100 // mutable
val b = 100 // immutable
val a:Int = 400
val a:Double = 400
val a = 400:Double

val a = 100
val b = "hello"
val c = b + ", " + a
// c= String = hello, 100

/**lazy val**/
lazy val a = {println("evaluated"); 5}
// a: Int = <lazy>
a
// evaluated, res0: Int = 5
a
// res1: Int = 5
lazy val a = 2 + b
lazy val b = 3
a+b
// 5

// no lazy var

/**Bending Variables And Values To Your Will**/
val 'my greatest gift in dollars' = 500

val isThisMySalaryPerYear_? = 5000
val thisShouldBeMyRaise_! = isThisMySalaryPerYear_? + 50000
// thisShouldBeMyRaise_!: Int = 55000
println(isThisMySalaryPerYear_?)

/**byte, short, int, long, Floats, Booleans, And Doubles**/
val b:Byte = 10
val b:Byte = 127

val maxShort:Short = 32767

val g = 3010233L //Long

val floatValue = 32.0f

val v = 'k'
val c2 = '\u03B8'
val b = true
val b2 = false
-5.abs
// 5
Math.abs(-5)

/**if, else if, else**/
val a = 10
val res = ""
if (a<10){
  res = "Less than 10"
} else if (a>10){
  res = "larger than 10"
} esle {
  res = "it is 10!"
}
println(res)

val a = 10
val res = if (a<10) "less than 10"
else if (a>10) "great than 10"
else "it is 10!"
println(res)

/**while, do while**/
var a = 100
var res = ""
while (a>0){
  res = res + a
  if (a>1) res = res + ","
  a = a - 1
}
println(res)

val result = (1 to 100).reverse.mkString(",")
print(result)
val result = (100 to 1 by -1).mkString(",")

var a = 100
var res = ""
do{
  res = res + abs
  if (a>1) res = res + ","
  a = a - 1
}while (a>0)
println(res)

/**for loops**/
var res = ""
for (a <- 1 to 100){
  res = res + a
  if (a<100) {
    res = res + "," 
  }
}
println(res)

val xs = List(1,2,3,4)
var res = List[Int]()
for (a<-xs){
  res = res :+ (a+1) // append
}

val xs = List(1,2,3,4)
val res = for (a <- xs) yield (a+1)


/**Strings**/
val a:String = "Scala"
val a = "Scala":String
val escapes = "\t\n\r\u03BB"

/**smart strings**/
val lyrics = "I see trees or green, \n" +
  "Red roses too, \n" +
  "What a wonderful day"

"""
I see trees or green
|Red roses too
|what a wonderful day
""".stripMarging('|')

"""
I see trees or green
@Red roses too
@what a wonderful day
""".stripMarging('@')

val message = "We are meeting on June 13th of this year, and having lunch at 12:30PM"
val regex = """(\s|[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM)""".r
print(regex.findALlIn(message).toList)


/**string formatting**/
val str = String.format("This is a %s", "Test")
print(str)

val str2 = "This is a %s".format("Test")
print(str2)

println("Because %s, %s, %s").format("1","2","3"))

println("Because %3$s, %2$s, %1$s").format("1","2","3"))

import jave.time._
println("We will be eating lunch on %1$tB the %1$te in the year %1$tY".format(LocalDate.now))

/**string interpolation**/
val a = 99
println(s"${a} luftballons floating in the summer sky")
println(s"$a luftballons floating in the summer sky")
println(s"$a +3 luftballons floating in the summer sky") // 99+3
println(s"${a +3} luftballons floating in the summer sky") // 102
val ticketsCost = 5-
val bandName = "Psychedelic Furs"
printlin(f"The $bandName%2)


/**basic methods**/
def add(x:Int, y:Int):Int = {
  //boday of the method
  return (x+y)
}
println(add(6,5))

def add(x:Int, y:Int):Int = {
  //boday of the method
  x+y
}
println(add(6,5))

def add(x:Int, y:Int) = {
  //boday of the method
  x+y
}
println(add(6,5))

def add(x:Int, y:Int) = x+y
println(add(6,5))

def numberStatus(n:Int) = {
  if (a<10) "Less than 10"
  else if (a>10) "Greater than 10"
  else "It is 10!"
}

// ticks for paste
// :paste
// copy code block
// crtl D to finish

def add(x:Int, y:Int) = x+y
def subtract(x:Int, y:Int) = x-y
println(add(subtract(10,3).toInt, subtract(100, 32))))

(10.0).toInt
(10.0).round
(10.0).rount.toInt


val longValue = 20391919919191919919191
longValue.toInt


/**different return types**/
def add(x:Int, y:Int) = {
  if (x>10) (x+y).toString
  else x+y
}
// types parents tree

/**Unit and unit conventions**/
val g = ()
val g: Unit = () // unit means no return value
// unit is a child of AnyVal

def add(x:Int, y:Int) = {
  if (x>10) println(x)
  else x+y
}
// println is unit, x+y is Int, so according to the tree, return value is AnyVal

def nonsense(g:Unit):Int = 40
nonsense(():Unit) // Unit can be used anywhere

def add(x:Int, y:Int) = x + y

def badAdd(x:Int, y:Int){
  x+y
}
def addUnit(x:It, y:Int):Unit = x+y
println(badAdd(4,5))
println(addUnit(4,5))
//()
//()
//because return type is Unit, nothing will be returned
var a = 0 
def sideEffect():Unit = {
  a = a+1
}
def sideEffect() {
  a = a+1
}

/**recursion**/
def factorial(n:Int):BigInt = {
  if(n == 0 || n == 1) 1
  else n * factorial(n-1)
}

println(factorial(5))
//recursion need return type
//it can be overflowed if it returns Int here

/**tail optimized recursion**/
import scala.annotation.tailrec
@tailrec
def factorial(n:Int, acc:BigInt):BigInt = {
  if(n == 0 || n == 1) acc
  else  factorial(n-1, acc*n)
}

println(factorial(5, 1))
println(factorial(100, 1))

def fact(n:Int) = factorial(n, 1)
fact(5)
fact(100)

/**methods in methods**/
def fact(n:Int) = {
  @tailrec
  def factorial(n:Int, acc:BigInt):BigInt = {
  if(n == 0 || n == 1) acc
  else  factorial(n-1, acc*n)
  }
  factorial(n, 1)
}
fact(5)
fact(100)

/**names and default arguments**/
def processNumbers(b:Boolean, x:Int, y:Int) = if (b) x else y 
println(processNumbers(true, 10, 41)) //10

println(processNumbers(x = 10, y = 41, b = true)) //10

def add(x:Int, y:Int = 10) = x+y
printlin(30)
printlin(1,2)


def processNumbers(b:Boolean = true, x:Int, y:Int) = if (b) x else y 
println(processNumbers(x = 10, y = 41)) //10

/**asInstanceOf and IsInstanceOf**/
3.IsInstanceOf[Int]
3.IsInstanceOf[Boolean]
"3".IsInstanceOf[Boolean]
"3".IsInstanceOf[String]


/**constructors**/
var ada = new Employee("ada", "bcb")
clsee Emlpoyee(){
  def this(firstNameLString, lastName:String) = this(firstName, lastName, "Programmer")
  def this(firstNameLString, lastName:String) = {this(firstName, lastName, "Programmer")}
}

/**methods in classes**/
def fullName = s"$firstName, $lastName"

def changeLastName(ln:String) = new EMployee(firstName, ln, lastName)


/**Preconditions, Exceptions, And Exception Handling**/
require(firstName.nonEmpty, "first name cannot be empty")$

try{
  new Employee("Bono", "Singer")
} catch {
  case iae:IllegalArgumentException => printlin(iae.getMessage)
}

/**subclasses**/
//???
class Department(val name:String)

class Manager(firstName:String, lastName: String, title:String, val department:Department) extends
Employee(firstName, lastName, title)

val mathematics = new Department("mathematics")
val alan = new Manager("""""""")


/**equals, hashCode, toString**/
val anotherAda
override def equals(x:Any):Boolean = {
  if (!x.IsInstanceOf[Employee]) false
  else{
    var other = x.asInstanceOf[Employee]
    other.firstName.equals(this.firstName) && 
    other.lastName.equals(this.lastName) &&
    other.title.equals(this.title)
  }
}

override def hashCode:Int = {
  var res = 19
  res = 31*res + firstName.hashCode
  res = 31*res + lastName.hashCode
  res = 31*res + title.hashCode
  res
}
newAda.equals(anotherAda)

/**case classes**/
//copy, toString, hashCode, and equals. Case classes will do all of that for us.
case class Department(val name:String)
val toys = new Department("Toys")
val toys2 = new Department("Toys")
toys.hashCode == toys2.hashCode

//pattern matching
val name = toys match {
  case Department(n) => n 
  case _ => "Unknown"
}
println(name)
//toys

/**Parameterized Types On Classes**/
case class Box[T](t:T)
val inBox = new(1) //Box[Int]
val inBox2:Box[Int] = Box(1)

/**Singleton Objects, do not need class**/
object MyObject{
  def foo(x:Int, y:Int) = x+y
}
MyObject.foo(5, 10)

/**The Magic Apply Method**/

class foo(x:int){
  def bar(y:Int) = x+y
}

object MaigcApply extends App{
  var foo = new foo(10)
  println(foo.bar(20)) //30
}

class foo(x:int){
  def apply(y:Int) = x+y
}

object MaigcApply extends App{
  var foo = new foo(10)
  println(foo.apply(20)) //30 
  println(foo(20)) //30
}


/**tuples**/
object Tuples extends App{
  val t = (1, "Cool", 402.00)
  println(t._1)
  println(t._2)
  println(t._3)

  val t1:(Int, String, Double) = t 
  val t2:Tuple3[Int, String, Double] = t
}

case class Department(name:String)
val u = Department("4", Department("QA"))
println(u)
val u2 = u.swap
println(u2)
println()

/**Creating A Function**/
object function extends App{
  val f1:Function1[Int, Int] = new Function1[Int, Int]{
    def apply(x:Int):Int = x+1
  }
}

f1.apply(3)

val f0:Function0[Int] = new Function0[Int]{

}

val f2:Function2[Int, String, String] = new Function2[Int, String, String]{
  def apply(x:Int, y:String) = y+x
}

/**method vs function**/
object MyObject {
  val f = (x:Int) => x+1
  def g(x:Int) = x + 1
}
object MethodOrFunction extends App{
  println(MyObject.f.apply(4)) //function
  println(MyObject.f(4)) //function
  println(MyObject.g(4)) //method
}

/**Converting A Method To A Function**/
class Foo(x:Int){
  def bar(y:Int) = x+y 
}

object ConvertingDefsToFunctions extends App{
  val x = new Foo(10)
  val f = x.bar _
}

class Baz(z:Int){
  def qux(f:Int => Int) = f(z)
}

class Foo(x:Int){
  def bar(y:Int => Int) = y(x)

}


/**Lists**/
objects Lists extends App{
  val a = List(1,2,3,4,5)
  val a2 = List.apply(1,2,3,4,5)
  Nil // empty list
  1 :: 2 :: 3 :: 4 :: 5 :: Nil
  Nil.::(5)
  
  println(a.head) //1
  println(a.tail) //2,3,4,5
  println(a.init) //1,2,3,4
  println(a.last) //5

  println(a(4)) //5
  println(a.apply(4)) //5
  println(a.min) //1
  println(a.max) //5
  println(a.isEmpty) //false
  println(a.nonEmpty) //true
  println(a.updated(3,100)) //1,2,3,100,5

  println(a.mkString(",")) //"1,2,3,4,5"
  println(a.mkString("**")) //"1**2**3**4**5"
  println(a.mkString("[", "**", "]")) //"[1**2**3**4**5]"
}

/**sets**/
objects Sets extends App{
  val set = Set(1,2,3,4)
  val set2 = Set(1,2,3,4,5)
  val set3 = Set(1,2,3,4,5,6)
  val set4 = Set(1,2,3,4,5,6,6,7)

  println(set)
  println(set2)
  println(set3)
  println(set4)

  val set5 - Set(1,2)

  println(set diff set4) //empty set set()
  println(set4 diff set) //set(5,6,7)
  println(set union set3) //set(1,2,3,4,5,6)
  println(set intersect set3) //set(1,2,3,4)
  println(set5 intersect set4) //set(1,2)
  println(set ++ set2) //set(1,2,3,4,5)
  printlin(set ++ List(15,19,20)) //set(1,2,3,4,5,15,19,20)
  println(set -- set5) //set(3,4)
  println(set - 3) //set(1,2,4)

  println(set.apply(4)) //true
  println(set.contains(10)) //false
}

/**maps and symbols**/
object Maps extends App{
  val m = Map.apply((1, "One"), (2, "Two"), (3, "Three"))
  val m2 = Map((1, "One"), (2, "Two"), (3, "Three"))

  val t:(Int, String) = 3 -> "Three"//(3, "Three")
  println(t)
  
  val m3 = Map(1 -> "One", 2 -> "Two", 3 -> "Three")

  println(m3.get(1)) //Some("One")
  println(m3.apply(1)) //"One"
  println(m3(1)) //"One"
  println(m3.get(4)) //None
  //println(m3(4)) //Error

  println(m3.toList) //List()
  println(m3.keys) // set(1,2,3)
  println(m3.keySet)
  println(m3.values) //Maplike
  println(m3.values.toSet) //Set

  val s = new String("Co")
  val s2 = "Co" //interned
  println(s == s2) //true
  println(s eq s2) //false

  val co = Symbol("Co")
  val co2 = 'Co
  println(co == co2)
  println(co eq co2)

  val elements:Map[Symbol, String] = Map('Co -> "Cobalt", 'H -> "Helium")
  println(elements.get(1))
}

/**Arrays And Repeated Parameters**/
object Arrays extends App{
  val a:Array[Int] = Array(1,2,3,4)
  println(a.head)
  println(a.tail)
  println(a.init)
  println(a.last)
  println(a.apply(2))
  println(a.max)
  println(a.isEmpty)

  def repeatedParameterMethod(x:Int, y:String, z:Any*) = {
    println(z)
    "%d %ss give you %s".format(x, y, z.mkString(", "))
  }

  repeatedParameterMethod(3, "egg", "a delicious sandwich", "protein", "high cholesterol")

}

/**Ranges**/
object Ranges extends App{
  var r = 1 to 10
  val r2 - 1 until 10
  println(r) //1-10
  println(r2) //1-9
  println(r2.head) //1
  println(r2.tail) //2-9

  val r2 = 2 to 10 by 2
  println(r3) //2 4 6 8 10
  println(r3.reverse) //10 8 6 4 2

  var r5 - ('a' to 'z')
  println(r5)

  val r6 = Range(1,10)
  println(r6)

  val r7 = Range(1,10,2)
  println(r7)

  val r8 = Range.inclusive(1, 10)
  println(r7)

  val r9 = Range.inclusive(1, 10,2)
  println(r9)

  for (i <- 1 to 10){
    println(i+1)
  }

  for (i <- 2 to 10 by 2){
    println(i+1)
  }
}

/**map**/
object MapFunction extends App{
  val a = List(1,2,3,4,5,6)
  val f = (x:Int) => x + 1
  println(a.map(f))
  println(a.map((x:Int) => x + 1))
  println(a.map(x => x + 1))
  println(a.map(_ + 1))
  println(a.map(1+ _))

  val b = Set("Brown", "Red", "Green", "Purple", "Gray", "Yellow")
  println(b.map(x => x.size)) // 6 4 3 5
  println(b.map(_.size)) // 6 4 3 5
  println(b.map(x => (x, x.size))) // set((green, 5), (brown, 5), (gray, 4))
  val fifaMensChamps = Map('Germany -> 4, 'Brazil -> 5, 'Italy -> 4, 'Argentina -> 2)
  println(fifaMensChamps.map(t => (Symbol.apply("Team " + t._1.name), t._2)))

  println("Hellow!".map(c = (c + 1).toChar))
  println(Some(4).map(1+))
}

/**filter, filterNot, And exists**/
object filterFunction extends App{
  val a - 1 to 10
  println(a.filter(x => x % 2 == 0)) //filter even numbers
  println(a.filterNot(x => x % 2 == 0)) //filter odd numbers
  println(a.exists(x => x % 2 == 0)) //Does it have even numbers

  println(a.filter(_ % 2 == 0)) //filter even numbers
  println(a.filterNot(_ % 2 == 0)) //filter odd numbers
  println(a.exists(_ % 2 == 0)) //Does it have even numbers

  def filterVowels(s:String) = s.toLowerCase.filter(c => Set('a', 'e', 
  'i', 'o', 'u').contains(c))
  println(filterVowels("Orange"))

  val b = Set("Red", "Blue", "Green", "Purple", "Orange")
  println(b.filter(s => filterVowels(s).size > 1))

  val m = Map(1 -> "One", 2 -> "Two")
  println(m.filterKeys(_ % 2 == 0)) //Map(2 -> Two)

  println(Some(5).filter(_ % 2 == 0))
  println(Some(4).filter(_ % 2 == 0))
}

/**forEach**/
object ForEach extends App{
  val a = 1 to 10
  println(a.map(x => println(x)))
  println(a.foreach(x => println(x)))

  a foreach println // 1 2 3 ...
}

/**flatMap**/
object FlatMap extends App{
  val a = List(1,2,3,4,5)
  println(a.map(x => List(-x, 0, x)))
  println(a.map(x => List(-x, 0, x)).flatten)
  println(a.flatMap(x => List(-x, 0, x)))

  val b:List[List[List[Int]]] = List(List(List(1,2,3), List(4,5,6)),
  List(List(7,8,9), List(10,11,12)))
  println(b.flatMap(c => c))
  println(b.flatMap(c => c).flatMap(c => c))

  println(Set(2,4,10,11).flatMap(x => Set(x, x * 5)))

  val origMap = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
  println(origMap.flatMap(t => Map(t._1 -> t._2, (t._1 * 100) -> (t._2 " Hundred"))))

  println(None.flatMap(x => Some(x + 19)))

}

/**For Comprehensions**/
object ForComprehensions exten App{
  for (i <- 1 to 10){
    println(i)
  }

  val results = for(i <- 1 to 10) yield (i + 1)
  println(result1)

  val result2 = (1 to 10).map

}







