package kufkes;

public class Main {

    public static void main(String[] args) {
    	BinaryTree bt = new BinaryTree();
        bt.insert(20);
        bt.insert(4);
        bt.insert(3);
        bt.insert(5);
        bt.insert(22);
        bt.insert(21);
        bt.insert(24);




//
//        bt.insert(1);
//        bt.insert(1);
//        bt.insert(2);
//        bt.insert(1);
//
//        bt.insert(2);
//        bt.insert(4);
//        bt.insert(4);
//        bt.insert(2);
//        bt.insert(3);
//        bt.insert(0);


        bt.inOrderTrav();

        System.out.println("");

        bt.preOrderTrav();

        bt.postOrderTrav();

        System.out.println(bt.countUnivalSubtrees(bt.root));

    }
}
