package day7;

public class BookInfoVO {
  //b.book_id, b.title, b.pubs, b.pub_date, a.author_name
  private Long bookId;
  private String title;
  private String pubs;
  private String pubDate;
  private String authorName;
  
  public Long getBookId() {
    return bookId;
  }
  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String
  getPubs() {
    return pubs;
  }
  public void setPubs(String pubs) {
    this.pubs = pubs;
  }
  public String getPubDate() {
    return pubDate;
  }
  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }
  public String getAuthorName() {
    return authorName;
  }
  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }
  @Override
  public String toString() {
    return "BookInfoVO [bookId=" + bookId + ", title=" + title + ", pubs=" + pubs + ", pubDate=" + pubDate
        + ", authorName=" + authorName + "]";
  }
  /**
   * @param bookId
   * @param title
   * @param pubs
   * @param pubDate
   * @param authorName
   */
  public BookInfoVO(Long bookId, String title, String pubs, String pubDate, String authorName) {
    super();
    this.bookId = bookId;
    this.title = title;
    this.pubs = pubs;
    this.pubDate = pubDate;
    this.authorName = authorName;
  }
  
}
