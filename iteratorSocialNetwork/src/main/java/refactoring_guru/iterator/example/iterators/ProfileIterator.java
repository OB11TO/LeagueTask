package refactoring_guru.iterator.example.iterators;


import refactoring_guru.iterator.example.profile.Profile;

/**
 * Интерфейс итератора
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset(); //сброс

}
