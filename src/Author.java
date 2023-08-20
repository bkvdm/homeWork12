public class Author {

        private String writerFirstName;
        private String writerMiddleName;

        public Author(String writerFirstName, String writerMiddleName) {
                this.writerFirstName = writerFirstName;
                this.writerMiddleName = writerMiddleName;
        }

        public String getWriterFirstName() {
                return writerFirstName;
        }

        public String getWriterMiddleName() {
                return writerMiddleName;
        }
}
