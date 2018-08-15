public class Main {
  public static void main(String[] args) {
    BlogPost uno = new BlogPost();
    uno.authorName = "John Doe";
    uno.title = "Lorem Ipsum";
    uno.text = "Lorem ipsum dolor sit amet.";
    uno.publicationDate = "2000.05.04.";

    BlogPost due = new BlogPost();
    due.authorName = "Tim Urban";
    due.title = "Wait but why";
    due.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    due.publicationDate = "2010.10.10.";

    BlogPost tre = new BlogPost();
    tre.authorName = "William Turton";
    tre.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    tre.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    tre.publicationDate = "2017.03.28";

    System.out.println(tre.text);
  }
}
