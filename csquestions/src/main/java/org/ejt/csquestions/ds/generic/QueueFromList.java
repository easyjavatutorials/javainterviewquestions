package org.ejt.csquestions.ds.generic;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @Intent : Demonstrates how java one can create its own queue in java via using linked list as under laying java DS.
 *           This time using java Generics.
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

public class QueueFromList<T> {
    private List<T> queueList = new LinkedList<T>();

    public void enqueue(T data) {
        // Always add object to the last position.
        queueList.add(data);
    }

    /**
     * @return first integer element exist in the queue.
     */
    public T dequeue() {
        // Always dequeue element from the first poistion.
        if (queueList.size() == 0) {
            return null;
        }
        return queueList.remove(0);
    }
    
    public String toString() {
        return "Total elements in Queue ["+queueList.size()+"] QueueList Data ["+queueList+"]";
    }
    
    public static void main(String[] args) {
        System.out.println("Demo of Queue list java generics..");
        QueueFromList<String> queueFromList = new QueueFromList<String>();
        queueFromList.enqueue("A");
        queueFromList.enqueue("B");
        queueFromList.enqueue("C");
        queueFromList.enqueue("D");
        
        //Print Current state of the queue.
        System.out.println("Queue values after 4 insertions done. "+queueFromList);
        //Now dequeue elements from queue.
        //Note that while dequeing order or elements will be same as inserted order.
        System.out.println("Dequeued Element "+queueFromList.dequeue());
        System.out.println("Dequeued Element "+queueFromList.dequeue());
        System.out.println("Dequeued Element "+queueFromList.dequeue());
        System.out.println("Dequeued Element "+queueFromList.dequeue());
    }

}
