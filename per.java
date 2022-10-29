public class per {

	public static boolean isPermutation(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int frequency[] = new int[255];
        
        if (len1 != len2) {
            return false;
        }
        
        if (len1 == len2) {
            for (int i = 0; i < len1; i++) {
                int val = (int) str1.charAt(i);
                frequency[val]++;
            }
            
            for (int i = 0; i < len2; i++) {
                int val = (int) str2.charAt(i);
                
                if (frequency[val] != 0) {
                    frequency[val]--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
