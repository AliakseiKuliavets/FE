package casino._21;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LogicGame {

    public void startGame(Gamer gamer, Bankir bankir) {
        System.out.println("Welcome to 21 game:");
        System.out.println("Что бы начать игру нажмите 1");
        System.out.println("Что бы прочесть правила игры нажмите Q");
        System.out.println("Что бы выйти нажмите F");
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine().toUpperCase();
        switch (start) {
            case "F" -> startGame(gamer, bankir);
            case "Q" -> readTextDocument("text21.txt");
            case "1" -> gameProcess(gamer, bankir);
        }
        startGame(gamer, bankir);
    }

    private void endGame(Gamer gamer, Bankir bankir) {
        System.out.println("Что бы выйти нажмите F");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
        if (s.equals("F")) {
            startGame(gamer, bankir);
        }
    }

    private void gameProcess(Gamer gamer, Bankir bankir) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teкущая ставка " + gamer.getBit());
        System.out.println("Хотите посмтореть ваш баланс нажмите 1");
        System.out.println("Хотите посмотреть ваши карты нажмите 2");
        System.out.println("Хотите взять карту нажмите 3");
        System.out.println("Хотите сделать ставку нажмите 4");
        System.out.println("Что бы проверить выграли ли вы нажмите 5");
        System.out.println("Что бы выйти нажмите F");
        String s = scanner.nextLine().toUpperCase();
        switch (s) {
            case "F" -> {
                startGame(gamer, bankir);
                resetCardGamer(gamer);
            }
            case "1" -> searchBalance(gamer);
            case "2" -> searchCards(gamer);
            case "3" -> addCards(gamer, bankir);
            case "4" -> bidGamer(gamer, bankir);
            case "5" -> {
                if (gamer.getBit() != 0) {
                    winOrLostSearch(gamer, bankir);
                } else {
                    System.out.println("Для игры нужна ставка ");
                    gameProcess(gamer, bankir);
                }
            }
        }
        gameProcess(gamer, bankir);
    }

    // Обнулуить карты игрока и обновить все карты(восстоновить)
    private void resetCardGamer(Gamer gamer) {
        Cards cards = new Cards();
        gamer.setCardsMap(null);
        cards.returnAllCards();
    }

    private void searchBalance(Gamer gamer) {
        System.out.println("Your money: " + gamer.getMoneyAccount());
    }

    private void searchCards(Gamer gamer) {
        System.out.println("Your cards: " + gamer.getCardsMap());
    }

    // Взять карту (3)
    private void addCards(Gamer gamer, Bankir bankir) {
        GameManagment gameManagment = new GameManagment(gamer, bankir);
        gameManagment.addCardGamer(gamer);
    }

    // Проврека выграл или нет (5)
    private void winOrLostSearch(Gamer gamer, Bankir bankir) {
        GameManagment gameManagment = new GameManagment(gamer, bankir);
        int numberBankin = gameManagment.addCard();
        int n = gameManagment.winOrLost();
        if (n == 0) {
            yourWinGamer(gamer, bankir);
        } else if (n == 1) {
            yourLost(gamer, bankir);
        } else if (n == -1) {
            if (numberBankin > gamer.getNumberWin()) {
                yourLost(gamer, bankir);
            }else if (numberBankin == gamer.getNumberWin()) {
                yourLost(gamer, bankir);
            }else if (numberBankin == 21) {
                yourLost(gamer, bankir);
            } else {
                yourWinGamer(gamer, bankir);
            }
        }
        resetCardGamer(gamer);
    }

    private void yourWinGamer(Gamer gamer, Bankir bankir) {
        GameManagment gameManagment = new GameManagment(gamer, bankir);
        System.out.println("You win");
        searchCards(gamer);
        System.out.println("The cards Bankin: " + bankir.getCardsBankir());
        gameManagment.winMoney(gamer);
    }

    private void yourLost(Gamer gamer, Bankir bankir) {
        System.out.println("You lost");
        searchCards(gamer);
        System.out.println("The cards Bankin: " + bankir.getCardsBankir());
    }

    private void bidGamer(Gamer gamer, Bankir bankir) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Поставте деньги нажмите 1");
        System.out.println("Хотите выйти нажмите нажмите F");
        String game = sc.nextLine();
        switch (game) {
            case "F" -> gameProcess(gamer, bankir);
            case "1" -> {
                int n = bitGamer(gamer, bankir);
                if (n == 1) {
                    System.out.println("Ставка принята");
                    gameProcess(gamer, bankir);
                } else {
                    System.out.println("Мало денег :( ");
                    System.out.println("Сделайте ставку меньше нажмите 1");
                    System.out.println("Хотите выйти нажмите нажмите F");
                    Scanner scanner1 = new Scanner(System.in);
                    String s1 = scanner1.nextLine().toUpperCase();
                    switch (s1) {
                        case "F" -> gameProcess(gamer, bankir);
                        case "1" -> bidGamer(gamer, bankir);
                    }
                }
            }
        }
    }
    private int bitGamer(Gamer gamer, Bankir bankir) {
        GameManagment gameManagment = new GameManagment(gamer, bankir);
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Укажите сколько хотите поставить ");
        searchBalance(gamer);
        double game = sc.nextDouble();
        int n = gameManagment.gamerMoneyBid(gamer, game);
        if (n == 1) {
            return 1;
        } else {
            return -1;
        }
    }

    // Прочесть условия игры (Q)
    private void readTextDocument(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}