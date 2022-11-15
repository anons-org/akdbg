package constans.types.next;

public class NextArguments {

    /** Specifies the thread for which to resume execution for one step (of the given granularity). */

    int threadId;
    /** If this flag is true, all other suspended threads are not resumed. */

    boolean singleThread;
    /** Stepping granularity. If no granularity is specified, a granularity of `statement` is assumed. 'statement' | 'line' | 'instruction'; */

    String granularity;

    public int getThreadId() {
        return threadId;
    }

    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public boolean isSingleThread() {
        return singleThread;
    }

    public void setSingleThread(boolean singleThread) {
        this.singleThread = singleThread;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }
}
