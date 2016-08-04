// Written by Deepanshu Gupta
// Part of Scala learning series
// Based on the book from Scala Cookbook by Alvin Alexander


// Define a string variable
val s = "Hello World"

// print a string
println(s)

// get the length of the string
var lengthString = s.length

// concatenate 2 strings
var newString = "Hello" + " " + "World"

// iterate over each character 
newString.foreach(println)

// treat string as byte
newString.getBytes.foreach(println)

// filter characters
var filterString = s.filter(_ != 'l')
println(filterString)

// drop first 2 characters from the string 
var dropString = s.drop(2)

// get only the first 2 characters
var getString = s.take(2)

// Capitalize the first character of a string
var capString = s.drop(2).capitalize

// define a null string
var nullString:String = null

// Check equality of 2 strings
var equalityBoolean = capString==dropString

// convert string to upper/lower
// Note this function works only with strings and not characters
// throws a null pointer exception if the string is null
var upperString = dropString.toUpperCase
var lowerString = s.toLowerCase

// convert character to upper or lower
var upperChar = 'a'.toUpper
var lowerChar = 'A'.toLower

// ignore the cases and check if 2 strings are equal
var equalityIgnoreCaseBoolean = dropString.equalsIgnoreCase(getString)

// multiline string
var newStringMultiline = """The quick brown
fox jumps over
the lazy dog"""
println(newStringMultiline)

// to add/remove margin
var newStringExampleMargin = """ THE QUICK BROWN
|FOX JUMPS OVER
|THE LAZY DOG.""".stripMargin

var anotherStringExampleMargin = """ THE QUICK BROWN
#FOX JUMPS OVER
#THE LAZY DOG.""".stripMargin('#')

// Replace strings
var newStringReplaced =  newStringExampleMargin.replaceAll("\n"," ")

// Scala differentiates between " and '

// split string
// Returns an array
var newStringSplit = newString.split(" ")

// split a csv format
var newStringSplitCSV = "eggs, basket".split(" ")

// trim extra white spaces
var newStringSplitCSVTrim = newStringSplitCSV.map(_.trim)

// split a string based on the regular expressions
var newStringSplitRegex = newString.split("\\s+")

// substitue variables in string

var newAgeInt = 21
var newNameString = "Freddy"
var newWeightDouble = 200.00
// note the s in the beginning of the string 
println(s"$newNameString is $newAgeInt old and weighs $newWeightDouble")


// To perform operations in string 
println(s"$newNameString is ${newAgeInt+1} old and weighs $newWeightDouble")

// make a class
case class Student(name: String, age: Int, weigh: Double)
// add a new element to class
var deepGupta = Student("Deepanshu", 21, 200.00)

// perform operations in string
println(s"${deepGupta.name} is ${deepGupta.age} old")
var newStringVarInString = s"${deepGupta.name} is ${deepGupta.age} old"

// printf style string formating 2f gives 2 decimal places
var newStringVarInStringPrintfStyle = f"${deepGupta.name} is ${deepGupta.age} old and weighs ${deepGupta.weigh}%.2f"


// %c Character
// %d Decimal number (integer, base 10)
// %e Exponential floating-point number
// %f Floating-point number
// %i Integer (base 10)
// %o Octal number (base 8)
// %s A string of characters
// %u Unsigned decimal (integer) number
// %x Hexadecimal number (base 16)
// %% Print a “percent” character
// \% Print a “percent” character

// iterating through each character
val newStringIterateCharacter = newString.map(c => c.toUpper)
val anotherStringIterateCharacter =  newString.map(_.toUpper)
for (c <- newString) println(c)

// for / yield function

var newStringIterativeOperation = for{
    c<-newString
    if c != 'l'
} yield c.toUpper



// self method 
// Note the function is buggy
def toLower(c: Char): Char = (c.toByte + 32).toChar


// Finding pattern in a string
val numPattern = "[0-9]+".r
val address = "123 Forge Way 95014"
val match1 = numPattern.findFirstIn(address)

// get all patterns
val matchAll = numPattern.findAllIn(address)
val matchAllArray = numPattern.findAllIn(address).toArray

// default if no match found 
val matchWithDefault = numPattern.findFirstIn(address).getOrElse("No Match found")

// replace pattern 
val replacePatternString = numPattern.replaceFirst(address, "<TAG>")
val replacePatternStringAll = numPattern.replaceAllIn(address, "<TAG>")

// extract part of strings that match patterns
val newPattern = "([0-9]+) ([A-Za-z]+)".r
val newPattern(count, fruit) = "100 Bananas"
