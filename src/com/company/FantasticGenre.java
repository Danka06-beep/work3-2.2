package com.company;

import com.company.GenreByContent;
import com.company.GenreEnum;

public class FantasticGenre extends GenreByContent {
    public String getGenreName() {
        return GenreEnum.FANTASTIC.name();
    }

}
