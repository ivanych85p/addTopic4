package Topic_4;

public class Atm {
    private int number20;
    private int number50;
    private int number100;

    public Atm(int number20, int number50, int number100) {
        this.number20 = number20;
        this.number50 = number50;
        this.number100 = number100;
    }

    public void addMoney(int n20, int n50, int n100) {
        number20 += n20;
        number50 += n50;
        number100 += n100;
    }

    public void getMoney(int money) {
        int totalCash = number20 * 20 + number50 * 50 + number100 * 100;
        boolean operationValid = true;
        int need20, need50, need100, needOst; // необходимое количество купюр запрашиваемой суммы
        int note20, note50, note100; //количество купюр соответствующего наминала, выдаваемых банкоматом
        note20 = 0;
        note50 = 0;
        note100 = 0;
        need20 = 0;
        need50 = 0;
        need100 = 0;
        needOst = 0;
        if ((money > totalCash) || ((money % 10) != 0)) { //проверяем, не превышает ли запрашиваемая сумма кол-во денег в банкомате
            operationValid = false;
            System.out.println(operationValid);
            // определяем минимальное кол-во 20-к, для того, чтобы операция удалась
        } else {
            needOst = money % 100;

            if ((needOst == 90) || (needOst == 40)) {
                need20 = 2;
            }
            if ((needOst == 80) || (needOst == 30)) {
                need20 = 4;
            }
            if ((needOst == 70) || (needOst == 20)) {
                need20 = 1;
            }
            if ((needOst == 60) || (needOst == 10)) {
                need20 = 3;
            }
            if (needOst == 50) {
                need20 = 0;
            }
            //проверяем, нужна ли нам минимум одна 50-ка для выдачи запрашиваемой суммы
            money = money - need20 * 20;
            if (money < 0) {
                operationValid = false;
            }
            if ((money % 50) == 0) {
                need50 = money / 50;
            }
            if (need50 > 1) {
                if ((need50 % 2) == 1) {
                    need100 = (need50 - 1) / 2;
                    need50 = 1;
                } else {
                    need100 = need50 / 2;
                    need50 = 0;
                }
            }
            //проверяем, есть ли необходимое кол-во купюр в банкомате. При отсутствии - пытаемся добрать купюрами другого номинала
            if (number20 < need20) {
                operationValid = false;
            } else {
                note20 = need20;
                if (number50 < need50) {
                    operationValid = false;
                } else {
                    note50 = need50;
                    if (number100 >= need100) {
                        note100 = need100;
                    } else {
                        note100 = number100;
                        need100 = need100 - number100;
                        if ((number50 - need50) >= (need100 * 2)) {
                            note50 = need50 + (need100 * 2);
                        } else {
                            if ((((number50 - need50) % 2) == 0)) {
                                if (number50 == need50) {
                                    note50 = need50;
                                    if ((number20 - need20) >= (need100 * 5)) {
                                        note20 = need20 + (need100 * 5);
                                    } else {
                                        operationValid = false;
                                    }
                                } else {
                                    note50 = need50 + number50;
                                    need100 = need100 - (number50 / 2);
                                    if ((number20 - need20) >= (need100 * 5)) {
                                        note20 = need20 + (need100 * 5);
                                    } else {
                                        operationValid = false;
                                    }
                                }
                            } else {
                                note50 = number50 - 1;
                                need100 = need100 - ((note50 - 1) / 2);
                                if ((number20 - need20) >= (need100 * 5)) {
                                    note20 = need20 + (need100 * 5);
                                } else {
                                    operationValid = false;
                                }
                            }
                        }
                    }
                }
            }
            if (operationValid) {
                System.out.println(operationValid);
                System.out.println("Please, take your money:");
                System.out.println("100x" + note100);
                System.out.println("50x" + note50);
                System.out.println("20x" + note20);
                number100 = number100 - note100;
                number50 = number50 - note50;
                number20 = number20 - note20;
            } else {
                System.out.println(operationValid);
            }
        }
        System.out.println();
    }
}

