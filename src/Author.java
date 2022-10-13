public class Author {

    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj== null){
            return false;
        }
        if (this==obj){
            return true;
        }
        if (!(obj instanceof Author)){
            return false;
        }
        Author that = (Author) obj;
        return this.firstName.equals(that.firstName) && this.lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

