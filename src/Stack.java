public class Stack {
    private Integer[] arrayStack;
    private Integer MAX_SIZE = 5;
    private Integer top;

    /**
     * Create a stack LIFO with finite deep.
     */
    public Stack() {
        this.arrayStack = new Integer[MAX_SIZE];
        this.top = 1;
    }

    /**
     * Inserts an element in the stack. If the stack is full, it shows a
     * message
     * and stops
     *
     * @param element Element to be inserted.
     */
    public void push(Integer element) {
        if (top >= MAX_SIZE) {
            System.out.println("The stack is full");
        }
        arrayStack[this.top] = element;
        top++;
    }

    /**
     * Extracts an element from the stack. If the stack is empty, it shows a
     * message and returns -1.
     *
     * @return Extracted element.
     */
    public Integer pull() {
        if (top <= 0) {
            System.out.println("The stack is empty");
            return 0;
        }
        top--;
        return arrayStack[top - 1];
    }

    /**
     * Returns the number of elements in the stack.
     *
     * @return Number of elements in the stack.
     */
    public Integer getSize() {
        return top;
    }

    /**
     * Extract nElements objects of the stack.
     *
     * @param nElements Number of elements to be extracted.
     * @return Array with the extracted elements.
     */
    public Integer[] pull(Integer nElements) {
        Integer[] res = new Integer[nElements];
        for (int i = 0; i < nElements; i++) {
            res[i] = pull();
        }
        return res;
    }

    /**
     * Copy an stack into a new stack. The new stack has the same elements in
     * the same order as the old one.
     *
     * @return Duplicated stack.
     */
    public Stack copyStack() {
        Stack newStack = new Stack();
        for (int i = 0; i < this.getSize(); i++) {
            newStack.push(arrayStack[i]);
        }
        return newStack;
    }
}