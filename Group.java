public class Group {

        String groupName;
        int startDate;
        String mentor;

        public Group(String groupName, int startDate, String mentor) {
            this.groupName = groupName;
            this.startDate = startDate;
            this.mentor = mentor;
        }
        public String getGroupName(){
            return getGroupName();
        }
        public int getStartDate(){
            return getStartDate();
        }
        public String getMentor(){
            return getMentor();
        }

        @Override
        public String toString() {
            return "\nГРУППЫ\n" +
                    "Название группы: " + groupName + "\n" +
                    "Основание: " + startDate + "\n" +
                    "Учитель: " + mentor + "\n";
        }
    }

