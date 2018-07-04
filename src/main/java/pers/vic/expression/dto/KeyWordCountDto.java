package pers.vic.expression.dto;

/**
 * Create By Vic Xu on 7/4/2018
 */
public class KeyWordCountDto {
    private String keyWord;
    private int start;
    private int end;

    public KeyWordCountDto(String keyWord, int start, int end) {
        this.keyWord = keyWord;
        this.start = start;
        this.end = end;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "KryWordCountDto{" +
                "keyWord='" + keyWord + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
