import java.time.LocalDate;

public class Notes{
    int id;
    String title;
    String note;
    LocalDate createdAt;

    public void add(String title, String note) {
        this.id =++this.id;
        this.title = title;
        this.note = note;
        this.createdAt = LocalDate.now();
        System.out.println("Note added successfully");
    }

    record Note(int id, String title, String note, LocalDate createdAt){}
    public record createNote(String title, String note){}

    Note getNote() {
      return new Note(
              this.id,
              this.title,
              this.note,
              this.createdAt
      );
    };
}