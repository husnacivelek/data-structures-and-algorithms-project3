import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Project3{

    public static void main(String[] args) throws IOException {
        File f1 = new File("1.txt");
        File f2 = new File("2.txt");
        File f3 = new File("3.txt");
        File f4 = new File("4.txt");
        File f5 = new File("5.txt");
        File f6 = new File("6.txt");
        File f7 = new File("7.txt");
        File f8 = new File("8.txt");
        File f9 = new File("9.txt");
        File f10 = new File("10.txt");
        File[] files = {f1,f2,f3,f4,f5,f6,f7,f8,f9,f10};
        LinearProbingHash<ArrayElement> hash = new LinearProbingHash<>(50);
        for (File file: files){
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                String element = sc.next();
                ArrayElement value = new ArrayElement(element);

                if(!hash.insert(value,value.sumOfCharacters()))
                    hash.contains(value,value.sumOfCharacters()).list.insertLast(file.getName());
                else
                    value.list.insertLast(file.getName());

            }

        }

        Scanner kb = new Scanner(System.in, "ISO-8859-9");
        System.out.print("Enter a word: ");
        String word = kb.nextLine();
        ArrayElement value3 = new ArrayElement(word);
        ArrayElement key = hash.contains(value3, value3.sumOfCharacters());
        if (key != null)
            key.list.toStr();
        else
            System.out.println("No text files includes this word.");

    }

}

