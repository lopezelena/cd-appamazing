package com.campusdual.appmazing.model.dto;

public class ContactDTO {

    public class Contact {

        private int id;
        private String name;
        private String first_surname;
        private String second_surname;
        private String phone;
        private String email;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSecond_surname() {
            return second_surname;
        }

        public void setSecond_surname(String second_surname) {
            this.second_surname = second_surname;
        }

        public String getFirst_surname() {
            return first_surname;
        }

        public void setFirst_surname(String first_surname) {
            this.first_surname = first_surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
