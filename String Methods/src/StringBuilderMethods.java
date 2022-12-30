public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder("Platform");
        builder1.append("Independent");
        String string1 = "Platform";
        string1.concat("Independent");

        System.out.println("Length of String= "+string1.length());
        System.out.println("Length of builder = "+builder1.length());
        System.out.println("Capacity of builder = "+builder1.capacity());
        System.out.println("-".repeat(50));
        StringBuilder builder2 = new StringBuilder();
        StringBuilder builder3 = new StringBuilder(32);
        System.out.println("Capacity of builder2 = "+builder2.capacity());
        System.out.println("Capacity of builder3 = "+builder3.capacity());
        builder3.append("web-".repeat(8));
        builder2.append("Web-".repeat(8));
        System.out.println(builder2);
        System.out.println(builder3);
        System.out.println("Capacity of builder2 = "+builder2.capacity());
        System.out.println("Capacity of builder3 = "+builder3.capacity());
        System.out.println("-".repeat(50));
        builder2.deleteCharAt(3).insert(3,'/');
        System.out.println(builder2);
        builder2.replace(3,4,"+");
        System.out.println(builder2);

    }
}
