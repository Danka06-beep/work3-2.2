package com.company;

public class GenreByContent extends Genre {

    public GenreByContent() {
        super ("Жанр по контенту книги");
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GenreByContent genreByContent = (GenreByContent) object;

        return attribute != null ? attribute.equals(genreByContent.attribute) : false;
    }
}


