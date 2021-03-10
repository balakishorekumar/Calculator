/**
 * Program:
 * Simple Calculator
 *
 * Program Statement:
 * This program accepts one of the following arguments :
 * "+"
 * "-"
 * "*"
 * "/"
 *
 * If the first argument of the program matches on of the above strings[1a], execute the mathematical function [2a].
 * Display this result in the console[3a]
 *
 * If the first argument does not matches any of the above string [1b], display an error
 * message in the console[2b]
 *
 */


const val ADD: String = "+"
const val SUBTRACT = "-"
const val MULTIPLY = "*"
const val DIVISION = "/"
const val errorMessage = "An error has occurred"

// create two test operands to see if our program runs properly

const val testOperandOne = 5.0
const val testOperandTwo = 4.0
fun main() {
    val args = "8"

    start(args)

}

fun start(symbolised: String) {
    if (checkArguments(symbolised)) {
        displayResult(evaluateBinomial(testOperandOne, testOperandTwo, symbolised))
    } else {
        displayResult(errorMessage)
    }
}

// single  expression syntax for single line codes
fun displayResult(result: String) = println(result)

fun evaluateBinomial(opOne: Double, opTwo: Double, sym: String): String {
    return when (sym) {
        //equals
        ADD -> (opOne + opTwo).toString()
        SUBTRACT -> (opOne - opTwo).toString()
        MULTIPLY -> (opOne * opTwo).toString()
        DIVISION -> (opOne / opTwo).toString()
        //otherwise
        else -> errorMessage
    }

}

// returns true or false based on if the operator matches our constants
fun checkArguments(symbolised: String): Boolean {
    return when (symbolised) {
        //equals
        ADD -> true
        SUBTRACT -> true
        MULTIPLY -> true
        DIVISION -> true
        //otherwise
        else -> false
    }

}