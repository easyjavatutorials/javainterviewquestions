package org.ejt.csquestions.ds;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @Intent : Demonstrates how java one can create its own queue in java via using linked list as under laying java DS.
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

public class QueueFromList {
    private List<Integer> queueList = new LinkedList<Integer>();

    public void enqueue(int data) {
        // Always add object to the last position.
        queueList.add(data);
    }

    /**
     * @return first integer element exist in the queue.
     */
    public Integer dequeue() {
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
        QueueFromList queueFromList = new QueueFromList();
        queueFromList.enqueue(2);
        queueFromList.enqueue(4);
        queueFromList.enqueue(6);
        queueFromList.enqueue(8);
        
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
