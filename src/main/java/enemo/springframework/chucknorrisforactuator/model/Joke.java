package enemo.springframework.chucknorrisforactuator.model;

public class Joke {
    private String jokeText;

    public Joke(String jokeText) {
        this.jokeText = jokeText;
    }

    public String getJokeText() {
        return jokeText;
    }

    public void setJokeText(String jokeText) {
        this.jokeText = jokeText;
    }
}
