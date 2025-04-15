package MODULE3;
class Inheritance {
	String publisher;
	Publisher (String publi){
		this.publisher=publi;}}

	
class Book{
	String name;
	Publisher publisher;
	Book(){}
	public Book (String name,Publisher publisher) {
		this.name=name;
		this.publisher=publisher;}}
class Literatuer extends Book{
	String Lit_type="Literatuer";
	Literature(String name,Publisher publisher){
		super(name,publisher);}
	void display() {
		System.out.println("name"+super.name);
		System.out.println("Type:"+this.Lit_type);
		System.out.println("Publisher:"+this.publisher.publisher);}}
class Fiction extends Book{
	String Lit_type="Fiction";
	Fiction(String name,Publisher publisher){
		super(name,publisher);}
	void display() {
		System.out.println("name"+super.name);
		System.out.println("Type:"+this.Lit_type);
		System.out.println("Publisher:"+this.publisher.publisher);}}
public class InheritanceBook{
	public static void main(String[] args) {
		Publisher lp=new Publisher("s.Chand");
		Literature l=new literatuer("as you like it",ip);
		l.display();
		Publisher fp=new Publisher("Tata McGraw Hill");
		Fiction f=new Fiction("Tempest",fp);
		f.display();}}
		// TODO Auto-generated method stub

