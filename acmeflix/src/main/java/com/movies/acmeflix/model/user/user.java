package com.movies.acmeflix.model.user;

import javax.persistence.*;
import javax.validation.constraints.*;


public class user{
        @NotNull
        @Column(unique = true)
        private Long id;
        @NotNull
        @Column(unique = true)
        private String email;

        @NotNull
        @Column(length = 20)
        private String firstname;

        @NotNull
        @Column(length = 30)
        private String lastname;

        private Integer age;

        public user(Long id, String email, String firstname, String lastname, Integer age) {
                this.id = id;
                this.email = email;
                this.firstname = firstname;
                this.lastname = lastname;
                this.age = age;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getFirstname() {
                return firstname;
        }

        public void setFirstname(String firstname) {
                this.firstname = firstname;
        }

        public String getLastname() {
                return lastname;
        }

        public void setLastname(String lastname) {
                this.lastname = lastname;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        @Override
        public String toString() {
                return "user{" +
                        "id=" + id +
                        ", email='" + email + '\'' +
                        ", firstname='" + firstname + '\'' +
                        ", lastname='" + lastname + '\'' +
                        ", age=" + age +
                        '}';
        }
}
