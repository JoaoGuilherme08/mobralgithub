package TreinamentoGit;
public class Teste {
    public static void main(String[] args){
        String [] data = {"\u250C\u2500\u2500\u2500\u2500\u2500\u2510", 
        "\u2502Hello\u2502",
        "\u2514\u2500\u2500\u2500\u2500\u2500\u2518" };
        for (String s : data) {
            System.out.println(s);
            System.out.println("Hello World");
        }
        for (String s : data){
            System.console().writer().println(s);
        }
    }

    public static void main(String arg1){
        if(arg1 == "hello"){
            System.out.println(arg1 + " World!");
        }else{
            System.out.println("It's not a hello world!");
            //Teste
        }
    }
}