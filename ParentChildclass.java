package HW;
class Parentclass{
	  public void pmethod(){
	    System.out.println("This is parent class");
	  }
	}

	class Childclass extends Parentclass{
	  public void cmethod(){
	    System.out.println("This is child class");
	  }
	}

	class ParentChildclass{
	  public static void main(String[] args){
	    Parentclass m = new Parentclass();
	    Childclass n = new Childclass();
	    m.pmethod();
	    n.cmethod();
	    n.pmethod();
	  }
	}

