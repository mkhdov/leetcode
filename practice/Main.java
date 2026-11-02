public class Main {
    public static void main(String[] args) {
        Notes notes = new Notes();
        notes.add("Test1", "Test1");
        notes.add("Test2", "Test2");
        notes.add("Test3", "Test3");
        notes.add("Test4", "Test4");
        System.out.println(notes.getNote());
    }
}
