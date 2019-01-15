
public class BinaryTree<T> implements Comparable<T> {
	private T data_ = null;
	private BinaryTree<T> left_ = null;
	private BinaryTree<T> right_ = null;

	public BinaryTree(T obj) {
		this.data_ = obj;
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return data_;
	}

	public void setData(T data) {
		this.data_ = data;
	}

	public BinaryTree<T> getLeft() {
		return left_;
	}

	public void setLeft(BinaryTree<T> left_) {
		this.left_ = left_;
	}

	public BinaryTree<T> getRight() {
		return right_;
	}

	public void setRight(BinaryTree<T> right_) {
		this.right_ = right_;
	}

	@Override
	public int compareTo(T arg0) {

		return arg0.hashCode() - this.hashCode();// literally makes no sense, but im a placeholder.
	}

	public void insert(T obj) {
		if (this.getData() == null) {
			this.setData(obj);
			return;
		}
		// if isequal just dont do anything.
		if (this.compareTo(obj) > 0 && this.getLeft() != null) {
			this.setLeft(new BinaryTree<>(obj));
			return;
		} else if (this.compareTo(obj) < 0 && this.getRight() != null) {
			this.setRight(new BinaryTree<>(obj)); return;
		}
		// root is not a leaf
		BinaryTree<T> curr = this;
		while (curr.getLeft() != null || curr.getRight() != null) {
				//go as far as needed and insert at hopfeully correct point.
			if (this.compareTo(obj) > 0 && this.getLeft() != null) {
				//walk lef
				curr = curr.getLeft();
			} else if(this.compareTo(obj) < 0 && this.getRight() != null){
				//walk right
				curr = curr.getRight();
			}
		}
		//technically curr should be correct now ^^
		if (curr.compareTo(obj) > 0 && curr.getLeft() != null) {
			curr.setLeft(new BinaryTree<>(obj));
			return;
		} else if (curr.compareTo(obj) < 0 && curr.getRight() != null) {
			curr.setRight(new BinaryTree<>(obj)); return;
		}
		//obj should be at it's correct position now.
		
	}
	public boolean isLeaf() {
		return (this.getLeft() == null || this.getRight() == null);
	}
	public boolean search(T obj) {
		if(this.getData() == obj) {
			return true;
		}
		BinaryTree<T> curr = this;
		while(!curr.isLeaf()) {
				if(curr.getData() == obj) {
					return true;
				}
			if(curr.compareTo(obj) > 0) {
				//search left
				
			}
		}
	}
	//-------------------------------------------------------------------//

}
/**
 * Binäre Suchbäume sind ein wichtiger Bestandteil der Informatik. Sie bestehen
 * aus Knoten mit einem Datum und maximal zwei Kindsknoten. Richtig verwendet
 * ermöglichen sie die Suche von Elementen mit logarithmischer Laufzeit, sowie
 * einige andere wichtige Eigenschaften.
 * 
 * a) Implementieren Sie einen generischen binären Suchbaum, der alle
 * Datentypen, die das Interface Comparable implementieren enthalten kann.
 * 
 * b) Implementieren Sie die Methode public void insert(T value), um beliebige
 * Daten in sortierter Reihenfolge in den Baum einzufügen, falls sie noch nicht
 * vorhanden sind.
 * 
 * c) Implementieren Sie die Methode public boolean search(T value), die true
 * zurückgibt, wenn das Element value im Baum enthalten ist bzw. false wenn es
 * nicht enthalten ist.
 * 
 * d) Implementieren Sie in der Methode public void inorder() eine inorder
 * Traversierung des Baumes, die alle Daten im Baum als String ausgibt.
 **/
