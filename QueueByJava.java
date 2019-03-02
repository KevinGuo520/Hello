package com.leetcode.data.structure.circularqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ��Java�Դ��Ķ���
 * @author 14221
 *
 */
public class QueueByJava {

	private Queue<Integer> queue;
	
	public QueueByJava() {
		this.queue = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		// �������
		QueueByJava queueByJava = new QueueByJava();
		queueByJava.queue.offer(1);
		queueByJava.queue.offer(2);
		queueByJava.queue.offer(3);
		// ����ڶ����ײ�
		System.out.println(queueByJava.queue.peek());
		// ����
		queueByJava.queue.remove();
	}
}
