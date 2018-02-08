package com.sapient.synchronizer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockImpl {

	private ReadWriteLock lock = new ReentrantReadWriteLock();
	private int count = 0;
	Map<Integer , Integer> map = new HashMap<Integer , Integer>();

	public void increment(int i) {
		lock.writeLock().lock();
		try {
			map.put(i, i);
		} finally {
			lock.writeLock().unlock();
		}
	}

	public Map<Integer , Integer> get() {
		lock.readLock().lock();
		try {
			return map;
		} finally {
			lock.readLock().unlock();
		}

	}

}
