import java.time.LocalDate;

public class Guest {
    public String name;
   public LocalDate born;

    public Guest(String name, LocalDate born) {
       this.name = name;
      this.born = born;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }
}