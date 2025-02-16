public class compareBufferBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();
        long BuilderStarttime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            builder.append("hello");
        }
        long elapsedBuildertime = System.nanoTime() - BuilderStarttime;
        System.out.println( "Time taken by StringBuilder :- " + elapsedBuildertime);

        long bufferStartTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            buffer.append("Hello");
        }
        long elapsedBuffertime = System.nanoTime() - bufferStartTime;
        System.out.println("Time taken by StringBuffer:- " + elapsedBuffertime);

        //which is better
        System.out.println(elapsedBuffertime < elapsedBuildertime ? "StringBuffer is Faster": "StringBuilder is faster");
    }
}
