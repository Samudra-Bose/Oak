public class StringBui {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.length() +" "+ sb.capacity());
        sb.append(2);
        System.out.println(sb);
        System.out.println(sb.insert(0,'L'));
        System.out.println(sb);
    }
}
