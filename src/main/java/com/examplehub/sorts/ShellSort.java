package com.examplehub.sorts;

public class ShellSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    for (int length = numbers.length, gap = length >> 1; gap > 0; gap >>= 1) {
      for (int i = gap; i < length; ++i) {
        int temp = numbers[i];
        int j;
        for (j = i - gap; j >= 0 && temp < numbers[j]; j -= gap) {
          numbers[j + gap] = numbers[j];
        }
        numbers[j + gap] = temp;
      }
    }
  }

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    for (int length = array.length, gap = length >> 1; gap > 0; gap >>= 1) {
      for (int i = gap; i < length; ++i) {
        T temp = array[i];
        int j;
        for (j = i - gap; j >= 0 && temp.compareTo(array[j]) < 0; j -= gap) {
          array[j + gap] = array[j];
        }
        array[j + gap] = temp;
      }
    }
  }
}
