package HotelAppMaven.com.fjnu;

public class InHotel {
	IData iData;
	public InHotel(IData iData){
		this.iData=iData;
	}
	public InHotel(){
		
	}
	
	public String in(int roomNo,String name){
		return iData.in_Out_Room(roomNo,name);
	}
	
	public boolean isEmpty(int roomNo){
		if(HotelConstant.EMPTY.equals(iData.getStation(roomNo)))
			return true;
		else
			return false;
	}
}
