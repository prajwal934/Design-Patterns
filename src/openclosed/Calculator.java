package openclosed;

// No modification in our calculator functionality
// We can keep adding extension by create new operations
public class Calculator {
    public int calculateNumber(int num1 , int num2, Operation operation) {
        return  operation.perform(num1 , num2);
    }

}
