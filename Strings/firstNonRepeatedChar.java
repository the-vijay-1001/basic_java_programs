// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String input = "swiss";
        for(int i = 0; i < input.length(); i++){
            for(int j = i+1; j < input.length(); j++){
                if(input.charAt(i) != input.charAt(j)){
                    System.out.println(input.charAt(j));
                    return;
                }
            }
        }
    }
}
