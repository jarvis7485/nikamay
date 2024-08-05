class percentage {
    public static void main (strings[] args){
        int[] marks = { 55, 47,78,78,63};
        int total = 0;
         for (int marks : marks) {
            total += marks;
         }
         double percentage =(total/500)*100;
         System.out.println("percentage"+total);
    }
}