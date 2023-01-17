package pl.sda.oop.inner_classes.local;

class LocalClasses {

    public void createPair(String key, int value) {
        class Pair {
            String key;
            int value;

            void getSome() {
                System.out.println("Local class method");
            }
        }
        Pair pair = new Pair();
        pair.key = key;
        pair.value = value;
        pair.getSome();
    }
}
