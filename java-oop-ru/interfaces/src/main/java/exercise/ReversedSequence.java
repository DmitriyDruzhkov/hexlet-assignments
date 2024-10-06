package exercise;


import javax.sound.midi.Sequence;

// BEGIN
public class ReversedSequence implements CharSequence {
    private CharSequence string;
    public ReversedSequence text;
    ReversedSequence(CharSequence string) {
        this.string = string;
    }

    @Override
    public int length() {
        return this.string.length();
    }

    @Override
    public char charAt(int index) {
        char c = 0;
        if (index < this.string.length() && index >= 0) {
            c = this.string.charAt(this.string.length() - 1 - index);
        }
            return c;
        }


    @Override
    public CharSequence subSequence(int start, int end) {
        char ch;
        String nstring = "";
        for (int i=end; i>start; i--)
        {
            ch= string.charAt(i); //extracts each character
            nstring= ch+nstring; //adds each character in front of the existing string
        }
        return nstring;
    }

    @Override
    public String toString() {
        char ch;
        String nstring = "";
        for (int i=0; i<string.length(); i++)
        {
            ch= string.charAt(i); //extracts each character
            nstring= ch+nstring; //adds each character in front of the existing string
        }
        return nstring;
    }


}
// END
