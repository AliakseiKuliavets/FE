package casino._21;

import java.util.*;

public class GameManagment {
    private final Gamer gamerList;
    private final Bankir bankir;

    public GameManagment(Gamer gamerList, Bankir bankir) {
        this.gamerList = gamerList;
        this.bankir = bankir;
    }

    // Добавить карту игроку и удалить эту карту из Map
    public void addCardGamer(Gamer gamer) {
        Cards cards = new Cards();
        List<String> list = new ArrayList<>(cards.getCards().keySet());

        Map<String, Integer> hashMap = new HashMap<>();
        if (gamer.getCardsMap() != null) {
            hashMap.putAll(gamer.getCardsMap());
        }

        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        String randomKey = list.get(randomIndex);
        Integer randomValue = cards.getCards().get(randomKey);


        int currentIndex = 0;
        for (Map.Entry<String, Integer> entry : cards.getCards().entrySet()) {
            if (currentIndex == randomIndex) {
                randomKey = entry.getKey();
                randomValue = entry.getValue();
            }
            currentIndex++;
        }

        if (randomKey != null && randomValue != null) {
            hashMap.put(randomKey, randomValue);
        }
        cards.getCards().remove(randomKey);
        gamer.setCardsMap(hashMap);
    }

    // Добавить карту игроку и удалить эту карту из Map
    public Map<String, Integer> addCardBankir(Bankir bankir, Cards cards) {
        List<String> list = new ArrayList<>(cards.getCards().keySet());

        Map<String, Integer> hashMap = new HashMap<>();
        if (bankir.getCardsBankir() != null) {
            hashMap.putAll(bankir.getCardsBankir());
        }

        Random random = new Random();
        int randomIndex = random.nextInt(list.size());

        String randomKey = list.get(randomIndex);
        Integer randomValue = cards.getCards().get(randomKey);


        int currentIndex = 0;
        for (Map.Entry<String, Integer> entry : cards.getCards().entrySet()) {
            if (currentIndex == randomIndex) {
                randomKey = entry.getKey();
                randomValue = entry.getValue();
            }
            currentIndex++;
        }

        if (randomKey != null && randomValue != null) {
            hashMap.put(randomKey, randomValue);
        }
        cards.getCards().remove(randomKey);
        bankir.setCardsBankir(hashMap);
        return hashMap;
    }

    // проврека логики игры выграл ли игрок или прогирал
    public int winOrLost() {
        int n = 0;
        Map<String, Integer> cardsMap = gamerList.getCardsMap();

        if (cardsMap != null) {
            for (Integer value : cardsMap.values()) {
                n += value;
            }
        }

        if (n == 21) {
            return 0;
        } else if (n > 21) {
            return 1;
        } else if (cardsMap == null){
            return -1;
        } else {
            return  -1;
        }
    }

    // сложная логика как банкир будет набирать карты что бы выйграть у игрока пересеченная сразу с проверкой
    // что бы максимально приблизиться к 21 но не перебрать
    public int addCard() {
        int n = bankir.getNumber();
        Cards cards = new Cards();
        bankir.setCardsBankir(addCardBankir(bankir, cards));
        Map<String, Integer> cardsMap = bankir.getCardsBankir();

        if (cardsMap != null) {
            for (Integer value : cardsMap.values()) {
                n += value;
                bankir.setNumber(n);
            }
        }


        if (n == 21) {
            return n;
        } else if (n > 21 || (21 - 6) < n) {
            return n;
        } else {
            addCard();
        }
        return n;
    }

    public int gamerMoneyBid(Gamer gamer, double n) {
        if (n < gamer.getMoneyAccount()) {
            double money = gamer.getMoneyAccount();
            gamer.setBit(n);
            double newMoney = money - n;
            gamer.setMoneyAccount(newMoney);
            return 1;
        } else {
            return -1;
        }
    }

    public void winMoney(Gamer gamer) {
        double money = gamer.getMoneyAccount();
        double newMoney = money + (gamer.getBit() + gamer.getBit());
        gamer.setBit(0);
        gamer.setMoneyAccount(newMoney);
    }
}
