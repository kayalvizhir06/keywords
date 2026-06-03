public class revwords {
public static void main(String[] args) {
String input="java is fun";
String[] words=input.split(" ");
for(String word : words) {

for(int i=word.length()-1;i>=0;i--) {
rev+=word.charAt(i);
}
System.out.print(" ");
}
}
}
