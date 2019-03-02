package com.leetcode.data.structure.circularqueue;

/**
 * MyCircularQueue(k): 构造器，设置队列长度为 k 。 Front: 从队首获取元素。如果队列为空，返回 -1 。 Rear:
 * 获取队尾元素。如果队列为空，返回 -1 。 enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。 deQueue():
 * 从循环队列中删除一个元素。如果成功删除则返回真。 isEmpty(): 检查循环队列是否为空。 isFull(): 检查循环队列是否已满。
 * 
 * @author 14221
 *
 */
public class CircularQueue {

	private int[] queue; // 用数组来作储存空间
	private int head; // 头部指针
	private int tail; // 尾部指针
	private int size; // 空间大小

	/**
	 * 构造函数 初始化值
	 * 
	 * @param size
	 */
	public CircularQueue(int size) {
		this.queue = new int[size];
		this.head = -1;
		this.tail = -1;
		this.size = size;
	}

	/**
	 * 判断队列是否为空 为空返回true, 不为空返回false
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return this.head == -1;
	}

	/**
	 * 判断队列是否已满 队列已满返回true, 没有满返回false
	 * 
	 * @return
	 */
	public boolean isFull() {
		return ((this.tail + 1) % this.size) == this.head;
	}

	/**
	 * 获取对头元素 如果队列为空返回-1, 否则返回队首元素
	 * 
	 * @return
	 */
	public int front() {
		// 判断是否为空, 为空返回-1
		if (isEmpty()) {
			return -1;
		}
		return this.queue[head];
	}

	/**
	 * 获取队尾元素 如果队列为空返回-1， 否则返回队尾元素
	 * 
	 * @return
	 */
	public int rear() {
		// 判断队列是否已满, 已满返回-1
		if (isEmpty()) {
			return -1;
		}
		return this.queue[tail];
	}

	/**
	 * 入队 如果队列已满返回false, 插入成功返回true
	 * 
	 * @param value
	 * @return
	 */
	public boolean enQueue(int value) {
		// 判断队列是否已满, 已满返回false
		if (isFull()) {
			System.out.println("队列已满...");
			return false;
		}
		if (isEmpty()) {
			System.out.println("队列已为空...");
			this.head = 0;
		}
		// 入队
		this.tail = (this.tail + 1) % size;
		this.queue[tail] = value;
		return true;
	}

	public boolean deQueue() {
		// 判断队列是否为空, 为空返回false
		if (isEmpty()) {
			System.out.println("队列已为空...");
			return false;
		}
		// 出对
		if (head == tail) {
			this.head = -1;
			this.tail = -1;
			return true;
		}
		this.head = (this.head + 1) % size;
		return true;
	}
}
