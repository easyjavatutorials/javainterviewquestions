package org.ejt.csquestions.ds.generic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 * @Intent : To display how a Stack is defined as well how its common function works. It uses Java generics to offer a generic 
 * queue that can be catered by any sort of data structure. 
 *
 * @author : www.EasyJavaTutorials.in
 *
 *         ======================================================================
 *
 *         Released under http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in
 *         writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *         CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 *         ====================================================================
 */
public class Stack<T> {
    private T[] data;
    private int top = -1;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(Class<T> clazz, int capacity) {
        this.capacity = capacity;
        data = (T[]) Array.newInstance(clazz, capacity);
    }

    public void push(T value) {
        if (top == capacity - 1) {
            throw new RuntimeException("Capacity exceeded. Cannot accumulate more elements and add value [" + value + "]");
        }
        data[++top] = value;
    }

    public T pop() {
        if (top == 0) {
            throw new RuntimeException("Stack is currently empty. Cannot perform pop.");
        }
        return data[top--];
    }

    public T peek() {
        return data[top];
    }

    public int size() {
        return top + 1;
    }

    public int capacity() {
        return capacity;
    }

    public String toString() {
        return "Integer Stack with capacity [" + capacity() + "] size [" + size() + "] Stack content [" + Arrays.toString(data) + "]";
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(String.class,3);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        try {
            stack.push("D"); // Here you should get runtime exception.
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(stack);

        // Now lets do some pop
        System.out.println("Poping stack element " + stack.pop());
        System.out.println("Poping stack element " + stack.pop());
        System.out.println("Size of Stack after 2 pop operations " + stack.size());

        // Now lets perform some peek operations
        System.out.println("Current element via peek" + stack.peek());
        System.out.println("Size of Stack after peek " + stack.size());
    }
}
