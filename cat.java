public class Cat {

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow()
    {
        System.out.println(name + " mrrr");
    }
    // преопределение метода предка
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String superToSting()
    {
        return super.toString();
    }
    // super -
    // object - animal - cat

    @Override
    public boolean equals(Object o) {
        // this ссылка на этот объект
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
    //          приходим к animal

}
