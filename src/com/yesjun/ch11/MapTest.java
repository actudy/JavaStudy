package com.yesjun.ch11;

/*
 *  Map 주요 메소드			K : Key 타입, V : Value 타입
 *
 *  	- V put(K key, V value)		: 데이터 입력
 *  	- V get(K key)				: 특정 key에 대한 value 추출
 *  	- V remove(Object key)		: 특정 key에 대한 Map 요소 삭제
 */

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
		/*
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "a123");
		map.put("bbb", "b456");
		map.put("ccc", "c789");

		// key 데이터들은 Set 형식! -> keySet()
		//	-> key의 중복은 허용하지 않는다.
		//	-> 하지만, 동일 키에 대한 입력은 업데이트!
		map.put("ccc", "a123"); // value는 중복 가능!
		System.out.println("aaa key에 대한 value : " + map.get("aaa"));
		System.out.println("bbb key에 대한 value : " + map.get("bbb"));
		System.out.println("ccc key에 대한 value : " + map.get("ccc"));

		// 비밀번호 변경
		Scanner s = new Scanner(System.in);
		System.out.println("ID 입력 : ");
		String id = s.nextLine();

		// key
		if(map.containsKey(id)) { // 해당 key가 존재하는지
			System.out.println("ID : [" + id + "]");
		} else {
			System.out.println("해당 ID는 존재하지 않습니다.");
			System.out.println("[System] : 프로그램 종료");
			System.exit(0);
		}

		// value
		System.out.print("현재 PASSWORD 입력 : ");
		String pw = s.nextLine();

		// 넘어온 key에 대한 password가 map 요소의 value와 일치하는지
		if(map.get(id).equals(pw)) {
			System.out.println("[System] : 일치합니다.");
			System.out.print("변경할 PASSWORD 입력 : ");
			String newPw = s.nextLine();
			map.put(id, newPw); // 업데이트 (수정)
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("[System] : 프로그램 종료");
			System.exit(0); // 프로그램 종료
		}
		System.out.println("비밀번호가 변경되었습니다.");

		// keySet() : map 요소의 key들을 Set으로 반환
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next(); // 추출
			System.out.println(key + " " + map.get(key));
//			System.out.println(keys.next() + " " + map.get(keys.next()));
			// next() : 데이터를 꺼낸다!
			//	-> NoSuchElementException : 더 이상 찾을 요소가 없다.
		}

		// entrySet()
		Set<Entry<String, String>> entry = map.entrySet();
		for(Entry<String, String> e : entry) {
			System.out.println("ID : " + e.getKey()
							 + ", PW : " + e.getValue());
		}
		*/

        // Hashtable -> 사용법은 동일!
//		Map<String, Integer> myMap = new Hashtable<String, Integer>();
//		myMap.put("one", new Integer(1)); // boxing
//		myMap.put("two", 2); // auto boxing
//		myMap.put("three", 3);
//		Integer iVal = myMap.get("two");
//		System.out.println(iVal);

        // 제공하는 메소드의 동기화 여부
//		Map<String, String> map = new Hashtable<String, String>();
        // null을 허용하지 않는다. 동기화가 되어있음.
//		Map<String, String> map = new HashMap<String, String>();
        // null 허용한다. 동기화 되지 않음.
        //	-> 자원 공유의 문제점, 멀티 쓰레드 환경에서 조심!
        Map<String, String> map = new LinkedHashMap<String, String>();
        // LinkedHashMap -> 저장 순서를 보장하고 싶을 때!
        // *데이터를 참조하기 위해서는 key를 활용하기 때문에 저장 순서는 관심이 없다.
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", null);
        map.put("four", null);
        map.put("five", null);
        map.put("six", null);
        map.put("seven", null);

        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            System.out.println(key + " " + map.get(key));
        }
    }
}
