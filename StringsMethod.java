public class StringsMethod{
    public static void main(String[] args) {
        String Name = "AyuSh MeHTa";
        System.out.println(Name);

        // int value = Name.length();
        // System.out.println(value);

        // String abc = Name.toLowerCase();
        // System.out.println(abc);

        // String abc1 = Name.toUpperCase();
        // System.out.println(abc1);

        // String abc2 = Name.trim();
        // System.out.println(abc2);

        // String abc3 = Name.substring(0, 4);// 0 is included but  4 is excluded
        // System.out.println(abc3);

        // String abc4 = Name.replace('M', 'B');
        // System.out.println(abc4);

        // System.out.println(Name.startsWith("Ay"));// Check the strings that start with given string or not 
        // System.out.println(Name.endsWith("Ta"));// Check the strings that ends with given string or not

        // System.out.println(Name.charAt(3));//Give the characters at that index

        // System.out.println(Name.indexOf("M"));//
        // System.out.println(Name.indexOf("M", 4));//
        // System.out.println(Name.indexOf("My", 5));//return -1 if not find the character
        // System.out.println(Name.lastIndexOf("eH"));//
        // System.out.println(Name.lastIndexOf("yu", 4));//

        // String school = "IJS";
        // System.out.println(school.equals("IJS"));//Case sensitive  -> true
        // System.out.println(school.equals("IjS"));// -> false
        // System.out.println(school.equalsIgnoreCase("IjS"));// it ignores the case Sensitivity -> true


        // int count =0, ans =0;
        // for(int i=0;i<Name.length();i++){
        //     if(Name.charAt(i)==' '){
        //         count++;
        //     }
        // }
        // ans=count+1;
        // if(count == 0){ 
        // System.out.println("Number of words present in the string - "+count);
        // }
        // else{
        // System.out.println("Number of words present in the string - "+ ans);
        // }

        String ab = "";
        int j=Name.length();
        int i;
        for(i=Name.length()-1;i>=0;i--){
            if(Name.charAt(i)==' '){
                ab=ab+Name.substring(i+1,j) + " ";
                j=i;
            }
        }
        ab=ab+Name.substring(i+1,j);
        System.out.println(ab);
    }
}