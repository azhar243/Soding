import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	static List<Integer> fibonacciSequence = new ArrayList<Integer>(); // List contains fibonacci sequence
	static { // To tabulate fibonacci sequence
		fibonacciSequence.add(0); // first element in fibonacci sequence
		fibonacciSequence.add(1); // second element in fibonacci sequence
		while (true) {
			int element = fibonacciSequence.get(fibonacciSequence.size() - 1)
					+ fibonacciSequence.get(fibonacciSequence.size() - 2); // getting last two elements and summing up
																			// to get new element
			if (element <= 4000000) { // checking for the given condition
				fibonacciSequence.add(element);
			} else {
				break;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		bufferedWriter.write(findSum() + "\n"); // Printing the sum of even elements in fibonacci sequence

		bufferedWriter.flush();
		bufferedWriter.close();
		outputStreamWriter.close();
	}

	private static int findSum() {
		int sum = 0;
		for (int element : fibonacciSequence) {
			if ((element & 1) == 0) { // checking whether the element is even
				sum = sum + element;
			}
		}
		return sum;
	}

}
