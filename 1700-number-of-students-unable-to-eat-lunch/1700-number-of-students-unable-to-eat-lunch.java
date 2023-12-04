class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
           Deque<Integer> student = new ArrayDeque<>();
            Deque<Integer> sandwich = new LinkedList<>();
            int k=0;
        for(int i=students.length-1;i>=0;i--){
            student.offerLast(students[i]);
            sandwich.push(sandwiches[i]);
        }
            while(k!=student.size()){
                if(student.peek()==sandwich.peek()){
                    student.poll();
                    sandwich.pop();
                    k=0;
                }
                else{
                    int v=student.pop();
                    student.offerLast(v);
                    k++;
                }
            }
        return student.size();
    }
}