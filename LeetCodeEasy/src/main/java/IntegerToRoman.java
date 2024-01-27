public class IntegerToRoman {
    public static String intToRoman (int num){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,1};
        String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0; i< values.length; i++){
            while(num>=values[i]){
                roman.append(romanNumerals[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(999));
    }
}
