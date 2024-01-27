public class PracticeSet3{
    public static void main(String[] args) {
        //Q1) Write a java program to convert a string to lowercase
        String s = "Lovely Professional University";
        System.out.println(s.toLowerCase());
        //Q2) Write a java program to replace spaces with underscores
        System.out.println(s.replace(" ", "_"));
        //Q3) Write a java program to replace <|Name|> with Your name
        String letter = "Dear <|Name|>, Trans a lot ";
        System.out.println(letter.replace("<|Name|>", "Nilesh"));
        //Q4) Write a java program to find double or triple spaces
        String z = "My  name   is   <|Ayush|>";
        System.out.println(z.indexOf("  "));
        System.out.println(z.indexOf("   "));
        //Q5) Write a java program to format following strings using espace Sequences
        String t = "Dear HOD, Tommorrow i will be absent due to health issues.Thank you ";
        String tm = "Dear HOD,\n\tTommorrow i will be absent due to health issues.\nThank you ";
        System.out.println(tm);

    }
}