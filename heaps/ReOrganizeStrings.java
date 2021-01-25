package heaps;
import java.util.*;
public class ReOrganizeStrings {
	
	
	
	public String reorganizeString(String S) {
		
		// maintain count or occurances of characters in s 
		Map<Character , Integer> map = new HashMap<>();
		
		for(char cc: S.toCharArray()) {
			map.put(cc, map.getOrDefault(cc, 0)+1);
		}
		
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((x,y) -> map.get(y)- map.get(x));
		
		maxHeap.addAll(map.keySet());
		StringBuilder sb = new StringBuilder();
		
		while(maxHeap.size() > 1) {
			char cc1 = maxHeap.remove(); //which has occurred most number of times in S.
			char cc2 = maxHeap.remove(); //  second most number of times in S.
			sb.append(cc1);
			sb.append(cc2);
			
			map.put(cc1, map.get(cc1)-1 );
			map.put(cc2, map.get(cc2)-1 );
			
			if(map.get(cc1) > 0) {
				maxHeap.add(cc1);
			}
			
			if(map.get(cc2) > 0) {
				maxHeap.add(cc2);
			}
		}
		
		if(maxHeap.size() == 1) {
			char cc = maxHeap.remove();
			int occ = map.get(cc);
			
			if(occ>1) {
				return "";
			}else {
				sb.append(cc);
			}
		}
		return sb.toString(); 
	}
	
	
}
