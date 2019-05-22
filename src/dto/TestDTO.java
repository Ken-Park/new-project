package dto;

public class TestDTO {
public int seq;
public String text;

public TestDTO() {
	super();
}
public TestDTO(int seq, String text) {
	super();
	this.seq = seq;
	this.text = text;
}
public int getSeq() {
	return seq;
}
public void setSeq(int seq) {
	this.seq = seq;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}

}
