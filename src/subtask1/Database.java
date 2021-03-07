package subtask1;

class Database {

    private static Database instance;

    private Database() {
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            //acquireThreadLock();
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void query(String sql) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}