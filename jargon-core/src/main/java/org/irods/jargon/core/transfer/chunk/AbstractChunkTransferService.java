/**
 * 
 */
package org.irods.jargon.core.transfer.chunk;

import org.irods.jargon.core.connection.IRODSAccount;
import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.core.service.AbstractJargonService;

/**
 * Abstract superclass for a chunk transfer service
 * @author Mike Conway - DICE
 *
 */
public abstract class AbstractChunkTransferService extends AbstractJargonService {
	
	/**
	 * Configuration for behavior of a chunk transfer
	 */
	private final ChunkTransferConfig chunkTransferConfig;

	/**
	 * @param irodsAccessObjectFactory
	 * @param irodsAccount
	 */
	public AbstractChunkTransferService(IRODSAccessObjectFactory irodsAccessObjectFactory, IRODSAccount irodsAccount, final ChunkTransferConfig chunkTransferConfig) {
		super(irodsAccessObjectFactory, irodsAccount);
		if (chunkTransferConfig == null) {
			throw new IllegalArgumentException("null chunkTransferConfig");
		}
		this.chunkTransferConfig = chunkTransferConfig;
	}

	

}
