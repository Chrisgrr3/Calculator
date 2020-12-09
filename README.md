# Calculator

This Java program features an Equation abstract class that gives each subclass an *operandOne*(double), *operandTwo*(double), *operation*(String), and *result*(double). Each abstract 
class attribute has its own getter and setter, and the abstract method *performOperation* allows each subclass to evaluate the result of performing the predefined *operation* on 
*operandOne* and *operandTwo*. This method uses *setResult* to change the subclass' *result* attribute, which can then be displayed using the *getResult()* method off of the implementation
of the Addition class or any subclass to the Equation abstract class that the user creates.
