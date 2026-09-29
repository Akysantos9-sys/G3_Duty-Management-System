package com.example.g3_duty_management_system.Quarter2.MiniPeta3;

import java.util.Scanner;

public class Sceduleplanner {

        private String Username;
        private String Password;
        private String Name;
        private String Date;

        public void Schedules(String Username, String Password, String Name, String Date) {
            this.Username = Username;
            this.Password = Password;
            this.Name = Name;
            this.Date = Date;
        }

        public String getUsername() {
            return Username;
        }

        public String getPassword() {
            return Password;
        }

        public String getName() {
            return Name;
        }

        public String getDate() {
            return Date;
        }

    public void Schedules(Scanner menuinput, Sceduleplanner scheduleManager) {
    }
}

