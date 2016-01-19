/**
 * 
 */
package org.irods.jargon.core.transfer.chunk;

import org.irods.jargon.core.checksum.IrodsChecksumValue;

/**
 * Describes a segment of a chunk transfer and its status
 * @author Mike Conway - DICE
 *
 */
public class ChunkTransferSegmentDescriptor {
	
	/**
	 * describes the status of the transfer for this segment
	 */
	public enum SegmentStatus {OPEN, COMPLETE, IN_PROCESS, ERROR}
	
	/**
	 * Name of the file representing this segment
	 */
	private String transferSegmentName = "";
	
	/**
	 * Length of the entire segment as computed in the mapping
	 */
	private long segmentLength = 0;
	
	/**
	 * Actual length of the segement as transferred
	 */
	private long segmentCompletedLength = 0;
	
	/**
	 * Status of the transfer for this segment
	 */
	private SegmentStatus segmentStatus;
	
	/**
	 * Checksum (optional) of this segment
	 */
	private IrodsChecksumValue segmentChecksumValue;
	
	public String getTransferSegmentName() {
		return transferSegmentName;
	}
	public void setTransferSegmentName(String transferSegmentName) {
		this.transferSegmentName = transferSegmentName;
	}
	public long getSegmentLength() {
		return segmentLength;
	}
	public void setSegmentLength(long segmentLength) {
		this.segmentLength = segmentLength;
	}
	public long getSegmentCompletedLength() {
		return segmentCompletedLength;
	}
	public void setSegmentCompletedLength(long segmentCompletedLength) {
		this.segmentCompletedLength = segmentCompletedLength;
	}
	public SegmentStatus getSegmentStatus() {
		return segmentStatus;
	}
	public void setSegmentStatus(SegmentStatus segmentStatus) {
		this.segmentStatus = segmentStatus;
	}
	public IrodsChecksumValue getSegmentChecksumValue() {
		return segmentChecksumValue;
	}
	public void setSegmentChecksumValue(IrodsChecksumValue segmentChecksumValue) {
		this.segmentChecksumValue = segmentChecksumValue;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChunkTransferSegmentDescriptor [");
		if (transferSegmentName != null)
			builder.append("transferSegmentName=").append(transferSegmentName).append(", ");
		builder.append("segmentLength=").append(segmentLength).append(", segmentCompletedLength=")
				.append(segmentCompletedLength).append(", ");
		if (segmentStatus != null)
			builder.append("segmentStatus=").append(segmentStatus).append(", ");
		if (segmentChecksumValue != null)
			builder.append("segmentChecksumValue=").append(segmentChecksumValue);
		builder.append("]");
		return builder.toString();
	}
	

}
