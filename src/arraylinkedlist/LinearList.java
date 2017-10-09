package arraylinkedlist;

public interface LinearList {
   public boolean isEmpty();
   public int size();
   public Object get(int index);
   public int indexOf(Object element);
   public Object remove(int index);
   public void add(int index, Object obj);
   public String toString();
//   public void trimToSize();
//   public Object setSize(int in);
//   public Object clear();
//   public Object removedrange(int index, int index2);
//   public Object clone(Object[] copy);
}
