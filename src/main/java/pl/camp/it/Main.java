package pl.camp.it;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Respone respone = new Respone(); //restTemplate.getForObject(..)
        Domain d = respone.getDomain();
        List<Category> categories = d.getCategories();
        categories.get(0).getName();
    }
}
