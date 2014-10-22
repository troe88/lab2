package ru.spbstu.telematics.stu.collections;

import java.util.Iterator;

public class Vector implements IVector, Iterable<Object> {

	protected Object[] data; // массив для хранения элементов

	protected int dataCount; // количество элементов в массиве data

	protected int capacityIncrement; // "мощьность" вектора.

	public Vector(int capInit, int capInc) {
		super();

		if (capInit < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + capInit);

		this.data = new Object[capInit];
		this.capacityIncrement = capInc;
	}

	public Vector(int capInit) {
		this(capInit, capInit);
	}

    public Vector() {
        this(5);
    }
	
    public int size(){
    	return dataCount;
    }
    
    public boolean isEmpty(){
    	return dataCount == 0;
    }
    
    private void incCapacity(){
    	if((this.dataCount + 1) > this.data.length){
			int oldCap = this.capacityIncrement;
			this.capacityIncrement = (this.capacityIncrement * 3) / 2 + 1;
			Object temp[] = new Object[oldCap]; 
			System.arraycopy(this.data, 0, temp, 0, oldCap);		
			this.data = new Object[this.capacityIncrement];
			System.arraycopy(temp, 0, this.data, 0, oldCap);
    	}
    }
    
    private class Itr implements Iterator<Object>{
    	private int curInd = 0;

		@Override
		public boolean hasNext() {
			if((curInd + 1) <= dataCount)
				return true;
			return false;
		}

		@Override
		public Object next() {
			return data[curInd++];
		}
    	
    };
    
	@Override
	public Iterator<Object> iterator() {
		return new Itr();
	}

	@Override
	public void add(Object o) {
		incCapacity();
		this.data[this.dataCount++] = o;
	}

	@Override
	public void add(Object o, int pos) {
		incCapacity();
		System.arraycopy(this.data, pos, this.data, pos + 1, this.dataCount - pos);
		this.data[pos] = o;
		this.dataCount++;
	}

	@Override
	public void remove(int index) {
		int numMoved = this.dataCount - index - 1;
		System.arraycopy(this.data, index + 1, this.data, index, numMoved);
		this.data[--this.dataCount] = null;
	}

	@Override
	public Object get(int index) {
		if(index >= this.dataCount)
			throw new IllegalArgumentException("Index " + index + " out of range.");
		return this.data[index];
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
