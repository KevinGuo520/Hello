package com.leetcode.data.structure.circularqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用Java自带的队列
 * @author 14221
 *
 */
public class QueueByJava {

	private Queue<Integer> queue;
	
	public QueueByJava() {
		this.queue = new LinkedList<>();
	}
	
	public static void main(String[] args) {
		// 添加数据
		QueueByJava queueByJava = new QueueByJava();
		queueByJava.queue.offer(1);
		queueByJava.queue.offer(2);
		queueByJava.queue.offer(3);
		// 输出第队列首部
		System.out.println(queueByJava.queue.peek());
		// 出对
		queueByJava.queue.remove();
	}
}
