public class ArrayElement {
    String element;
    LinkedList list;

    public ArrayElement(String element){
        this.element = element;
        list = new LinkedList();
    }

    public int sumOfCharacters(){
        int sum = 0;
        element = element.toLowerCase();
        for (int i = 0; i< element.length(); ++i)
            sum += element.charAt(i);
        return sum;
    }

    @Override
    public boolean equals(Object o){
        ArrayElement other = (ArrayElement) o;
        return element.equalsIgnoreCase(other.element);
    }

    @Override
    public String toString() {
        return element +  " ";
    }

}

