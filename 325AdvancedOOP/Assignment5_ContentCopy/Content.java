public class Content<T> implements Comparable<Content<T>> {
    private T content;
    private int index;

    public Content(T content, int index){
        this.content = content;
        this.index = index;
    }

    /**
     * @return the content
     */
    public T getContent() {
        return content;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }


    public int compareTo(Content<T> other){
        return this.getIndex() - other.getIndex();
    }


    public boolean equals(Content<T> content){
        return (this.getContent().equals(content.getContent()) && (this.getIndex() == content.getIndex()));
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
