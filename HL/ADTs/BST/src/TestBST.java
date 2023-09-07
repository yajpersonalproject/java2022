public class TestBST
{
    public static void main(String[] args)
    {
        BinarySearchTree myBST01 = new BinarySearchTree();
        myBST01.insert("");
        myBST01.insert("");
        myBST01.insert("");
        myBST01.insert("");
        System.out.println("Searching BST for : "+ myBST01.search(""));
        System.out.println("Searching BST for Alan: "+ myBST01.search("Alan"));
        BinarySearchTree myBST02 = new BinarySearchTree("Mikkel");
        myBST02.insert("Chegwin");
        myBST02.insert("Yaj");
        myBST02.insert("Armaan");
        myBST02.insert("Walter");
        myBST02.insert("Yaj");
        System.out.println("Searching BST for Yaj: "+ myBST02.search("Yaj"));
        System.out.println("Searching BST for Bruce: "+ myBST02.search("Bruce"));
    }
}
