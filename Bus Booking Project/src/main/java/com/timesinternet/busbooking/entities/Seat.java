package com.timesinternet.busbooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Seat {

	@Id
	@Column(length = 5)
	private String busId;
	private Long totalSeat;

	public Seat() {

	}

	public Seat(String busId, Long totalSeat) {
		super();
		this.busId = busId;
		this.totalSeat = totalSeat;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public Long getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(Long totalSeat) {
		this.totalSeat = totalSeat;
	}

}
