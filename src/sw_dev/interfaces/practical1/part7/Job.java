package sw_dev.interfaces.practical1.part7;

public class Job {

	private String jobDescription;
	private double rate;
	private double time;

	public Job(String jobDescription, double rate, double time) {
		this.jobDescription = jobDescription;
		this.rate = rate;
		this.time = time;
	}

	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @return the time
	 */
	public double getTime() {
		return time;
	}
	
	public double getPrice()
	{
		return rate*time;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Job [jobDescription=" + jobDescription + ", rate=" + rate
				+ ", time=" + time + "]";
	}

}
