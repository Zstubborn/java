package com.zzc.comparableTest;

	public class ATest implements Comparable<ATest>{
		
		private Long id;
		private String name;
		private int age;
		
		public String toString(){
			return "id:" +id + " " + "name:" + name + " " + "age:" + age;
		}
		
		@Override
		public int compareTo(ATest o) {
			System.out.println("o.getId().compareTo(this.id):" + o.getId().compareTo(this.id));
			System.out.println("id:" + this.id);
			System.out.println("o.id:" + o.getId());
			return o.getId().compareTo(this.id);
		}
		
		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}

}
