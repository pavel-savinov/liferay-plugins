<#assign aui = PortletJspTagLibs["/META-INF/aui.tld"] />
<#assign liferay_ui = PortletJspTagLibs["/META-INF/liferay-ui.tld"] />
<#assign liferay_util = PortletJspTagLibs["/META-INF/liferay-util.tld"] />
<#assign portlet = PortletJspTagLibs["/META-INF/liferay-portlet.tld"] />

<#setting number_format="computer">

<div class="alert alert-info">
    <@liferay_ui["message"] key="please-define-placeholders-for-screens-extension" />
</div>

<div>
    <@aui["input"] name="placeholdersJson" type="hidden" value=placeholdersJson />

    <@liferay_ui["panel"] cssClass="screens-extension-panel" defaultState="open" extended=false id="screensExtensionPanel" helpMessage="placeholders-help" persistState=true title="placeholders">

        <@liferay_util["buffer"] var="addLinkIcon">
            <@liferay_ui["icon"]
                cssClass="btn add-placeholder-btn"
                iconCssClass="icon-plus"
                label=true
                message="add"
            />
        </@>

        <a class="add-placeholder-link" href="javascript:;">
            ${addLinkIcon}
        </a>

        <@liferay_util["buffer"] var="removeLinkIcon">
            <@liferay_ui["icon"]
                cssClass="btn remove-placeholder-btn"
                iconCssClass="icon-remove"
                label=true
                message="remove"
            />
        </@>

        <@liferay_ui["search-container"]
            headerNames="key,name,null">

            <@liferay_ui["search-container-results"]
                results=screensConsumerExtensionDisplayContext.getResults(consumerId)
                total=screensConsumerExtensionDisplayContext.getTotal(consumerId)
            />

            <@liferay_ui["search-container-row"]
                className="com.liferay.consumer.manager.extension.screens.model.Placeholder"
                keyProperty="key"
                modelVar="placeholder"
            >

                <@liferay_ui["search-container-column-text"]
                    name="key"
                    value=placeholder.getKey()
                />

                <@liferay_ui["search-container-column-text"]
                    name="name"
                    value=placeholder.getName(locale)
                />

                <@liferay_ui["search-container-column-text"]>
                    <a class="remove-placeholder-link" data-rowId="${placeholder.getKey()}" href="javascript:;">
                        ${removeLinkIcon}
                    </a>
                </@>
            </@>

            <@liferay_ui["search-iterator"] paginate=false />
        </@>
    </@>
</div>

<div id="<@portlet["namespace"]/>placeholderAddDialog"></div>

<@aui["script"] use="aui-base,escape,liferay-search-container">

    var PLACEHOLDER_ADD_TPL = '${unicodeFormatter.toString(placeholderTemplate)}';

    var <@portlet["namespace"]/>addPlaceholder = function(){
        var placeholderKey = A.one('#<@portlet["namespace"]/>placeholderKey').get('value');
        var placeholderName= A.one('#<@portlet["namespace"]/>placeholderName').get('value');
        var placeholderDescription = A.one('#<@portlet["namespace"]/>placeholderDescription').get('value');

        var searchContainerName = '<@portlet["namespace"]/>placeholdersSearchContainer';

        var searchContainer = Liferay.SearchContainer.get(searchContainerName);

        var entryLink = '<a class="remove-placeholder-link" data-rowId="' + A.Escape.html(placeholderKey) + '" href="javascript:;">${unicodeFormatter.toString(removeLinkIcon)}</a>';

        searchContainer.addRow([A.Escape.html(placeholderKey), A.Escape.html(placeholderName), entryLink], A.Escape.html(placeholderKey));

        <@portlet["namespace"]/>addPlaceholderJson(placeholderKey, placeholderName, placeholderDescription);
    };

    var <@portlet["namespace"]/>addPlaceholderJson = function(key, name, desc) {
        var placeholdersJson = A.one('#<@portlet["namespace"]/>placeholdersJson').get('value');

        var jsonArray = (placeholdersJson !== '') ? JSON.parse(placeholdersJson) : [];

        jsonArray[jsonArray.length] = {'key':key, 'nameCurrentValue':name, 'descriptionCurrentValue':desc};

        A.one('#<@portlet["namespace"]/>placeholdersJson').set('value', JSON.stringify(jsonArray));
    };

    A.one('.add-placeholder-link').on(
        'click',
		function(event) {
			event.preventDefault();

            Liferay.Util.openWindow(
                {
                    dialog: {
                        constrain: true,
                        cssClass: 'add-placeholder-modal-dialog',
                        modal: true,
                        bodyContent: PLACEHOLDER_ADD_TPL
                    },
                    title: '${languageUtil.get(locale, "new-placeholder")}'
                },
                function(dialog) {
                    dialog.addToolbar(
                        [
                            {
                                cssClass: 'btn-primary',
                                label: '${languageUtil.get(locale, "ok")}',
                                on: {
                                    click: function() {
                                        <@portlet["namespace"]/>addPlaceholder();
                                        dialog.hide();
                                    }
                                }
                            },
                            {
                                label: '${languageUtil.get(locale, "cancel")}',
                                on: {
                                    click: function() {
                                        dialog.hide();
                                    }
                                }
                            }
                        ]
                    );
                }
            );
		}
	);
</@>

<@aui["script"] use="liferay-search-container">

    var <@portlet["namespace"]/>deletePlaceholderJson = function(key) {
        var placeholdersJson = A.one('#<@portlet["namespace"]/>placeholdersJson').get('value');

        var jsonArray = (placeholdersJson !== '') ? JSON.parse(placeholdersJson) : [];

        if (jsonArray.length > 0) {
            for (var idx in jsonArray) {
                var jsonObj = jsonArray[idx];

                if (jsonObj.key === key) {
                    delete jsonArray[idx];

                    break;
                }
            }
        }

        if (jsonArray.length > 0) {
            A.one('#<@portlet["namespace"]/>placeholdersJson').set('value', JSON.stringify(jsonArray));
        }
        else {
            A.one('#<@portlet["namespace"]/>placeholdersJson').set('value', '');
        }
    };

	var searchContainer = Liferay.SearchContainer.get('<@portlet["namespace"]/>placeholdersSearchContainer');

	searchContainer.get('contentBox').delegate(
		'click',
		function(event) {
			var link = event.currentTarget;

			var tr = link.ancestor('tr');

			searchContainer.deleteRow(tr, link.getAttribute('data-rowId'));

            <@portlet["namespace"]/>deletePlaceholderJson(link.getAttribute('data-rowId'));
		},
		'.remove-placeholder-link'
	);
</@>
