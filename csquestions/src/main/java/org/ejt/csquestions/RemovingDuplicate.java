package org.ejt.csquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @Intent : To display how we can remove duplicate elements from any data structure. Key is to keep a buffer to
 *         maintain what all elements have already checked. If a uniqueBuffer doesn't contains current element, add it
 *         to the uniqueBuffer. However if uniqueBuffer does contain current element, remove it from the provided data
 *         structure.
 * 
 *         We have taken buffer as a map as its very easy to check objects based upon key in a map.
 * 
 *         In following example we have taken Array list to check for duplicate but it can be replace with any desired
 *         data structure.
 *
 * @author : Kalyani
 * 
 * @website: http://EasyJavaTutorials.in
 *
 *         ======================================================================
 *
 *         Released under http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in
 *         writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *         CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 *         ====================================================================
 */
public class RemovingDuplicate {

    public static void removeDuplicate(List<String> dupToRemove) {
        
        //Buffer to maintain checked unique elements.
        Map<String, String> uniqueBuffer = new HashMap<String, String>();        
        for (int i = 0; i < dupToRemove.size(); i++) {
            String checkDuplicate = dupToRemove.get(i);

            if (!uniqueBuffer.containsKey(checkDuplicate)) {
                // Add element to buffer only if hasn't been added yet.
                // Adding null as value as we just care about keys not values.
                uniqueBuffer.put(checkDuplicate, null);
            } else {
                // Element has already marked as unique and its duplicate for current run
                // therefore should be removed from current data structure.
                dupToRemove.remove(i);
                // Since arraylist size is decreased by 1, dropping counter by 1 .
                i--;
            }
        }
    }

    public static void main(String[] args) {
        List<String> duplicateData = new ArrayList<String>();
        duplicateData.add("A");
        duplicateData.add("B");
        duplicateData.add("C");
        duplicateData.add("A");
        duplicateData.add("A");
        duplicateData.add("B");
        duplicateData.add("B");
        duplicateData.add("B");
        duplicateData.add("A");
        duplicateData.add("A");
        duplicateData.add("A");

        System.out.println("Duplicate data list size " + duplicateData.size());
        System.out.println("Duplicate data list content " + duplicateData);

        // Now call remove duplicate
        removeDuplicate(duplicateData);
        System.out.println("List size after duplicate removal: " + duplicateData.size());
        System.out.println("List content after duplicate removal: " + duplicateData);
    }

}
