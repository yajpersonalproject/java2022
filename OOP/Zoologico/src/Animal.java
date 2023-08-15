public class Animal
{
    // class (static) variable
    private static int currentYear = 2023;
    // attributes/fields/instance variables
    private String name;
    private int birthYear;
    // private = data hiding

    // (custom) constructor method
    public Animal(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    // overloading the constructor
    public Animal(String name)
    {
        this.name = name;
        birthYear = 0;
    }

    // accessor method aka "getters"
    public String getName()
    {
        return this.name;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public int getAge()
    {
        return currentYear - birthYear;
    }

    // mutator/modifier methods
    public void setName(String name)
    {
        this.name = name;
    }

    /*
    public void setBirthYear(int year)
    {
        this.birthYear = year;
    }
    */
}
