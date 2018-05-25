package com.ada;



import com.ada.dao.CityDaos;
import com.ada.dto.CityDao;
import com.ada.mybatis.MyBatisConnectionFactory;







public class Main {

	public static void main(String args[]){
		

		CityDaos cityDaos= new CityDaos(MyBatisConnectionFactory.getSqlSessionFactory());


		CityDao city = new CityDao();
                city.setId(43);
		city.setName("Person 3");
		

		cityDaos.insert(city);

                city.setId(44);
		city.setName("city 4");	

		int id = cityDaos.insert(city);
		
	/**
		cityDaos.selectById(id);
		
	
		List<CityDao> citys = cityDaos.selectAll();
		
	
		for(int i = 0; i < citys.size(); i++){
			citys.get(i).setName("Person Name "+i);
			//( 4 ) update citys
			cityDaos.update(citys.get(i));
		}
	
		citys = cityDaos.selectAll();

*/

	}
}
