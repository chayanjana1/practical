class Nestedif {
	public static void main(String[] args){
String address = "kolkata, India";
if(address.endsWith("India")){
if(address.contains("Dunlop")){
System.out.println("Your city is Dunlop");
}else if(address.contains("Newtown")){
System.out.println(address.split(",")[0]);
}
}else{
System.out.println("you are not living in India");
}
}
}
