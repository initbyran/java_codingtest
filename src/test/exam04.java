package test;

import java.util.*;

public class exam04 {
    public static void main(String[] args) {

        int n = 5;
        int[][] nationality = {{1,2}, {2,3}};

        Map<Integer, Set<Integer>> map = new HashMap<>();

        // 1. 초기화
        for(int i = 1; i <= n; i++) {
            map.put(i, new HashSet<>(Collections.singletonList(i)));
        }

        // 2. nationality 배열 순회
        for(int[] pair : nationality) {
            int a = findRepresentative(pair[0], map);
            int b = findRepresentative(pair[1], map);

            // a와 b가 속한 그룹이 다르면 두 그룹을 합친다.
            if(a != b) {
                map.get(a).addAll(map.get(b));
                // 합쳐진 그룹의 모든 학생이 새로운 그룹을 가리키도록 업데이트한다.
                for(int student : map.get(b)) {
                    map.put(student, map.get(a));
                }
            }
        }

        // 3. 조합 계산
        int answer = 0;
        Set<Set<Integer>> uniqueGroups = new HashSet<>(map.values());
        List<Integer> groupSizes = new ArrayList<>();
        for(Set<Integer> group : uniqueGroups) {
            groupSizes.add(group.size());
        }

        for(int i = 0; i < groupSizes.size(); i++) {
            for(int j = i + 1; j < groupSizes.size(); j++) {
                answer += groupSizes.get(i) * groupSizes.get(j);
            }
        }


        System.out.println(answer);
    }

    private static int findRepresentative(int student, Map<Integer, Set<Integer>> map) {
        for(Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            if(entry.getValue().contains(student)) {
                return entry.getKey();
            }
        }
        return -1; // 이 부분은 실행되지 않아야 한다.
    }
}
