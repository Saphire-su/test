package HotelAppMaven.com.fjnu;

public class ListHome {
	IData iData;
	public ListHome(IData iData){
		this.iData=iData;
	}
	public ListHome(){
		
	}
	public void search(){
		for(int i=0;i<HotelConstant.HOTEL_TOTAL_FLOOR;i++){
			for(int j=0;j<HotelConstant.HOTEL_ROOMS_EVERYFLOOR;j++){
				if(j+1<10)
					System.out.print(i+1+"0"+(j+1)+"\t");
				else
					System.out.print(i+1+""+(j+1)+"\t");
			}
			System.out.println();
			for(int j=0;j<HotelConstant.HOTEL_ROOMS_EVERYFLOOR;j++){
				System.out.print(iData.getStation((i+1)*100+j+1)+"\t");
			}
			System.out.println();
		}

	}
}
