public class PracticeProblem {

	public static void main(String args[]) {

        // Test the insertion sort
        char[] letters = {'d', 'b', 'a', 'c', 'e'};
        
        System.out.print("Before sorting: ");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        
        insertionSort(letters);
        
        System.out.print("\nAfter sorting: ");
        for (char c : letters) {
            System.out.print(c + " ");
        }
        // Output: a b c d e
    }
    
    public static void insertionSort(char[] characters) {
        for (int i = 1; i < characters.length; i++) {
            char current = characters[i];
            int j = i - 1;
            
            // Shift elements greater than current to the right
            while (j >= 0 && characters[j] > current) {
                characters[j + 1] = characters[j];
                j--;
            }
            
            // Insert current in correct position
            characters[j + 1] = current;
        }
    }
}


