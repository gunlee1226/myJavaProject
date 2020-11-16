package day5;

public class Book {
		private int booknum;
		private String bookname;
		private String writer;
		private String  statecode;
		
		public Book(int booknum, String bookname, String writer) {
			super();
			this.booknum = booknum;
			this.bookname = bookname;
			this.writer = writer;
			this.statecode = "가능";
					
		}		
		
		public String getStatecode() {
			return statecode;
		}


		public void setStatecode(String statecode) {
			this.statecode = statecode;
			
		}


		public int getBooknum() {
			return booknum;
		}

		public void setBooknum(int booknum) {
			this.booknum = booknum;
		}

		public String getBookname() {
			return bookname;
		}

		public void setBookname(String bookname) {
			this.bookname = bookname;
		}

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}
		
		public void rent() {
			
			this.statecode = "불가능";
			}
}
