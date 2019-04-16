package crackingCodeInterview.chapter1;

public class Phrase {
    private String currentPhrase;
    public Phrase (String p) {
        currentPhrase = p;
    }

    public int findNthOccurrence(String str, int n) {
        int c = 0;
        for(int i = 0; i < currentPhrase.length() - str.length(); i++) {
            if(str.equals(currentPhrase.substring(i,i+str.length())))
                c++;
            if(c == n)
                return i;
        }
        return -1;

    }

    public void replaceNthOccurence(String str, int n, String rep) {
        int temp = findNthOccurrence(str,n);
        if(temp == -1) {
            currentPhrase = currentPhrase;
        }
        currentPhrase = currentPhrase.substring(0,temp+1) + rep +
                currentPhrase.substring(currentPhrase.length() - rep.length(), currentPhrase.length()-1);

    }

    @Override
    public String toString() {
        return this.currentPhrase;
    }
}