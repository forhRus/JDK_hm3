class Cat implements Comparable{
    String name;
    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Cat cat = (Cat) o;

        return name.equals(cat.getName());
    }

    @Override
    public int compareTo(Object o) {
        Cat cat = (Cat) o;
        return name.compareTo(cat.getName());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}