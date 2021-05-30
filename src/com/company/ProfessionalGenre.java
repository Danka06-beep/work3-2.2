package com.company;

public class ProfessionalGenre extends GenreByContent{
    @Override
    public String getGenreName() {
        return GenreEnum.PROFESSIONAL.name();
    }
}
