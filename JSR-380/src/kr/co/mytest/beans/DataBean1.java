package kr.co.mytest.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class DataBean1 {
		@NotEmpty
		private String data1;
		@NotBlank
		private String data2;
		@Positive
		private int data3;
		@Email
		private String data4;
		private String data5;
		
		
		
		public String getData4() {
			return data4;
		}



		public void setData4(String data4) {
			this.data4 = data4;
		}



		public DataBean1() {
			this.data1 = " t ";
			this.data2 = " t ";
		}
		
		
		
		public int getData3() {
			return data3;
		}



		public void setData3(int data3) {
			this.data3 = data3;
		}



		public String getData2() {
			return data2;
		}



		public void setData2(String data2) {
			this.data2 = data2;
		}



		public String getData1() {
			return data1;
		}
		public void setData1(String data1) {
			this.data1 = data1;
		}
		
		
}
