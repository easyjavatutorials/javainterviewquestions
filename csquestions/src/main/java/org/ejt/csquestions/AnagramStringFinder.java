package org.ejt.csquestions;

import java.util.Arrays;
/**
 * An Anagram string is the one which contains same characters but they can be 
 * in different order.
 * 
 * @Intent : Finds whether a provided string is Anagram or not.   
 *
 * @author : www.EasyJavaTutorials.in
 *
 *====================================================================== 
 *
 * Released under http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
public class AnagramStringFinder {

    public static void main(String args[]) {
        String firstString = "aabbccdefgh";
        String secondString = "abcdefghcba";
        if (!validation(firstString, secondString)) {
            System.out.println("Invalid String arguments to check for Anagram.");
            return;
        }

        if (checkAnagram(firstString, secondString)) {
            System.out.println("Provided String are Anagrams.");
        } else {
            System.out.println("Provided Strings are not Anagram Strings.");
        }
    }

    public static boolean validation(String first, String second) {
        if (first == null || second == null || first.equals("") || second.equals("")) {
            // Though can be equal its invalid data.
            return false;
        }

        if (first.length() != second.length()) {
            return false;
        }
        return true;
    }

    /**
     * Checks if provided two strings are Anagram or not.
     * 
     * @param first
     *            string to be checked for Anagram.
     * @param second
     *            string to be checked for Anagram.
     * @return true if provided string are Anagram else false.
     */
    public static boolean checkAnagram(String first, String second) {
        String sortedFirstString = sortedString(first);
        String sortedSecondString = sortedString(second);
        return sortedFirstString.equals(sortedSecondString);
    }

    /**
     * Sorts characters within the String
     * 
     * @param stringToSort
     * @return sorted string based upon characters.
     */
    public static String sortedString(String stringToSort) {
        char[] charData = stringToSort.toCharArray();
        Arrays.sort(charData);
        return String.valueOf(charData);
    }
}
