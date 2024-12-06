package com.uspsfast.github_demo.customer;

import java.util.Objects;

/**
 * Represents a customer with an id, name, email, and age.
 */
public class Customer {
    private Integer id;
    private String name;
    private String email;
    private Integer age;

    /**
     * Default constructor.
     */
    public Customer() {
        }
    
        /**
         * Sets the customer's name.
         *
         * @param name the customer's name
         */
        public void setName(String name) {
            this.name = name;
        }
    
        /**
         * Returns the customer's email.
         *
         * @return the customer's email
         */
        public String getEmail() {
            return email;
        }
    
        /**
         * Sets the customer's email.
         *
         * @param email the customer's email
         */
        public void setEmail(String email) {
            this.email = email;
        }
    
        /**
         * Returns the customer's age.
         *
         * @return the customer's age
         */
        public Integer getAge() {
            return age;
        }
    
        /**
         * Sets the customer's age.
         *
         * @param age the customer's age
         */
        public void setAge(Integer age) {
            this.age = age;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return Objects.equals(id, customer.id) &&
                    Objects.equals(name, customer.name) &&
                    Objects.equals(email, customer.email) &&
                    Objects.equals(age, customer.age);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(id, name, email, age);
        }
    
        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    /**
     * Constructs a new Customer with the specified id, name, email, and age.
     *
     * @param id the customer's id
     * @param name the customer's name
     * @param email the customer's email
     * @param age the customer's age
     */
    public Customer(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    /**
     * Returns the customer's id.
     *
     * @return the customer's id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the customer's id.
     *
     * @param id the customer's id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Returns the customer's name.
     *
     * @return the customer's name
     */
    public String getName() {
        return name;
    }
}
