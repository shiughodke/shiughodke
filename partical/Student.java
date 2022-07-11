package shiu;

 class Student {

	
		// declaring variable as private
		
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getsName() {
			return sName;
		}
		public void setsName(String sName) {
			this.sName = sName;
		}
		public String getsEmail() {
			return sEmail;
		}
		public void setsEmail(String sEmail) {
			this.sEmail = sEmail;
		}
		public long getsPhone() {
			return sPhone;
		}
		public void setsPhone(long sPhone) {
			this.sPhone = sPhone;
		}
		private String sName;
		private String sEmail;
		private long sPhone;


	}


