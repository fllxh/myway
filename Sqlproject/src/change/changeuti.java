package change;

import Login.logingui;
import Vip.VIPgui;
import Vip.viputil;
import buy.BuyGui2;
import buy.Buysearch;
import buy1.payway;
import buy1.test1;
import changegui.maingui;
import db.DBUtil;

public class changeuti {
	test1 t1=new test1();
	payway p=new payway();
	VIPgui s1=new VIPgui();
	viputil v=new viputil();
	DBUtil db1=new DBUtil();
	BuyGui2 bb2=new BuyGui2();
	Buysearch bs=new Buysearch();

	logingui lg=new logingui();
	public void changevip() {
	s1.v1(null);	
	}
	public void changebuy() {
		t1.t1(null);	
		}
	public void tuihuo() {
		bs.t1(null);	
		}
	public void xiaopiao() {
		bb2.b1(null);	
		}
	public void denglu() {
		lg.l1(null);	
		}
	
}
