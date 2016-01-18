package org.ejt.csquestions;

/**
 * 
 * @Intent :Provided two strings say str1 and str2, you need to check if str2 is rotated version of str1 or not.
 * 
 *         Example of rotated string. str1=easyjavatutorials.in & str2 = tutorials.ineasyjava
 * 
 *         As you can both str1 and str2 are made of same words the only thing is easyjava has been removed from the
 *         front of str1 and appended at the last.
 * 
 *         The easiest way to check if we append str2 to str2 and then can check if str1 is substring of str2 str2 is
 *         rotation of str1 else str2 is not rotation of str1
 * 
 * @Output 
 * 
 *         =================================================================================================
 * 
 *         Is [tutorials.ineasyjava] is rotation of [easyjavatutorials.in] Answer [true]
 * 
 *         Is [tutorials.i2neasyjava] is rotation of [easyjavatutorials.in] Answer [false]
 * 
 *         =================================================================================================
 *
 * @author : Kalyani
 * 
 * @website : http.EasyJavaTutorials.in
 * 
 * 
 *          ======================================================================
 *
 *          Released under http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in
 *          writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *          CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing
 *          permissions and limitations under the License.
 *          ====================================================================
 */
public class CheckRotation {

    public static boolean isRotation(String str1, String str2) {

        // Validation if invalid data return false.
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return false;
        }
        String str3 = str2 + str2;
        return str3.contains(str1);
    }

    public static void main(String[] args) {
        String str1 = "easyjavatutorials.in", str2 = "tutorials.ineasyjava";
        System.out.println("Is [" + str2 + "]" + " is rotation of [" + str1 + "] Answer [" + isRotation(str1, str2) + "]");
        str2 = "tutorials.i2neasyjava";
        System.out.println("Is [" + str2 + "]" + " is rotation of [" + str1 + "] Answer [" + isRotation(str1, str2) + "]");
    }

}
