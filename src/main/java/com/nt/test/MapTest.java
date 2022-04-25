package com.nt.test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapTest {

	public static void main(String[] args) {
		User user=new User(101,"sai","hyd");
		User user3=new User(101,"sai","hyd");
		User user1=new User(102,"karan", "bza");
		User user2=new User(103,"raj", "vizag");
		//List<User> list=List.of(user,user1,user2,user3);
		Set<String> k=Set.of("A","B","C","Ak");
		System.out.println(k.getClass());
		Set<User> list=Set.of(user,user1,user2,user3);
		//List<User> list=List.of(user,user1,user2,user);
//		Set<UserDTO> listdto=list.stream().map(use->new UserDTO(use.getId(),use.getName(),use.getAddress())).collect(Collectors.toSet());
		
		  Set<UserDTO> listdto=list.stream().filter(e->e.getAddress()=="hyd")
		  .map(use->new UserDTO(use.getId(),use.getName(),use.getAddress()))
		  .collect(Collectors.toSet());
		 listdto.forEach(ob->System.out.println(ob));

	}//main
}//class	
	class User{
		public User(Integer id, String name, String address) {
			
			this.id = id;
			Name = name;
			Address = address;
		}
		private Integer id;
		private String Name;
		private String Address;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
		}
	}//class
	
	class UserDTO{
		private Integer id;
		private String Name;
		private String Address;
		public UserDTO(Integer id, String name, String address) {
			
			this.id = id;
			Name = name;
			Address = address;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		@Override
		public String toString() {
			return "UserDTO [id=" + id + ", Name=" + Name + ", Address=" + Address + "]";
		}
	}//class


