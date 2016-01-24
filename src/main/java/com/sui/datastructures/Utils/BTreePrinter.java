package com.sui.datastructures.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sui.datastructures.nodes.TreeNode;

public class BTreePrinter<T extends Comparable<?>> {

	public void printTreeNode(TreeNode<T> root) {
        int maxLevel = maxLevel(root);

        printTreeNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private void printTreeNodeInternal(List<TreeNode<T>> TreeNodes, int level, int maxLevel) {
        if (TreeNodes.isEmpty() || isAllElementsNull(TreeNodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        printWhitespaces(firstSpaces);

        List<TreeNode<T>> newTreeNodes = new ArrayList<TreeNode<T>>();
        for (TreeNode<T> TreeNode : TreeNodes) {
            if (TreeNode != null) {
                System.out.print(TreeNode.value);
                newTreeNodes.add(TreeNode.getLeft());
                newTreeNodes.add(TreeNode.getRight());
            } else {
                newTreeNodes.add(null);
                newTreeNodes.add(null);
                System.out.print(" ");
            }

            printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < TreeNodes.size(); j++) {
                printWhitespaces(firstSpaces - i);
                if (TreeNodes.get(j) == null) {
                    printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (TreeNodes.get(j).getLeft() != null)
                    System.out.print("/");
                else
                    printWhitespaces(1);

                printWhitespaces(i + i - 1);

                if (TreeNodes.get(j).getRight() != null)
                    System.out.print("\\");
                else
                    printWhitespaces(1);

                printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printTreeNodeInternal(newTreeNodes, level + 1, maxLevel);
    }

    private void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private int maxLevel(TreeNode<T> TreeNode) {
        if (TreeNode == null)
            return 0;

        return Math.max(maxLevel(TreeNode.getLeft()),maxLevel(TreeNode.getRight())) + 1;
    }

    private boolean isAllElementsNull(List<TreeNode<T>> treeNodes) {
        for (Object object : treeNodes) {
            if (object != null)
                return false;
        }

        return true;
    }
}
