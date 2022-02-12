class Solution {
   public int ladderLength(String beginWord, String endWord, List<String> wordList) {
	var words = new HashSet<>(wordList);
	if (!words.contains(endWord))
		return 0;
		
	var adjList = getAdjList(beginWord, words);
	var q = new ArrayDeque<>(List.of(beginWord));
	var length = 0;

	while (!q.isEmpty()) {
		length++;

		for (var i = q.size(); i > 0; i--) {
			var word = q.poll();

			for (var neighbor : adjList.getOrDefault(word, List.of())) {
				if (neighbor.equals(endWord))
					return length + 1;
				q.add(neighbor);
			}

			// remove the processed word to avoid circular loop
			adjList.remove(word);
		}
	}

	return 0;
}

/**
 * Two words are neighbors if they differ by exactly 1 letter
 *
 * @param beginWord source word
 * @param words set of words
 * @return adjacency list of the graph representation of the words and their neighbors
 */
private Map<String, List<String>> getAdjList(String beginWord, Set<String> words) {
	var adjList = new HashMap<String, List<String>>();
	populateAdjList(words, adjList, beginWord);
	for (var word : words)
		populateAdjList(words, adjList, word);
	return adjList;
}

/**
 * Populate the adjacency list with the neighbors of the current word
 * 
 * @param words set of words
 * @param adjList adjacency list of the graph
 * @param word current node
 */
private void populateAdjList(Set<String> words, Map<String, List<String>> adjList, String word) {
	var wordArr = word.toCharArray();

	for (var i = 0; i < wordArr.length; i++) {
		for (var j = 'a'; j <= 'z'; j++) {
			// if letter is the same as original, skip it. e.g. don't change hot to hot, when j = h
			if (word.charAt(i) == j)
				continue;
			
			// change one letter at a time
			wordArr[i] = j;
			
			var neighbor = new String(wordArr);
			if (words.contains(neighbor))
				adjList.computeIfAbsent(word, k -> new ArrayList<>()).add(neighbor);
		}

		// restore the original letter
		wordArr[i] = word.charAt(i);
	}
}
}