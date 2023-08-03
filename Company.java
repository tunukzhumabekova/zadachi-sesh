import java.util.Arrays;

public class Company {

        String companyName;
        String country;
        String yearFoundation;
        String founder;
        Group[] groups;

        @Override
        public String toString() {
            return "Company - \n" +
                    "companyName: " + companyName + "\n" +
                    "Country: " + country + "\n" +
                    "Год основания: " + yearFoundation + "\n" +
                    "Основатель: " + founder + "\n" +
                    "\n*|Группы|*" + Arrays.toString(groups);
        }

        public Company(String companyName, String country, String yearFoundation, String founder, Group[] groups) {
            this.companyName = companyName;
            this.country = country;
            this.yearFoundation = yearFoundation;
            this.founder = founder;
            this.groups = groups;

        }

    }

