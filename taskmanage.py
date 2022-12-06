class Task:
    def _init_(self, deadline, users, startdate, period):
        self.deadline = deadline
        self.user = users
        self.details = startdate
        self.performance = period

    def change_deadline(self):
        new_deadline = input('Enter new deadline:')
        self.deadline = new_deadline
    
    def change_user(self):
        new_user = input('Enter new user:')
        self.users = new_user

