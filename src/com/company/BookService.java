package com.company;

public class BookService {
    public void filterBookByGenre(Book[] bookList, Genre genre) {
        for (Book book : bookList) {
            for (Genre genreFromBook : book.getGenres()) {

                    if (genreFromBook.equals(genre)) {
                        System.out.println("Книга - " + book.getTitle() + " подходит под данный фильтр: жанр - " + genre.getGenreName());
                        break;
                    } else {
                        System.out.println("Книга - " + book.getTitle() + " не прошла фильтр: жанр - " + genre.getGenreName() + ", критерий- " +
                                genre.getAttributeOfGenre() + ", так как имеет жанр " +
                                genreFromBook.getGenreName());
                    }
                }
            }
        }
    }



