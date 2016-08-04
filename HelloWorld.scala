// Written by Deepanshu Gupta
// Part of Scala learning series
// Based on the book from Scala Cookbook by Alvin Alexander


// Define a string variable
val s = "Hello World"

// print a string
println(s)

// get the length of the string
lengthString = s.length

// concatenate 2 strings
newString = "Hello" + "World"

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

// ignore the cases and check if 2 strings are equal
var equalityIgnoreCaseBoolean = dropString.equalsIgnoreCase(getString)