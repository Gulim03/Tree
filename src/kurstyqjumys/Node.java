package kurstyqjumys;

public  class Node implements AVLTree { // создаем класс узла
    Node right; // строки потомков
    Node left;
    Node parent; // родительская
    private int value; // заданное число из которых мы и будем делать наше дерево AVL
    int height = 0; // Высота дерева

    public Node(int data, Node parent) { // конструктор узела
        this.value = data; // ПРИРАВНИВАЕМ ЧИСЛО К ЧИСЛУ А РОДИТЕЛЯ К РОДИТЕЛЮ
        this.parent = parent;
    }
//
//	@Override // переопределение метода класса джава toString()
//	public String toString() {
//
//		/*
//		 * Метод toString(ПИСАТЬ) это метод класса Objects,возвращающий символьную
//		 * строку описывающую объект.Чтобы вывести удобно и красиво на экран мы
//		 * переопределили toString так чтобы напись что выдаст нам среда была нам
//		 * понятна
//		 */
//
//		return "|(" + value + ")[" + "h:(" + height + "),p:(" + (parent == null ?
//		// ?- это условный оператор взаимозаменяемое if
//				"null" : /* (:) это else */ parent.value) + ")]| ";
//	}

    @Override
    public void setRightChild(Node child) {
        // задать правого потомка
        if (child != null) { // если потомок не равен null т,е если есть поддерево
            child.parent = this; // то значение начала развилки станет родителем этого поддерева
        }
        this.right = child; // задаем правого потомка
    }

    @Override
    public void setLeftChild(Node child) {
        // задать левого потомка или левое поддерево,(бұтақ)
        if (child != null) { // если потомок не равен null т,е если есть поддерево
            child.parent = this; // то значение начала развилки станет родителем этого поддерева
        }
        this.left = child; // задаем левого потомка
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}