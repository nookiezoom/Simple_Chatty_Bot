import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chief chief = new Chief(scanner.next(), scanner.nextInt(),
                scanner.next(), scanner.nextInt(), scanner.next());
        chief.sendConfirmation();
    }

    static class Chief {
        private String firstName;
        private int age;
        private String stageOfEducation;
        private int yearsOfExperience;
        private String cuisinePreference;

        public Chief(String firstName, int age, String stageOfEducation, int yearsOfExperience,
                     String cuisinePreference) {
            this.firstName = firstName;
            this.age = age;
            this.stageOfEducation = stageOfEducation;
            this.yearsOfExperience = yearsOfExperience;
            this.cuisinePreference = cuisinePreference;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getStageOfEducation() {
            return stageOfEducation;
        }

        public void setStageOfEducation(String stageOfEducation) {
            this.stageOfEducation = stageOfEducation;
        }

        public int getYearsOfExperience() {
            return yearsOfExperience;
        }

        public void setYearsOfExperience(int yearsOfExperience) {
            this.yearsOfExperience = yearsOfExperience;
        }

        public String getCuisinePreference() {
            return cuisinePreference;
        }

        public void setCuisinePreference(String cuisinePreference) {
            this.cuisinePreference = cuisinePreference;
        }

        public void sendConfirmation() {
            System.out.println("The form for "
                    + firstName
                    + " is completed. We will contact you if we need a chef that cooks "
                    + cuisinePreference
                    + " dishes.");
        }
    }
}