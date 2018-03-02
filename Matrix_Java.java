import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Matrix_Java
{
	public static void main (String[] args) throws java.lang.Exception
	{
		for (int N=50;N<=450;N+=50){
			int [][] Matrix_A = new int[N][N];
			int [][] Matrix_B = new int[N][N];
			int [][] Matrix_AB = new int[N][N];
			for (int i=0;i<N;i++){
				for (int j=0;j<N;j++){
					Matrix_A[i][j] = 1;
					Matrix_B[i][j] = 2;
				}
			}
			int Operation = N*N*((2*N)-1);
			System.out.println("Size: " + N);
			System.out.println("Operations: " + Operation);
			double execution_Time;
			long Init = System.currentTimeMillis();
			for (int times=0;times<10;times++){
				for (int i=0;i<N;i++){
					for (int j=0;j<N;j++){
						int count=0;
						for(int k=0;k<N;k++){
							count += Matrix_A[i][k]*Matrix_B[k][j];
						}
						Matrix_AB[i][j] = count;
					}
				}
			}
			execution_Time = System.currentTimeMillis() - Init;
			System.out.println("Execution Time: " + execution_Time/(Operation*10) + " ms");
			System.out.println("-----------------------------");
		}
	}
}