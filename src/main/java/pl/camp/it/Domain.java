package pl.camp.it;

import java.util.List;

public class Domain {
    private List<Category> categories;
    private SocialMedia social_media;
    private String logo_url;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public SocialMedia getSocial_media() {
        return social_media;
    }

    public void setSocial_media(SocialMedia social_media) {
        this.social_media = social_media;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }
}
