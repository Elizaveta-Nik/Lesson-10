package String;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа в формате:xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.");//5554-abc-5678-ABC-1a2b
        String documentNumber = scanner.nextLine();

        Document.printFirstTwoBlocks(documentNumber);
        Document.replaceLetters(documentNumber);
        Document.printLettersLowerCase(documentNumber);
        Document.printLettersUpperCase(documentNumber);
        Document.checkLetters(documentNumber);
        Document.checkNumbers(documentNumber);
        Document.checkSequence(documentNumber);
    }
}
