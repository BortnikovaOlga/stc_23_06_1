package z1;

public class Massage {

    private int lettersInBlockCount;
    private int lettersBlockSize;
    private int blankSize;
    private int blanksCount;
    private int lettersCount;
    private int totalMessageSize;

    public Massage(int lettersInBlockCount, int lettersBlockSize, int blanksCount, int blankSize, int lettersCount) throws IllegalArgumentException {
        validateLettersInBlockCount(lettersInBlockCount);
        validateLettersBlockSize(lettersBlockSize);
        validateBlankSize(blankSize);
        validateBlanksCount(blanksCount);
        validateLettersCount(lettersCount);
        setTotalMessageSize();
    }

    public int getLettersInBlockCount() {
        return lettersInBlockCount;
    }

    public int getLettersBlockSize() {
        return lettersBlockSize;
    }

    public int getBlankSize() {
        return blankSize;
    }

    public int getBlanksCount() {
        return blanksCount;
    }

    public int getLettersCount() {
        return lettersCount;
    }

    public int getTotalMessageSize() {
        return totalMessageSize;
    }

    public void setLettersInBlockCount(int lettersInBlockCount) throws IllegalArgumentException {
        validateLettersInBlockCount(lettersInBlockCount);
        this.setTotalMessageSize();
    }

    private void validateLettersInBlockCount(int lettersInBlockCount) {
        if (lettersInBlockCount > 0)
            this.lettersInBlockCount = lettersInBlockCount;
        else
            throw new IllegalArgumentException("В блоке должна быть хоть одна буква");
    }

    public void setLettersBlockSize(int lettersBlockSize) {
        validateLettersBlockSize(lettersBlockSize);
        this.setTotalMessageSize();
    }

    private void validateLettersBlockSize(int lettersBlockSize) {
        if (lettersBlockSize > 0)
            this.lettersBlockSize = lettersBlockSize;
        else
            throw new IllegalArgumentException("Размер блока должен быть больше нуля");
    }

    public void setBlankSize(int blankSize) {
        validateBlankSize(blankSize);
        this.setTotalMessageSize();
    }

    private void validateBlankSize(int blankSize) {
        if (blankSize >= 0)
            this.blankSize = blankSize;
        else
            throw new IllegalArgumentException("Размер пробела больше или равен нулю");
    }

    public void setBlanksCount(int blanksCount) {
        validateBlanksCount(blanksCount);
        this.setTotalMessageSize();
    }

    private void validateBlanksCount(int blanksCount) {
        if (blanksCount >= 0)
            this.blanksCount = blanksCount;
        else
            throw new IllegalArgumentException("Количество пробелов больше или равно нулю");
    }

    public void setLettersCount(int lettersCount) {
        validateLettersCount(lettersCount);
        this.setTotalMessageSize();
    }

    private void validateLettersCount(int lettersCount) {
        if (lettersCount >= 1)
            this.lettersCount = lettersCount;
        else
            throw new IllegalArgumentException("Количество букв должно больше или равно единице");
    }

    private void setTotalMessageSize() {
         float size = (float)(this.lettersBlockSize * this.lettersCount / this.lettersInBlockCount)  +
                this.blankSize * this.blanksCount;
        this.totalMessageSize = (int)Math.ceil(size);
    }

    @Override
    public String toString() {
        return "z1.LoveMassage{" +
                "lettersInBlockCount=" + lettersInBlockCount +
                ", blockSize=" + lettersBlockSize +
                ", blankSize=" + blankSize +
                ", blanksCount=" + blanksCount +
                ", totalLettersCount=" + lettersCount +
                ", totalMessageSize=" + totalMessageSize +
                '}';
    }
    public boolean isFitInPlace(int size){
        return size>= this.getTotalMessageSize();
    }
}


