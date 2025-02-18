import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;

/**
 * SortedStack program reads a list of integer numbers from user input
 * and stores them in a Stack sorted in ascending order.
 *
 * <p>The program utilizes the Java Collections Framework for sorting and
 * ensures that it runs from the command line without requiring an IDE.</p>
 *
 * <p><b>Code Reuse:</b></p>
 * <ul>
 *   <li> Uses {@code Stack<Integer>} from Java Collections Framework instead of LinkedList. </li>
 *   <li> Uses {@code Collections.sort()} for sorting instead of implementing a sorting algorithm manually. </li>
 *   <li> Uses {@code Scanner} for dynamic user input instead of handling raw input streams. </li>
 * </ul>
 *
 * <p><b>How to Run from the Command Line:</b></p>
 * <ol>
 *   <li> Open a terminal or command prompt. </li>
 *   <li> Navigate to the directory containing {@code SortedStack.java}. </li>
 *   <li> Compile the program using:
 *        <pre>javac SortedStack.java</pre>
 *   </li>
 *   <li> Run the program using:
 *        <pre>java SortedStack</pre>
 *   </li>
 * </ol>
 *
 * <p><b>How to Generate Javadoc:</b></p>
 * <ol>
 *   <li> Ensure that JDK is installed by running:
 *        <pre>java -version</pre>
 *   </li>
 *   <li> Run the following command to generate documentation:
 *        <pre>javadoc -d docs SortedStack.java</pre>
 *   </li>
 *   <li> Open the generated {@code docs/index.html} in a web browser to view the documentation. </li>
 * </ol>
 *
 * @author [Saravanan Soundappan]
 * 
 */
public class SortedStack {

    /**
     * Reads integer inputs from the user, stores them in a Stack,
     * and sorts them in ascending order.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        Stack<Integer> numbers = new Stack<>();  

        System.out.println("Enter integers (type 'done' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.push(scanner.nextInt());  
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
                }
            }
        }

        scanner.close();  

        // Convert Stack to List, sort it, then push back to Stack
        Collections.sort(numbers);  
        Stack<Integer> sortedStack = new Stack<>();
        for (Integer num : numbers) {
            sortedStack.push(num);
        }

        // Printing the sorted Stack
        System.out.println("Sorted Numbers: " + sortedStack);
    }
}
