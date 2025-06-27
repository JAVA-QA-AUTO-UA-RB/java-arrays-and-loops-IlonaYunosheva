import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Нижче перша частина завдання для прикладу
        // Там де в завданні вказані початкові дані у вигляді масиву - ініціалізуйте окремий масив
        // Нижче обробляйте масив, додайте логіку обробки
        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }

        int[] magicBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int sum = 0;

        for (int i = 0; i < magicBoard.length; i++) {
            sum += magicBoard[i];
        }

        System.out.println("Сума чисел на магічній дошці: " + sum);
        System.out.println("Двері  до наступної кімнати відкрились!");

        int[] dragonAttacks = {8, 16, 24, 32, 40};
        boolean EvenNumber = true;

        for (int attack : dragonAttacks) {
            if (attack % 2 != 0) {
                EvenNumber = false;
                break;
            }
        }
        if (EvenNumber) {
            System.out.println("Атаки парні! Захист активовано!");
        } else {
            System.out.println("Увага! Непарна атака!");
        }

        System.out.print("Введи своє улюблене число: ");
        int favorite = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < secretCode.length; i++) {
            if (secretCode[i] == favorite) {
                found = true;
                break;
            }
        }

        if (!found) {
            for (int i = 0; i < magicBoard.length; i++) {
                if (magicBoard[i] == favorite) {
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            for (int i = 0; i < dragonAttacks.length; i++) {
                if (dragonAttacks[i] == favorite) {
                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Твій ключ знайдено!");
        } else {
            System.out.println("Треба більше магії...");
        }
// Інші частини пригоди додайте тут!
    }
}