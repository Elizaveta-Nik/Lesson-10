package String;

public class Document {

    public static void printFirstTwoBlocks(String documentNumber) {//Вывести на экран в одну строку два первых блока по 4 цифры.
        String[] blocks = documentNumber.split("-");//разделитель между блоками
        System.out.println(blocks[0] + " " + blocks[2]);//выводит нужный блок на консоль
    }

    public static void replaceLetters(String documentNumber) {//замена трех букв на звездочки
        String replaceAllLetters = documentNumber.replaceAll("[a-zA-Z]{3}", "***");//ищет любые три буквы и заменяет
        System.out.println(replaceAllLetters);
    }

    public static void printLettersLowerCase(String documentNumber) {//нахождение всех букв, приведение к нижнему регистру, отображение через /
        String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();//ищет только буквы и приводит к нижнему регистру
        System.out.println(lettersOnly.substring(0, 3) + "/" + lettersOnly.substring(3, 6) + "/"
                + lettersOnly.charAt(6) + "/" + lettersOnly.charAt(7));//substring-возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
    }

    public static void printLettersUpperCase(String documentNumber) {//нахождение всех букв, приведение к верхнему регистру, отображение через /
        String lettersOnly = documentNumber.replaceAll("[^a-zA-Z]", "").toUpperCase();
        StringBuilder stringBuilder = new StringBuilder("Letters:"); //создание и модификация строк
        stringBuilder.append(lettersOnly.substring(0, 3));
        stringBuilder.append("/");//добавление
        stringBuilder.append(lettersOnly.substring(3, 6));
        stringBuilder.append("/");
        stringBuilder.append(lettersOnly.substring(6, 7));
        stringBuilder.append("/");
        stringBuilder.append(lettersOnly.substring(7, 8));
        System.out.println(stringBuilder);
    }

    public static void checkLetters(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {//приводит все к нижнему регистру и проверяет (contains) содержание
            System.out.println("Документ содержит последовательность 'abc'.");
        } else {
            System.out.println("Документ не содержит последовательность 'abc'.");
        }
    }

    public static void checkNumbers(String documentNumber) {
        if (documentNumber.startsWith("555")) {//проверка начала
            System.out.println("Документ начинается с '555'.");
        } else {
            System.out.println("Документ не начинается с '555'.");
        }
    }

    public static void checkSequence(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {//проверка конца
            System.out.println("Документ заканчивается на '1a2b'.");
        } else {
            System.out.println("Документ не заканчивается на '1a2b'.");
        }
    }
}





