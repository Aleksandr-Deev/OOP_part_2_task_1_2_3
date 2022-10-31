public class Human {

    private final String name;
    private String town;
    private int yearOfBirth;
    private final String job;

    public Human(String name, String town, int yearOfBirth, String job){

        if (name == null || name.isBlank()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

        if (job == null || job.isBlank()) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + this.name + ". Я из города " + this.town + ". Я родился в "
                + this.yearOfBirth + " году. Я работаю на должности " + this.job + ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public String getJob() {
        return job;
    }
}
