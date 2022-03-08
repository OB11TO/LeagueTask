package refactoring_guru.iterator.example.social_networks;


import refactoring_guru.iterator.example.iterators.ProfileIterator;

/**
 * Интерфейс социальной сети
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);  //друзья
    ProfileIterator createCoworkersIterator(String profileEmail);  //Коллеги

}
