package enemo.springframework.chucknorrisforactuator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String randomQuote(){

        return chuckNorrisQuotes.getRandomQuote();
    }

}
