package note_3_topic_1;

public class ExamplesOfDataBase {
    public static void main(String[] args) {

//    Note 3, task 1...................................................................................................
        System.out.println("task 1");
        System.out.println("INSERT INTO Receivers (num, receiver) VALUES (1, 'internet provider SOLO');");
        System.out.println("INSERT INTO Receivers (num, receiver) VALUES (2, 'hypermarket KORONA');");
        System.out.println("INSERT INTO Receivers (num, receiver) VALUES (3, 'MTS');");
        System.out.println();

//    Task 2...........................................................................................................
        System.out.println("task 2");
        System.out.println("SELECT num, paydate, receiver, value FROM expenses, receivers WHERE receiver=receivers.num and value > 10000;");
        System.out.println();

//    Task 3...........................................................................................................
        System.out.println("task 3");
        System.out.println("DELETE FROM expenses WHERE value < 3000;");

    }
}
