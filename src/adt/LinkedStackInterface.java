/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author User
 */
public interface LinkedStackInterface<T> {
    public void push(T element);
    public T pop();
    public T peek();
    public int size();
}
