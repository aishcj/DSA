/*
Defanging an IP Address

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

 */

package arrays;

public class DefangingIPAdd {
    public String defangIPaddr(String address) {
        int size= address.length();
        String newAdd = new String();
        for(int i =0; i<size;i++){
            if(address.charAt(i) == '.')
                newAdd += "[.]";
            else
                newAdd+=address.charAt(i);
        }

        return newAdd;
    }
}
