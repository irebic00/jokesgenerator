package com.lureb.jokesgenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
