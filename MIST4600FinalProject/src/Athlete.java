import java.util.HashSet;

public class Athlete {
    private String name;
    private String IGHandle;
    private int followers;
    private int likes;
    private int comments;
    private double pricePerPost;
    private double socialMediaValue;
    private HashSet<InstagramPost> instagramPosts;

    public Athlete(String name, String IGHandle, int followers, int likes, int comments, double pricePerPost) {
        this.name = name;
        this.IGHandle = IGHandle;
        this.followers = followers;
        this.likes = likes;
        this.comments = comments;
        this.pricePerPost = pricePerPost;
        this.socialMediaValue = 0.0;
        this.instagramPosts = new HashSet<>();
    }

    public void updateProfile() {
        // Logic to update athlete's profile
    }

    public void calculateSocialMediaValue() {
        // Basic calculation for social media value (can be overridden in subclasses)
        this.socialMediaValue = (followers * likes) / (comments + 1);
    }

    // Getter and Setter methods for private attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIGHandle() {
        return IGHandle;
    }

    public void setIGHandle(String IGHandle) {
        this.IGHandle = IGHandle;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public double getPricePerPost() {
        return pricePerPost;
    }

    public void setPricePerPost(double pricePerPost) {
        this.pricePerPost = pricePerPost;
    }

    public double getSocialMediaValue() {
        return socialMediaValue;
    }

    public void setSocialMediaValue(double socialMediaValue) {
        this.socialMediaValue = socialMediaValue;
    }

    public HashSet<InstagramPost> getInstagramPosts() {
        return instagramPosts;
    }

    public void setInstagramPosts(HashSet<InstagramPost> instagramPosts) {
        this.instagramPosts = instagramPosts;
    }
}

