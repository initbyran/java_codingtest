package programmers;

import java.util.*;

public class examBestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        // 장르, 인덱스, 재생횟수 한번에 맵에 담기
        Map<String, Map<Integer,Integer>> songMap = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            songMap.putIfAbsent(genres[i], new HashMap<>());
            Map<Integer,Integer> songInfo = songMap.get(genres[i]);
            songInfo.put(i, plays[i]);
        }

        // 장르 중복 제거
        Set<String> genreSet = new HashSet<>();
        for(int i=0; i<genres.length; i++){
            genreSet.add(genres[i]);
        }

        // 장르별 재생횟수 합 비교
        Map<String, Integer> compareMap = new HashMap<>();
        for (String genre : genreSet){
            Map<Integer, Integer> songInfo = songMap.get(genre);
            int sum = 0;
            // map의 모든 value값 가져오기
            Collection<Integer> values = songInfo.values();
            for(Integer value : values){
                sum += value ;
            }
            compareMap.put(genre, sum);
        }

        // map의 value값(재생횟수의 합)을 기준으로 내림차순 정렬
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(compareMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // 재생횟수 내림차순 정렬
        List<Integer> answerList = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : entryList){
            Map<Integer, Integer> songInfo = songMap.get(entry.getKey());
            List<Map.Entry<Integer, Integer>> entryList2 = new ArrayList<>(songInfo.entrySet());
            entryList2.sort((e1, e2) -> {
                if (e1.getValue().equals(e2.getValue())) {
                    return e1.getKey().compareTo(e2.getKey()); // 재생 횟수가 같을 경우 고유 번호가 낮은 노래를 먼저 수록
                } else {
                    return e2.getValue().compareTo(e1.getValue()); // 재생 횟수가 높은 노래를 먼저 수록
                }
            });
            // 상위 2곡까지만 수록
            if (songInfo.size() >= 2) {
                Map.Entry<Integer, Integer> firstEntry = entryList2.get(0);
                Map.Entry<Integer, Integer> secondEntry = entryList2.get(1);
                answerList.add(firstEntry.getKey());
                answerList.add(secondEntry.getKey());
            } else {
                Map.Entry<Integer, Integer> firstEntry = entryList2.get(0);
                answerList.add(firstEntry.getKey());
            }

        }

        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        for(int i: answer) {
            System.out.println(i);
        }
    }
}
