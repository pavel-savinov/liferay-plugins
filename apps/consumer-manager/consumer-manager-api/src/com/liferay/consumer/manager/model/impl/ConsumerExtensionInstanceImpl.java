package com.liferay.consumer.manager.model.impl;

import java.util.Map;

/**
 * The extended model implementation for the ConsumerExtensionInstance service. Represents a row in the &quot;CM_ConsumerExtensionInstance&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.consumer.manager.model.ConsumerExtensionInstance} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class ConsumerExtensionInstanceImpl
    extends ConsumerExtensionInstanceBaseImpl {

    public ConsumerExtensionInstanceImpl() {
    }

    public String getConsumerExtensionGuid() {
        return _consumerExtensionGuid;
    }

    public Map<String, String> getValues() {
        return _values;
    }

    public void setConsumerExtensionGuid(String consumerExtensionGuid) {
        _consumerExtensionGuid = consumerExtensionGuid;
    }

    public void setValues(Map<String, String> values) {
        this._values = values;
    }

    private String _consumerExtensionGuid;
    private Map<String, String> _values;
    
}
