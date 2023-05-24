package com.example.mohammedthabet.realmadrid;

import java.util.ArrayList;

public class Node {

    public Match match;
    public int value;
    public Node left;
    public Node right;


    Node(int value) {
        this.value = value;
        this.match = null;
        right = null;
        left = null;
    }

    //Function adds Matches to the binary tree.
    private Node addMatch(Node current, Match match) {
        if (current == null) {
            return new Node(value);
        }

        //compares names of home teams for InOrder binary tree.
        int comparison = match.homeTeamName.compareToIgnoreCase(current.match.homeTeamName);

        if (comparison < 0) {
            current.left = addMatch(current.left, match);
        } else if (comparison > 0) {
            current.right = addMatch(current.right, match);
        } else {
            return current;
        }

        return current;
    }

    //Matches from the ArrayList are added to the binary tree using the addMatch function.
    public class BinaryTree {

        Node root;

        public void add(Match i) {
        }

        void getInorder(Node node, ArrayList<Match> list) {
            if (node == null)
                return;

            /* first recur on left child */
            getInorder(node.left, list);

            /* then print the data of node */
            list.add(node.match);

            /* now recur on right child */
            getInorder(node.right, list);

        }
    }
}
