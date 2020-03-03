package com.ocr.downa2;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        ArrayList<Movie> movie = new ArrayList<>();
        movie.add(new Movie("Ca", 1, 2017, Arrays.asList(4, 5, 6), 135, Kind.HORREUR));
        movie.add(new Movie("La ligne verte", 2, 1999, Arrays.asList(7, 8), 188, Kind.DRAME));
        movie.add(new Movie("Split", 3, 2017, Arrays.asList(9), 117, Kind.ACTION));

        ArrayList<Director> director = new ArrayList<>();
        director.add(new Director(1, "Muschietti", "Andres", "Argentin", new Dateofbirth(26, 8, 1973)));
        director.add(new Director(2, "Darabont", "Frank", "Français", new Dateofbirth(28, 1, 1959)));
        director.add(new Director(3, "Shyamalan", "Night", "Américain", new Dateofbirth(6, 8, 1970)));

        ArrayList<Actor> actor = new ArrayList<>();
        actor.add(new Actor(4, "Skarsgard", "Stellan", "Suédois", new Dateofbirth(13, 6, 1951)));
        actor.add(new Actor(5, "Martell", "Jaeden", "Américain", new Dateofbirth(4, 1, 2003)));
        actor.add(new Actor(6, "Wolhard", "Finn", "Canadien", new Dateofbirth(23, 12, 2002)));
        actor.add(new Actor(7, "Hanks", "Tom", "Américain", new Dateofbirth(9, 7, 1956)));
        actor.add(new Actor(8, "Duncan", "Mickael Clark", "Américain", new Dateofbirth(10, 12, 1957)));
        actor.add(new Actor(9, "McAvoy", "James", "Anglais", new Dateofbirth(21, 4, 1979)));

        private static void displayMovies(ArrayList<Movie> movie) {
            for (Movie myMovie : movie) {
                System.out.println(myMovie);

                for(int actorId: movie.actor){

                    for(Actor actor: actor){
                        if (actor.id == actorId){
                            System.out.println(" Acteur " + actor);
                        }
                    }
                }
                Optional<Director> director = director.stream().filter(aDirector -> aDirector.id == movie.id).findFirst();
                System.out.println(" Réalisateur " + director.get());
            }
        }

    private static void displayMovieByName (ArrayList<Movie> movie){
            Scanner scanner = new Scanner (System.in);
            String name = scanner.nextLine();
            System.out.println("Entrez le nom d'un film");

            for (Movie movie: movie){
                if (name.equals(movie.title) == true) {
                    System.out.println(movie);
                    break;
                }
            }
        }

        private static void displayByKind(ArrayList < Movie > movie) {
            for (Kind kind : Kind.values()) {
                System.out.println(kind.name);

                for (Movie movie : movie) {
                    if (movie.genre.contains(kind) == true) {
                        System.out.println(movie);
                    }
                }
            }
        }
        private static void displayActorMovie(ArrayList<Movie>movie, ArrayList<Actor>actor){
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine;
            System.out.println(" Entrez le nom d'un acteur ");

            int actorId = -1;
            for(Actor actor : actor){
                if(actor.name.equalsIgnoreCase(name)== true){
                    actorId = actor.id;
                    break;
                }
            }
        }

    }
}

