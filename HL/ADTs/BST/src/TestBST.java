public class TestBST
{
    public static void main(String[] args)
    {
        BinarySearchTree myBST = new BinarySearchTree("Mikkel");
        myBST.insert("Chegwin");
        myBST.insert("Yaj");
        myBST.insert("Armaan");
        System.out.println("Searching BST for Yaj: "+ myBST.search("Yaj"));
        System.out.println("Searching BST for Bruce: "+ myBST.search("Bruce"));
    }
}
