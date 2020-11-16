package day5;

public class Book {
		private int booknum;
		private String bookname;
		private String writer;
		private int  statecode;
		
		public Book(int booknum, String bookname, String writer) {
			super();
			this.booknum = booknum;
			this.bookname = bookname;
			this.writer = writer;
			this.statecode = 1;
					
		}		
		
		public int getStatecode() {
			return statecode;
		}


		public void setStatecode(int statecode) {
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
			
			this.statecode = 0;
			}
}
