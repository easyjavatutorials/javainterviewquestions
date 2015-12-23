package org.ejt.csquestions;

/**
 * 
 * @Intent :
 * 
 *           Finds whether a given String contains all unique characters.
 * 
 * @Approach :
 *              
 *           We know that there are only 256 characters in ASCII. For every character we will mark appearance of character somewhere, 
 *           If for each iteration we can mark appearance of character, for next character we would be able to know if current character already did appeared.
 *           
 *           Array size would be 256 as total 8 bits are used to represent a character in ASCII 
 *           which results to 2^8=256. 
 *           
 * @Psudocode:
 *           
 *           For all characters in the string take character one by one as currentChar
 *              Check if currentChar has already did appeared. return false..
 *              Otherwise mark charCharacter as appeared
 *           at end return true.       
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
public class DuplicateCharacters {
    
    public static void main(String[] args) {
        System.out.println(isUniqueCharacters("abcdefgh") ? "abcdefgh contains only unique characters":"abcdefgh contains duplicate characters.");
        System.out.println(isUniqueCharacters("abcdefga") ? "abcdefga contains only unique characters":"abcdefga contains duplicate characters.");
        System.out.println(isUniqueCharacters("abcdefbb") ? "abcdefbb contains only unique characters":"abcdefbb contains duplicate characters.");
        System.out.println(isUniqueCharacters("zdksegh") ? "zdksegh contains only unique characters":"zdksegh contains duplicate characters.");
    }
    
    public static boolean isUniqueCharacters(String validationString) {
        boolean [] charPresent = new boolean [256]; 
        for (int i=0;i<validationString.length();i++) {
            int charCode = validationString.charAt(i);
            if(charPresent[charCode]) {
                return false;
            }else {
                charPresent[charCode]=true;
            }
        }
        return true;
    }
}
