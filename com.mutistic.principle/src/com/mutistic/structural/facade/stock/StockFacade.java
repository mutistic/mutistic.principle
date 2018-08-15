package com.mutistic.structural.facade.stock;

public class StockFacade {

	private StockA sa;
	private StockB sb;
	private StockC sc;
	private Fund fund;
	private Nationaldebt nd;
	
	public StockFacade() {
		sa = new StockA();
		sb = new StockB();
		sc = new StockC();
		fund = new Fund();
		nd = new Nationaldebt();
	}
	
	public void buy() {
		sa.buy();
		sb.buy();
		sc.buy();
		fund.buy();
		nd.buy();
	}
	
	public void seller() {
		sa.seller();
		sb.seller();
		sc.seller();
		fund.seller();
		nd.seller();
	}
	
}
