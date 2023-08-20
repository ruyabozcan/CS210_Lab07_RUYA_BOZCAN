// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING




public class TreeNode
{

    int value;
    TreeNode left;
    TreeNode right;

    // Constructor
    public TreeNode(int value)
    {
        this.value = value;
    }


    public TreeNode recursiveInsert(TreeNode node, int value)
    {

        if (node == null)

        {
            return new TreeNode(value);
        }
        else if (value < node.value)

        {
            node.left = recursiveInsert(node.left, value);
        }
        else if (value > node.value)

        {
            node.right = recursiveInsert(node.right, value);
        }

        return node;
    }

    //iterativeFindMinimum
    public TreeNode iterativeFindMinimum(TreeNode node)
    {
        if (node == null)
        {
            return null;
        }

        while (node.left != null)
        {
            node = node.left;
        }
        return node;
    }

    //iterativeFindMaximum
    public TreeNode iterativeFindMaximum(TreeNode node)
    {
        if (node == null)

        {
            return null;
        }

        while (node.right != null)

        {
            node = node.right;
        }

        return node;
    }


    //recursiveFindMinimum
    public TreeNode recursiveFindMinimum(TreeNode node)

    {
        if (node == null || node.left == null)

        {
            return node;
        }

        return recursiveFindMinimum(node.left);


    }

    //recursiveFindMaximum
    public TreeNode recursiveFindMaximum(TreeNode node)

    {
        if (node == null || node.right == null)

        {
            return node;
        }

        return recursiveFindMaximum(node.right);

    }


        //findElement
    public TreeNode findElement(TreeNode node, int value)
    {
        if (node == null || node.value == value)

        {
            return node;
        }

        if (value < node.value)

        {
            return findElement(node.left, value);

        }

        else

        {
            return findElement(node.right, value);
        }
    }
}
// RUYA BOZCAN
// 200201044
// CS 210
// COMPUTER ENGINEERING



