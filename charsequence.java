public class charsequence {
    public static void main(String[] args) {
   
        //toUpperCase():
        String s1 = "Java Programs";
        System.out.println("Upper case: "+s1.toUpperCase());

        //toLowerCase():
        String s2 = "Java class";
        System.out.println("lowercase: "+s2.toLowerCase());

        //trim():
        String s3 = "         java programs ece c and d        ";
        System.out.println("Before trim the string is: "+s3);
        System.out.println("After trim the string is: "+s3.trim());


    }
}
