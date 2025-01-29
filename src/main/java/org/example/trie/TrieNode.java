package org.example.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    char c;
    Map<Character, Character> map = new HashMap<>(3);
    boolean flag;
}