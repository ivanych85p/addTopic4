package Note_2_topic_2.Singleton;

public class ProgramTest {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log..");
        ProgramLogger.getProgramLogger().addLogInfo("Second log..");
        ProgramLogger.getProgramLogger().addLogInfo("Third log..");
        ProgramLogger.getProgramLogger().showLogFile();

    }
}
