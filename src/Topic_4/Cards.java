package Topic_4;

abstract class Cards {
    //создаем абстрактный класс для наследования
    protected String nameOfBank;
    protected long cardNumber;
    protected String userId;
    protected String validThruMonth, validThruYear;
    protected int moneyOnCard, amount;

    protected Cards(String nameOfBank, long cardNumber, String userId, String validThruMonth, String validThruYear, int moneyOnCard) {
        this.nameOfBank = nameOfBank;
        this.cardNumber = cardNumber;
        this.userId = userId;
        this.validThruMonth = validThruMonth;
        this.validThruYear = validThruYear;
        this.moneyOnCard = moneyOnCard;
    }
    //создаем несколько методов

    protected void setMoneyOnCard(int moneyOnCard) {
        this.moneyOnCard = moneyOnCard;
    }

    int getMoney(int sum) {
        amount = sum;
        return amount;
    }

    void getInformation() {
        System.out.println(nameOfBank);
        System.out.println(cardNumber);
        System.out.println(validThruMonth + "/" + validThruYear);
        System.out.println(userId);
    }
}

class MagneticCards extends Cards {
    //гаследуем карту с магнитной полосой от абстрактной карты
    final protected boolean fieldWithSign = true;
    final boolean magneticStripe = true;
    protected String pin;
    protected String typeOfCard;
    protected String codeValidation;
    protected String paymentSystem;
    String rightCardNumber = String.valueOf(cardNumber);

    protected MagneticCards(String nameOfBank, long cardNumber, String userId, String validThruMonth, String validThruYear,
                         int moneyOnCard, String paymentSystem, String typeOfCard, String pin, String codeValidation) {
        super(nameOfBank, cardNumber, userId, validThruMonth, validThruYear, moneyOnCard);
        this.paymentSystem = paymentSystem;
        this.typeOfCard = typeOfCard;
        this.pin = pin;
        this.codeValidation = codeValidation;
    }
    //переопределяем методы

    int getMoney(int sum) {
        if (sum <= moneyOnCard) {
            amount = sum;
            moneyOnCard = moneyOnCard - sum;
        } else {
            amount = 0;
        }
        return amount;
    }

    void getInformation() {
        System.out.println(nameOfBank);
        System.out.println("paymentSystem " + paymentSystem);
        System.out.println(typeOfCard + " card");
        System.out.println(rightCardNumber.substring(0, 4) + " " + rightCardNumber.substring(4, 8) + " "
                + rightCardNumber.substring(8, 12) + " " + rightCardNumber.substring(12, 16));
        System.out.println("validThru: " + validThruMonth + "/" + validThruYear);
        System.out.println(userId);
        System.out.println();

    }
}

class HybridCards extends MagneticCards {
    //наследуем гибридную карту от карты с магнитной полосой
    final protected boolean chip = true;
    protected boolean payPass;
    protected String status;

    protected HybridCards(String nameOfBank, long cardNumber, String userId, String validThruMonth, String validThruYear,
                       int moneyOnCard, String paymentSystem, String typeOfCard, String pin, String codeValidation, boolean payPass, String status) {
        super(nameOfBank, cardNumber, userId, validThruMonth, validThruYear, moneyOnCard, paymentSystem, typeOfCard, pin, codeValidation);
        this.payPass = payPass;
        this.status = status;
    }

    void getInformation() {
        System.out.println(nameOfBank);
        System.out.println(paymentSystem + " " + status);
        System.out.println(typeOfCard + " card");
        System.out.println(rightCardNumber.substring(0, 4) + " " + rightCardNumber.substring(4, 8) + " "
                + rightCardNumber.substring(8, 12) + " " + rightCardNumber.substring(12, 16));
        System.out.println("validThru: " + validThruMonth + "/" + validThruYear);
        System.out.println(userId);
        System.out.println();
    }

    void payForHotel(int priceForHotel) {
        if (priceForHotel <= moneyOnCard) {
            moneyOnCard = moneyOnCard - priceForHotel;
            if (status == "Gold") {
                moneyOnCard = moneyOnCard + ((priceForHotel / 100) * 5);
            }
        }

    }

}

class TestCard {
    public static void main(String[] args) {
        int mc, hc;
        MagneticCards magneticCards = new MagneticCards("Belarusbank", 1234567890123456L, "Ivan Ivanov",
                "12", "19", 0, "VISA", "Credit", "0123", "011");
        HybridCards hybridCards = new HybridCards("Belgazprombank", 1111222233334444L, "Viktor Pupkin",
                "10", "21", 0, "MasterCard", "Debit", "0000",
                "333", true, "Gold");
        magneticCards.setMoneyOnCard(100);
        hybridCards.setMoneyOnCard(500);
        magneticCards.getMoney(50);
        hybridCards.getMoney(100);
        magneticCards.getInformation();
        hybridCards.getInformation();
        hybridCards.payForHotel(100);
        mc = magneticCards.moneyOnCard;
        System.out.println(mc);
        hc = hybridCards.moneyOnCard;
        System.out.println(hc);
    }
}





