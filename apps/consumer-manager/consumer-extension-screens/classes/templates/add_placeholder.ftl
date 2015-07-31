<#assign aui = PortletJspTagLibs["/META-INF/aui.tld"] />
<#assign liferay_ui = PortletJspTagLibs["/META-INF/liferay-ui.tld"] />

<#setting number_format="computer">

<@aui["layout"]>
    <@aui["column"] columnWidth=30>
        <@aui["input"] name="placeholderKey" type="text" label="key">
            <@aui["validator"] name="required" />
        </@>

        <@aui["input"] name="placeholderName" type="text" label="name">
            <@aui["validator"] name="required" />
        </@>

        <@aui["input"] name="placeholderDescription" type="textarea" label="description" />
    </@>
    <@aui["column"] columnWidth=30>

    </@>
    <@aui["column"] columnWidth=40>
    </@>
</@>