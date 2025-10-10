// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String str = "Multiplication";
        String out = "";
        for(int i = str.length()-1; i >= 0 ; i--){
            out += str.charAt(i);
        }
        System.out.println(out);
    }
}
