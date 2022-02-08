public class LinkedList {
    Node first;
    Node last;
    int size = 0;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }


    public void insertLast(String x) {

        Node newNode = new Node(x);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void toStr() {

        if (isEmpty()) {
            System.out.println("This word does not exist in any file");
            return;
        }

        Node tmp = first;
        System.out.println("This word has been appeared in the following text files:");

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }


    }



}

