package com.leetcode.data.structure.circularqueue;

/**
 * MyCircularQueue(k): �����������ö��г���Ϊ k �� Front: �Ӷ��׻�ȡԪ�ء��������Ϊ�գ����� -1 �� Rear:
 * ��ȡ��βԪ�ء��������Ϊ�գ����� -1 �� enQueue(value): ��ѭ�����в���һ��Ԫ�ء�����ɹ������򷵻��档 deQueue():
 * ��ѭ��������ɾ��һ��Ԫ�ء�����ɹ�ɾ���򷵻��档 isEmpty(): ���ѭ�������Ƿ�Ϊ�ա� isFull(): ���ѭ�������Ƿ�������
 * 
 * @author 14221
 *
 */
public class CircularQueue {

	private int[] queue; // ��������������ռ�
	private int head; // ͷ��ָ��
	private int tail; // β��ָ��
	private int size; // �ռ��С

	/**
	 * ���캯�� ��ʼ��ֵ
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
	 * �ж϶����Ƿ�Ϊ�� Ϊ�շ���true, ��Ϊ�շ���false
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return this.head == -1;
	}

	/**
	 * �ж϶����Ƿ����� ������������true, û��������false
	 * 
	 * @return
	 */
	public boolean isFull() {
		return ((this.tail + 1) % this.size) == this.head;
	}

	/**
	 * ��ȡ��ͷԪ�� �������Ϊ�շ���-1, ���򷵻ض���Ԫ��
	 * 
	 * @return
	 */
	public int front() {
		// �ж��Ƿ�Ϊ��, Ϊ�շ���-1
		if (isEmpty()) {
			return -1;
		}
		return this.queue[head];
	}

	/**
	 * ��ȡ��βԪ�� �������Ϊ�շ���-1�� ���򷵻ض�βԪ��
	 * 
	 * @return
	 */
	public int rear() {
		// �ж϶����Ƿ�����, ��������-1
		if (isEmpty()) {
			return -1;
		}
		return this.queue[tail];
	}

	/**
	 * ��� ���������������false, ����ɹ�����true
	 * 
	 * @param value
	 * @return
	 */
	public boolean enQueue(int value) {
		// �ж϶����Ƿ�����, ��������false
		if (isFull()) {
			System.out.println("��������...");
			return false;
		}
		if (isEmpty()) {
			System.out.println("������Ϊ��...");
			this.head = 0;
		}
		// ���
		this.tail = (this.tail + 1) % size;
		this.queue[tail] = value;
		return true;
	}

	public boolean deQueue() {
		// �ж϶����Ƿ�Ϊ��, Ϊ�շ���false
		if (isEmpty()) {
			System.out.println("������Ϊ��...");
			return false;
		}
		// ����
		if (head == tail) {
			this.head = -1;
			this.tail = -1;
			return true;
		}
		this.head = (this.head + 1) % size;
		return true;
	}
}
