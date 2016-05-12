package com.kuldeep.algorithm;

import java.util.LinkedList;

/**
 * Suffix tree
 * <p>
 * Created by kuldeep on 10/05/16.
 */
public class SuffixTree {

    /**
     * Root node of tree
     */
    private Node root;

    public SuffixTree() {
        this.root = new Node();
    }


    /**
     * Insert input string with all it's suffix in tree.
     *
     * @param input string to be inserted
     */
    public void insert(String input) {
        for (int i = 0; i < input.length(); i++) {
            insertSuffix(input.substring(i));
        }
    }

    /**
     * Insert the suffix
     *
     * @param suffix to be inserted
     */
    private void insertSuffix(String suffix) {

        Node rootChild = getChildWithCommonPrefix(root, suffix);
        Node parentNode = root;
        if (rootChild == null) {
            Node child = new Node(suffix);
            child.getChildren().add(null);
            root.getChildren().add(child);
        } else {

            String label = rootChild.getLabel();
            int labelIndex = 0;
            for (int i = 0; i < suffix.length(); i++) {

                if (suffix.charAt(i) != label.charAt(labelIndex)) {
                    String firstPart = label.substring(0, i);
                    String secondPart = label.substring(i);
                    String inputSuffix = suffix.substring(i);

                    parentNode.getChildren().remove(rootChild);

                    Node inputSuffixNode = new Node(inputSuffix);
                    inputSuffixNode.getChildren().addFirst(null);

                    Node firstPartNode = new Node(firstPart);
                    firstPartNode.getChildren().add(inputSuffixNode);

                    rootChild.setLabel(secondPart);
                    firstPartNode.getChildren().add(rootChild);

                    parentNode.getChildren().add(firstPartNode);
                    return;
                }

                if (labelIndex == label.length() - 1) {

                    // If input string is exhausted
                    if (i == suffix.length()) {
                        if (rootChild.getChildren().get(0) != null) {
                            rootChild.getChildren().addFirst(null);
                        }
                        return;
                    }

                    // Crop input because substring from beginning to this
                    // point is matching, and we need to look for next level
                    suffix = suffix.substring(labelIndex);
                    parentNode = rootChild;
                    rootChild = getChildWithCommonPrefix(rootChild, suffix);
                    assert rootChild != null;
                    label = rootChild.getLabel();
                    labelIndex = 0;
                } else {
                    labelIndex++;
                }
            }

            String firstPart = label.substring(0, labelIndex);
            String secondPart = label.substring(labelIndex);
            parentNode.getChildren().remove(rootChild);
            rootChild.setLabel(secondPart);
            Node node = new Node(firstPart);
            node.getChildren().add(null);
            node.getChildren().add(rootChild);
            parentNode.getChildren().add(node);
        }
    }

    /**
     * @param input string to be inserted.
     * @return child node of root that have prefix common to input.
     */
    private Node getChildWithCommonPrefix(Node node, String input) {

        for (Node child : node.getChildren()) {
            if (child != null && child.getLabel().charAt(0) == input.charAt(0)) {
                return child;
            }
        }
        return null;
    }

    /**
     * Check if key is present.
     *
     * @param key to be checked
     * @return true if key is present, false otherwise.
     */
    public boolean isPresent(String key) {

        Node parent = root;
        while (key.length() > 0) {
            Node matchingChild = getChildWithCommonPrefix(parent, key);
            if (matchingChild == null) {
                return false;
            }
            if (key.length() <= matchingChild.getLabel().length()) {
                String prefix = matchingChild.getLabel().substring(0, key.length());
                return prefix.equals(key);
            } else {
                String keyPrefix = matchingChild.getLabel().substring(0, matchingChild.getLabel().length());
                if (!matchingChild.getLabel().equals(keyPrefix)) {
                    return false;
                }
                key = key.substring(matchingChild.getLabel().length());
            }

            parent = matchingChild;
        }

        return false;
    }

    /**
     * Node in suffix tree
     */
    private class Node {

        /**
         * Next level children
         */
        private LinkedList<Node> children;
        /**
         * Label on the node
         */
        private String label;

        public Node() {
            this.children = new LinkedList<Node>();
        }

        public Node(String label) {
            this();
            this.label = label;
        }

        public LinkedList<Node> getChildren() {
            return children;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }
}
