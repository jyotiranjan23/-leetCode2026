class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1) return intervals;
        Arrays.sort(intervals, (a,b) ->Integer.compare(a[0], b[0]) );
        List<List<Integer>> result = new ArrayList<>();
         int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]<= end){
                end = Math.max(end, intervals[i][1]);
            }
            else {
                result.add(List.of(start, end));
                start = intervals[i][0];
                end = intervals[i][1];

                
            }
        }
        result.add(List.of(start, end));
        int[][] resultArray = new int[result.size()][2];
        for(int i=0; i<result.size(); i++){
            resultArray[i][0] = result.get(i).get(0);
         resultArray[i][1] = result.get(i).get(1);

        }
        return resultArray;
    }
}