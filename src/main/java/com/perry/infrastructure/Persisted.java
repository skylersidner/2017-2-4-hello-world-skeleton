package com.perry.infrastructure;

import java.time.LocalDateTime;

public class Persisted {

	private long insertTime;

	private long updateTime;

	private long insertBy;

	private long updateBy;

	public long getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(long insertTime) {
		this.insertTime = insertTime;
	}

	public long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
	}

	public long getInsertBy() {
		return insertBy;
	}

	public void setInsertBy(long insertBy) {
		this.insertBy = insertBy;
	}

	public long getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(long updateBy) {
		this.updateBy = updateBy;
	}

}
