class Solution {
    
    class Node{
        
        Node[] links;
        List<String> startsWith; //stores products after each character of searchWord is typed
        Node(){
           links = new Node[26];
            startsWith= new ArrayList<>();
        }
        boolean containsKey(char ch)
        {
            return links[ch-'a']!=null;
        }
        
        Node get(char ch)
        {
            return links[ch-'a'];
        }
        
        void put(char ch, Node node)
        {
            links[ch-'a']=node;
        }
        
    }
    
    class Trie
    {
        Node root;
        Trie(){
            root= new Node();
        }
        
        void insert(String word)
        {
            Node node= root;
            for(int i=0;i<word.length();i++)
            {
                if(!node.containsKey(word.charAt(i)))
                    node.put(word.charAt(i), new Node());
                //inserts the word to list at every reference of given character
                node.links[word.charAt(i)-'a'].startsWith.add(word);
                node= node.get(word.charAt(i));
            }
        }
        
         
      List<String> search(String prefix, Node root) {
            Node node = root;
            for (char c : prefix.toCharArray()) {
                if (node.links[c-'a'] == null)  
                    return new ArrayList<>();
                node = node.links[c-'a'];
            }
			//return the list for given prefix
            return node.startsWith;
         }
    }
	
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Trie trie= new Trie();
       
        for(String product:products)
           trie.insert(product);
        
        String prefix = "";
        for (char ch : searchWord.toCharArray()) {
            prefix += ch;   
            List<String> list = trie.search(prefix, trie.root);  
			//sorting to get the lexicographically  minimums
            Collections.sort(list); 
            if (list.size() >= 4) {
                list = list.subList(0,3); 
            }
            ans.add(list);
        }
        return ans;
    }
}