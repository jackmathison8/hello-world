


public class SocialMediaInfluencer extends Athlete {
    private double engagementRate;

    public SocialMediaInfluencer(String name, String IGHandle, int followers, int likes, int comments, double pricePerPost) {
        super(name, IGHandle, followers, likes, comments, pricePerPost);
        this.engagementRate = 0.0;
    }

    public void calculateEngagementRate() {
        this.engagementRate = ((double) (getLikes() + getComments())) / getFollowers();
    }

    @Override
    public void calculateSocialMediaValue() {
        setSocialMediaValue((getFollowers() * getLikes() * engagementRate) / (getComments() + 1));
    }
}
