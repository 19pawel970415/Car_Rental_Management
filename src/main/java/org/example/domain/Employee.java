package org.example.domain;

import java.util.Iterator;

public class Employee implements Iterable {
    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;

    @Override
    public Iterator iterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator {
        private int idx = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
