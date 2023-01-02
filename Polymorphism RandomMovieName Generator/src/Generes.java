public interface Generes {
    public class Adventure extends Movie {
        public Adventure() {
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf("...%s%n".repeat(3),
                    "Pleasant Scene",
                    "Scary Music",
                    "Something Bad Happens");
        }
    }
    public class Comedy extends Movie {
        public Comedy() {
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf("...%s%n".repeat(3),
                    "Something funny happened",
                    "Funny Music",
                    "Something Funny Happens");
        }
    }

    public class ScienceFriction extends Movie {
        public ScienceFriction() {
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf("...%s%n".repeat(3),
                    "Ancient medicine process",
                    "The people who saves the life of the humans by producing medicines",
                    "The shadow of god in the form the human");
        }
    }
}
