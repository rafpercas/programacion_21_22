package U8.Perez_Castano_U8_Entregable;


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
    ProcessPosts proPost = new ProcessPosts();

    proPost.parseDOM("src/main/java/U8/Perez_Castano_U8_Entregable/posts.xml");

    Post p1 = new Post("Nuevo post.","https://www.google.es","Nuevo post para entregable","16-05-2022","www.google.es");

    proPost.addPost(p1);

   System.out.println(proPost.getPosts());

    proPost.convertToJSON();

    System.out.println("Número de posts en el arxchivo xml: " + proPost.numPostsStax("src/main/java/U8/Perez_Castano_U8_Entregable/posts.xml"));
    proPost.numPostsStax("src/main/java/U8/Perez_Castano_U8_Entregable/posts.xml");
  }

}
