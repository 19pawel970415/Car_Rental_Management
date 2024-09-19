package org.example.db;

import org.example.domain.Employee;

import java.util.*;

public class EmployeesRepo implements Iterable<Employee>, List<Employee> {
    private Employee[] employees;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    private EmployeesRepo() {
        this.employees = new Employee[DEFAULT_CAPACITY];
    }

    private static EmployeesRepo employeesRepo = new EmployeesRepo();

    public EmployeesRepo getInstance() {
        return employeesRepo;
    }

    private void ensureCapacity() {
        if (size == employees.length) {
            employees = Arrays.copyOf(employees, employees.length * 2);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (!(o instanceof Employee)) return false;
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(employees, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            return (T[]) Arrays.copyOf(employees, size, a.getClass());
        }
        System.arraycopy(employees, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    @Override
    public boolean add(Employee employee) {
        ensureCapacity();
        employees[size++] = employee;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof Employee)) return false;
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(o)) {
                int numMoved = size - i - 1;
                if (numMoved > 0) {
                    System.arraycopy(employees, i + 1, employees, i, numMoved);
                }
                employees[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object e : c) {
            if (!contains(e)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends Employee> c) {
        for (Employee employee : c) {
            add(employee);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Employee> c) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Object[] newArray = c.toArray();
        int numNew = newArray.length;
        ensureCapacity();
        int numMoved = size - index;
        if (numMoved > 0) {
            System.arraycopy(employees, index, employees, index + numNew, numMoved);
        }
        System.arraycopy(newArray, 0, employees, index, numNew);
        size += numNew;
        return numNew != 0;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            modified |= remove(o);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (!c.contains(employees[i])) {
                remove(i);
                modified = true;
                i--;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            employees[i] = null;
        }
        size = 0;
    }

    @Override
    public Employee get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return employees[index];
    }

    @Override
    public Employee set(int index, Employee element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Employee oldValue = employees[index];
        employees[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, Employee element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        System.arraycopy(employees, index, employees, index + 1, size - index);
        employees[index] = element;
        size++;
    }

    @Override
    public Employee remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Employee oldValue = employees[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(employees, index + 1, employees, index, numMoved);
        }
        employees[--size] = null;
        return oldValue;
    }

    @Override
    public int indexOf(Object o) {
        if (!(o instanceof Employee)) return -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (!(o instanceof Employee)) return -1;
        for (int i = size - 1; i >= 0; i--) {
            if (employees[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<Employee> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<Employee> listIterator(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return new ListIterator<Employee>() {
            private int cursor = index;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public Employee next() {
                if (!hasNext()) throw new NoSuchElementException();
                return employees[cursor++];
            }

            @Override
            public boolean hasPrevious() {
                return cursor > 0;
            }

            @Override
            public Employee previous() {
                if (!hasPrevious()) throw new NoSuchElementException();
                return employees[--cursor];
            }

            @Override
            public int nextIndex() {
                return cursor;
            }

            @Override
            public int previousIndex() {
                return cursor - 1;
            }

            @Override
            public void remove() {
                EmployeesRepo.this.remove(cursor - 1);
            }

            @Override
            public void set(Employee employee) {
                EmployeesRepo.this.set(cursor - 1, employee);
            }

            @Override
            public void add(Employee employee) {
                EmployeesRepo.this.add(cursor++, employee);
            }
        };
    }

    @Override
    public List<Employee> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        return Arrays.asList(Arrays.copyOfRange(employees, fromIndex, toIndex));
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<Employee> {
        private int idx = 0;

        @Override
        public boolean hasNext() {
            return idx < size && employees[idx] != null;
        }

        @Override
        public Employee next() {
            return employees[idx++];
        }
    }
}
