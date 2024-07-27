package com.HR.inskay.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class user {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        private String username;
        private String password;

        @ManyToMany
        @JoinTable(
                name = "user_roles",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id")
        )
        private Set<rol> roles;



        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public Set<rol> getRoles() {
                return roles;
        }

        public void setRoles(Set<rol> roles) {
                this.roles = roles;
        }
}
