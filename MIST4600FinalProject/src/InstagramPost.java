public class InstagramPost {
    private int postID;
    private String content;
    private int likes;
    private int comments;

    public InstagramPost(int postID, String content, int likes, int comments) {
        this.postID = postID;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }

    public int getPostID() {
        return postID;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public int getComments() {
        return comments;
    }
}
