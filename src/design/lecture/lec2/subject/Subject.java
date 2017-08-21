package design.lecture.lec2.subject;

import design.lecture.lec2.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers(); //주제 상태변경시 observer객체들에게 알리기 위해 호출.
	
}
