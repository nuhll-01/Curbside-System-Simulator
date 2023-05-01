public class FirstName {
    private final String[] NAMES = {
            "Amelia",
            "Benjamin",
            "Chloe",
            "David",
            "Eleanor",
            "Felix",
            "Grace",
            "Henry",
            "Isla",
            "Jack",
            "Keira",
            "LeMi",
            "Noah",
            "Olivia",
            "Pepe",
            "Quinn",
            "Ruby",
            "Samuel",
            "Tessa"
    };

    public String[] getAllNames() {
        return NAMES;
    }

    public String getRandomName() {
        int index = (int) (Math.random() * NAMES.length);
        return NAMES[index];
    }
}
