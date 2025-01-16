/*Exercise 3.3
 * Write a program that will evaluate simple expressions such as 17 + 3 and
 *  3.14159 * 4.7. The expression are to be typed in by the user. The input 
 * always consists of a number, followed by an operator, followed by another
 * number. The operators that are allowed are +, -, *, and /. You can read 
 * numbers with TexIO.getDouble() and the operator with TextIO.getChar(). 
 * Your program should read an expression, print its value, read another 
 * expression, print its value, and so on. The program should end when the user
 * enters 0 as the first number on the line.
 */


/**
 *
 * @author wakura
 */
import textio.TextIO;
public class SimpleExpressionEvaluator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("********SIMPLE EXPRESSION EVALUATOR*********");
        boolean again = true;
        do{
            
            boolean isNegative = false;
            double op1, op2;
            char operator;
            StringBuilder str = new StringBuilder();
            System.out.println("************************************************************************");
            System.out.println("Enter your expression: ");
            TextIO.skipBlanks();
            char ch = TextIO.peek();        //check the next character
            if(ch == '-'){
              isNegative = true; 
              TextIO.getAnyChar();
            }
            op1 = getDouble();          //read the first operand
            if(Double.isFinite(op1)){
                if(isNegative){
                    op1 = -op1;         //make operand 1 negative
                }
            }
            else{
                System.out.println("You entered an invalid expression");
                TextIO.getln();
                continue;
            }
           str.append(op1);
           str.append(" ");
            TextIO.skipBlanks();
            operator = TextIO.peek();
            if(!isValidOperator(operator)){             //checks if the operator is valid
                System.out.println("You've entered an invalid expression");
                TextIO.getln();
                continue;
            }
            str.append(TextIO.getAnyChar());            //read the operator
            TextIO.skipBlanks();
            str.append(" ");
            isNegative = false;
            if(TextIO.peek() == '+'){
                TextIO.getAnyChar();
            }
            else if(TextIO.peek() == '-'){
                isNegative = true;
                TextIO.getAnyChar();
            }
            else if(Character.isDigit(TextIO.peek())){
                //valid expression 
            }             
            else{
                System.out.println("You've entered an invalid expression");
                TextIO.getln();
                continue;
            }
              op2 = getDouble();        //read the second operand
              if(Double.isNaN(op2)){
                  System.out.println("You've entered an invalid expression");
                  TextIO.getln();
                  continue;
              }
                  
              if(isNegative)
                  op2 = -op2;
              str.append(op2);
              if(TextIO.peek() == TextIO.EOLN){
                 double expression_value = getExpressionValue(op1, op2, operator);
                 System.out.printf("The value of the expression: \n\t %s = %1.4f", str.toString(), expression_value);
                 System.out.println();
                 TextIO.getln();
              }
              
            System.out.println("Continue?");
            again = TextIO.getBoolean();
        }while(again);
    }
    
    /**
     * This function reads the next double value from the input source
     * @return The next double value if its a valid double value, else if it 
     * reaches the end of file without finding a valid double value, 
     * POSITIVE INFINITY is return, else returns NEGATIVE INFINITY if the next
     * character is not a valid double value
     */
    private static double getDouble(){
        TextIO.skipBlanks();        //skip past any space characters
        char ch = TextIO.peek();    //check the next character without reading it
        if (Character.isDigit(ch)){
           //the next character is a valid digit, read it
           return TextIO.getDouble();
        }
        else if(TextIO.eof()){
            return Double.POSITIVE_INFINITY;            //reached end of file
        }
        else 
            return Double.NEGATIVE_INFINITY;            //invalid character        
    }
    
    /**
     * This function checks if the operator provided is a valid operator
     * Valid operators are +, -, *, /
     * @param oper  The operator being checked
     * @return True if the operator is valid, returns false otherwise
     */
    private static boolean isValidOperator(char oper){
        return oper == '+' || oper == '-' || oper == '*' || oper == '/';
    }
    
    /**
     * This function calculates the value of the expression entered by the user
     * @param op1   The first operand in the expression
     * @param op2   The second operand in the expression
     * @param operator  The operator in the expression
     * @return 
     */
    private static double getExpressionValue(double op1, double op2, char operator){
        switch(operator){
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            default: 
                return Double.NEGATIVE_INFINITY;                
        }
    }
    
   
    
    
}
