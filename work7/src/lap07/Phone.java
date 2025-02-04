package lap07;

public class Phone {
	private String model;
    
		public String getModel() {
			
			if((model==null)||(model=="")) {
				model=" undefined model";
			}
			
			return model;
		
		}

    
		public void setModel(String newModel) {
			setOldmodel(getModel());
			this.model = newModel;
		}

	
	private int price;
		public int getPrice() {
			return price;
	
		}


		public void setPrice(int newPrice) {
			setOldprice(getPrice());
			if(newPrice < 0) {
				newPrice=0;
			}
			this.price = newPrice;
		}
	public Phone() {
		setModel( "undefined model");
		setPrice(0);
		
	}
	public Phone(String new_modle, int new_price) {
		setModel(new_modle);
		setPrice(new_price);
	}
	
	private String oldmodel;
    
	public String getOldmodel() {
		return oldmodel;
	
	}

	public void setOldmodel(String newoldmodel) {
		this.oldmodel = newoldmodel;
	}


private int oldprice;
	public int getOldprice() {
		return oldprice;

	}


	public void setOldprice(int newOldprice) {
		
		this.oldprice = newOldprice;
	}
	
	public String toString() {
		String txt;
		txt="";
		if((getModel()=="")||(getModel()==" undefined model")) {
			txt+="Model name cannot be empty. \r\n"; 
		}
		if(getPrice()==0) {
			txt+="Price cannot less than 0. \r\n";
		}
		if( (getPrice()==0) && (getModel()=="")) {
			return txt+"Phone [model="+getOldmodel()+", price="+getOldprice()+"]";
		}else
		{
			return txt+"Phone [model="+getModel()+", price="+getPrice()+"]";
		}
	}
}
