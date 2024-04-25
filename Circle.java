/*import java.util.Arrays;

 class Practice {
    public static void main(String[] args) {
        String str1 = "Silent";
        String str2 = "Listen";

        if (areAnagrams(str1, str2)) {
            System.out.println("Strings are Anagrams.");
        } 
        else {
            System.out.println("Strings are not Anagrams.");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
*/

/*import java.util.Arrays;
import java.util.List;

 class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 3, 15, 7, 12);

        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}*/

 class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius. Please provide a non-negative value.");
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.setRadius(5.0); 
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Perimeter: " + myCircle.calculatePerimeter());
    }
}


