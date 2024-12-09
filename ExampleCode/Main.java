import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args){
        JavaPlusPlusTokenizer tokenizer = new JavaPlusPlusTokenizer();
        StringBuilder input = new StringBuilder();
        input = tokenizer.readFile("C:\\Users\\Ryan\\College\\Penn State\\Fall 2024\\Classes\\Compilers\\interpreter_project\\ExampleCode\\MangoCode.txt");
        List<Token> tokens = tokenizer.tokenize(input.toString());
        tokenizer.printReport(tokens);
    }
}