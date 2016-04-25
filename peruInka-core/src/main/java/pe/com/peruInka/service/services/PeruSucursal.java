package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.com.peruInka.service.util.Sucursal;

@Service("peruSucursal")
public class PeruSucursal {

public static List<Sucursal> suc = new ArrayList<Sucursal>();
	
	public void saveSucursal(Sucursal sucursal){
		suc.add(sucursal);
	}
	
	public List<Sucursal> findAllSucursal(){
		return suc;
	}
	
	public void updateSucursal(Sucursal sucursalUpdate){
		List<Sucursal> listTemp = new ArrayList<Sucursal>();
		
		for (Sucursal sucursal : suc) {
			if(sucursalUpdate.getId().compareTo(sucursal.getId())==0){
				listTemp.add(sucursalUpdate);
			}else{
				listTemp.add(sucursal);
			}
		}
		suc = new ArrayList<Sucursal>();
		suc.addAll(listTemp);

	}
	
	public Sucursal searchSucursal(Long id){
		Sucursal sucursalReturn = new Sucursal();
		for (Sucursal sucursal : suc) {
			if(id.compareTo(sucursal.getId())==0){
				sucursalReturn = sucursal;
				continue;
			}
		}
		return sucursalReturn;
	}
	
	public void deleteSucursal(Long id){
		List<Sucursal> listTemp = new ArrayList<Sucursal>();
		
		for (Sucursal sucursal : suc) {
			if(id.compareTo(sucursal.getId())!=0){
				listTemp.add(sucursal);
			}
		}
		suc = new ArrayList<Sucursal>();
		suc.addAll(listTemp);
	}
}