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

        <@liferay_util["buffer"] var="placeholderMenu">
            <button class="placeholder-menu-dd-btn btn btn-default btn-group lfr-icon-menu dropdown-toggle" type="button">
                ${languageUtil.get(locale, "actions")}
                <span class="caret"></span>
            </button>
            <ul class="dropdown-menu">
                <li>
                    <@liferay_ui["icon"]
                        cssClass="edit-placeholder-btn placeholder-actions-menu-btn"
                        iconCssClass="icon-edit"
                        label=true
                        message="edit"
                    />
                </li>
                <li>
                    <@liferay_ui["icon"]
                        cssClass="remove-placeholder-btn placeholder-actions-menu-btn"
                        iconCssClass="icon-remove"
                        label=true
                        message="delete"
                    />
                </li>
            </ul>
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
                    <div class="placeholder-actions-menu-div dropdown" data-rowId="${placeholder.getKey()}">
                        <button class="placeholder-menu-dd-btn btn btn-default btn-group lfr-icon-menu dropdown-toggle" type="button">
                            ${languageUtil.get(locale, "actions")}
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li>
                                <@liferay_ui["icon"]
                                    cssClass="edit-placeholder-btn placeholder-actions-menu-btn"
                                    iconCssClass="icon-edit"
                                    label=true
                                    message="edit"
                                />
                            </li>
                            <li>
                                <@liferay_ui["icon"]
                                    cssClass="remove-placeholder-btn placeholder-actions-menu-btn"
                                    iconCssClass="icon-remove"
                                    label=true
                                    message="delete"
                                />
                            </li>
                        </ul>
                    </div>
                </@>
            </@>

            <@liferay_ui["search-iterator"] paginate=false />
        </@>
    </@>
</div>

<div id="<@portlet["namespace"]/>placeholderAddDialog"></div>

<@aui["script"] use="aui-base,aui-dropdown,escape,liferay-search-container">

    var PLACEHOLDER_ADD_TPL = '${unicodeFormatter.toString(placeholderTemplate)}';

    var <@portlet["namespace"]/>addPlaceholder = function(){
        var placeholderKey = A.one('#<@portlet["namespace"]/>placeholderKey').get('value');
        var placeholderName= A.one('#<@portlet["namespace"]/>placeholderName').get('value');
        var placeholderDescription = A.one('#<@portlet["namespace"]/>placeholderDescription').get('value');

        var searchContainerName = '<@portlet["namespace"]/>placeholdersSearchContainer';

        var searchContainer = Liferay.SearchContainer.get(searchContainerName);

        var entryLink = '<div class="placeholder-actions-menu-div dropdown" data-rowId="' + A.Escape.html(placeholderKey) + '">${unicodeFormatter.toString(placeholderMenu)}</div>';

        searchContainer.addRow([A.Escape.html(placeholderKey), A.Escape.html(placeholderName), entryLink], A.Escape.html(placeholderKey));

        var menu = A.one('div[data-rowId="' + placeholderKey +'"]');
        var menuId = '<@portlet["namespace"]/>' + placeholderKey + '_menu';
        menu.set('id', menuId);

        var menuBtn = menu.one('button.placeholder-menu-dd-btn');
        var menuBtnId = '<@portlet["namespace"]/>' + placeholderKey + '_menuBtn';
        menuBtn.set('id', menuBtnId);

        new A.Dropdown(
            {
                boundingBox: '#' + menuId,
                trigger: '#' + menuBtnId
            }
        ).render();

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
			var button = event.currentTarget;

            var menu = button.ancestor('.placeholder-actions-menu-div');

            if (!menu) {
                return;
            }

            var rowId = menu.getAttribute('data-rowId');

			var tr = menu.ancestor('tr');

            if (!rowId) {
                return;
            }

            if (button.hasClass('remove-placeholder-btn')) {
                console.log('delete '+rowId);
                searchContainer.deleteRow(tr, menu.getAttribute('data-rowId'));
                <@portlet["namespace"]/>deletePlaceholderJson();
            }
            else if (button.hasClass('edit-placeholder-btn')){
                console.log('edit btn pressed '+rowId);
            }

		},
		'.placeholder-actions-menu-btn'
	);
</@>
