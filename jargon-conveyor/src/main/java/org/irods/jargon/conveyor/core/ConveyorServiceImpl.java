package org.irods.jargon.conveyor.core;

import org.irods.jargon.core.pub.IRODSAccessObjectFactory;
import org.irods.jargon.core.transfer.TransferStatusCallbackListener;
import org.irods.jargon.transfer.exception.PassPhraseInvalidException;

/**
 * Abstract implementation of the <code>ConveyorService</code> interface.
 * 
 * @author Mike Conway - DICE (www.irods.org)
 * 
 */

public class ConveyorServiceImpl implements ConveyorService {

	/**
	 * required dependency
	 */
	private QueueManagerService queueMangerService;

	/**
	 * required dependency
	 */
	private FlowManagerService flowManagerService;

	/**
	 * required dependency
	 */
	private SynchronizationManagerService synchronizationManagerService;

	/**
	 * required dependency
	 */
	private GridAccountService gridAccountService;

	/**
	 * required dependency
	 */
	private ConveyorExecutorService conveyorExecutorService;

	/**
	 * required dependency on the {@link ConfigurationService} that manages
	 * name/value pairs that reflect service configuration
	 */
	private ConfigurationService configurationService;

	/**
	 * required dependency on the {@link IRODSAccessObjectFactory} that will
	 * allow connections to iRODS
	 */
	private IRODSAccessObjectFactory irodsAccessObjectFactory;

	private TransferStatusCallbackListener transferStatusCallbackListener = null;

	@Override
	public ConfigurationService getConfigurationService() {
		return configurationService;
	}

	@Override
	public void setConfigurationService(
			ConfigurationService configurationService) {
		this.configurationService = configurationService;
	}

	@Override
	public QueueManagerService getQueueMangerService() {
		return queueMangerService;
	}

	@Override
	public void setQueueMangerService(QueueManagerService queueMangerService) {
		this.queueMangerService = queueMangerService;
	}

	@Override
	public FlowManagerService getFlowManagerService() {
		return flowManagerService;
	}

	@Override
	public void setFlowManagerService(FlowManagerService flowManagerService) {
		this.flowManagerService = flowManagerService;
	}

	@Override
	public SynchronizationManagerService getSynchronizationManagerService() {
		return synchronizationManagerService;
	}

	@Override
	public void setSynchronizationManagerService(
			SynchronizationManagerService synchronizationManagerService) {
		this.synchronizationManagerService = synchronizationManagerService;
	}

	@Override
	public GridAccountService getGridAccountService() {
		return gridAccountService;
	}

	@Override
	public void setGridAccountService(GridAccountService gridAccountService) {
		this.gridAccountService = gridAccountService;
	}

	@Override
	public ConveyorExecutorService getConveyorExecutorService() {
		return conveyorExecutorService;
	}

	@Override
	public void setConveyorExecutorService(
			ConveyorExecutorService conveyorExecutorService) {
		this.conveyorExecutorService = conveyorExecutorService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.irods.jargon.conveyor.core.ConveyorService#shutdown()
	 */
	@Override
	public void shutdown() {
		if (conveyorExecutorService != null) {
			conveyorExecutorService.shutdown();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.irods.jargon.conveyor.core.ConveyorService#validatePassPhrase(java
	 * .lang.String)
	 */
	@Override
	public void validatePassPhrase(String passPhrase)
			throws PassPhraseInvalidException, ConveyorExecutionException {
		gridAccountService.validatePassPhrase(passPhrase);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.irods.jargon.conveyor.core.ConveyorService#resetConveyorService()
	 */
	@Override
	public void resetConveyorService() throws ConveyorExecutionException {
		gridAccountService.resetPassPhraseAndAccounts();

	}

	@Override
	public boolean isPreviousPassPhraseStored()
			throws ConveyorExecutionException {
		return gridAccountService.isPassPhraseStoredAlready();
	}

	/**
	 * @return the irodsAccessObjectFactory
	 */
	public IRODSAccessObjectFactory getIrodsAccessObjectFactory() {
		return irodsAccessObjectFactory;
	}

	/**
	 * @param irodsAccessObjectFactory
	 *            the irodsAccessObjectFactory to set
	 */
	@Override
	public void setIrodsAccessObjectFactory(
			IRODSAccessObjectFactory irodsAccessObjectFactory) {
		this.irodsAccessObjectFactory = irodsAccessObjectFactory;
	}

	/**
	 * @return the transferStatusCallbackListener
	 */
	public synchronized TransferStatusCallbackListener getTransferStatusCallbackListener() {
		return transferStatusCallbackListener;
	}

	/**
	 * @param transferStatusCallbackListener
	 *            the transferStatusCallbackListener to set
	 */
	public synchronized void setTransferStatusCallbackListener(
			TransferStatusCallbackListener transferStatusCallbackListener) {
		this.transferStatusCallbackListener = transferStatusCallbackListener;
	}

}
