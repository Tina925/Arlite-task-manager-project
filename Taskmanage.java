public class Taskmanage {
    String deadline;
    String users;
    String startdate;
    String notes;
    
    public Taskmanage(String deadline, String users, String startdate, String notes) {
        this.deadline = deadline;
        this.users = users;
        this.startdate = startdate;
        this.notes = notes;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getUsers() {
        return users;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getNotes() {
        return notes;
    }

    public void changeDeadline(String deadline) {
        this.deadline = deadline;
    }
    
    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getDeadline()+
               ".\nMy breed,age and color are " +
               this.getUsers()+"," + this.getStartdate()+
               ","+ this.getNotes());
    }
    
    /*
    
    
    def change_deadline(self):
        new_deadline = input('Enter new deadline:')
        self.deadline = new_deadline
    
    def change_user(self):
        new_user = input('Enter new user:')
        self.users = new_user
  */
    public static void main(String[] args)
    {
        Taskmanage ECEhomework = new Taskmanage("1/1/2023", "tina", "12/6/2022", "sucker");

        System.out.println(ECEhomework.getDeadline());
        System.out.println(ECEhomework.toString());
        ECEhomework.changeDeadline("1/20/2023");
        System.out.println(ECEhomework.getDeadline());
        System.out.println(ECEhomework.toString());
    }
}