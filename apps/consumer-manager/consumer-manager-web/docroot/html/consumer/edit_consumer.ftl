<#--
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
-->

<#include "../init.ftl" />
<#include "../macros_exceptions.ftl" />

<@liferay_ui["header"]
	backURL="${redirect}"
	title='${(consumer.getName(locale))!"new-consumer"}'
/>

<@portlet["actionURL"] name="updateConsumer" var="addConsumerURL" />

<@aui["form"] action="${addConsumerURL}" method="post" name="fm" onSubmit="event.preventDefault(); saveFields();">
	<@aui["input"] name="redirect" type="hidden" value="${redirect}" />
	<@aui["input"] name="consumerId" type="hidden" value=consumerId />
    <@aui["input"] name="consumerExtensions" type="hidden" />

	<@aui["model-context"] bean=consumer model=consumerClass />

	<@invalidNameException />

    <@aui["input"] name="consumerKey" />

    <@aui["input"] name="name" />

	<@aui["input"] name="description" />

	<@liferay_ui["panel"] cssClass="consumer-extensions-panel" collapsible=true defaultState="open" extended=false id="consumerExtentionsPanel" helpMessage="consumer-extensions-help" persistState=true title="consumer-extensions">
		<div class="component diagram-builder form-builder liferayctformbuilder yui3-widget" id="formBuilderBB">
			<div class="diagram-builder-content form-builder-content" id="formBuilderCB">
				<div class="tabbable">
					<div class="tabbable-content">
						<ul class="nav nav-tabs">
							<li class="active"><a href="javascript:;">Add node</a></li>
							<li><a href="javascript:;">Settings</a></li>
						</ul>

						<div class="tab-content">
							<div class="tab-pane">
								<div class="hide panel-page-menu" id="formBuilderSB">
									<div class="search-panels">
										<i class="icon-search"></i>

										<div class="search-panels-bar">
											<@aui["input"] cssClass="search-panels-input search-query" label="" name="searchPanel" type="text" />
										</div>
									</div>
								</div>

								<ul class="clearfix diagram-builder-fields-container form-builder-fields-container">
									<#list consumerExtensionTemplates as template>
										<#assign consumerExtension = template.getConsumerExtension()>
										<#assign templateKey = template.getTemplateKey()>

										<li class="diagram-builder-field form-builder-field hide" data-icon="${consumerExtension.getIcon()}" data-key="${templateKey}" data-template="${template.getTemplate()}" data-unique="true">
											<span class="diagram-builder-field-icon icon ${consumerExtension.getIcon()}"></span>
											<div class="diagram-builder-field-label">
												<div class="row">
													<div class="field-title">${consumerExtension.getName(locale)}</div>
													<div class="field-description">${consumerExtension.getDescription(locale)}</div>
													<div class="field-short-description">${consumerExtension.getShortDescription(locale)}</div>
												</div>
											</div>
										</li>
									</#list>
								</ul>
							</div>

							<div class="tab-pane"></div>
						</div>
					</div>
				</div>

				<div class="diagram-builder-content-container form-builder-content-container">
					<#assign cssHasItemsClass = "">

					<#if (addedConsumerExtensionTemplates?size > 0)>
						<#assign cssHasItemsClass = "has-items">
					</#if>

					<div class="diagram-builder-canvas form-builder-canvas ${cssHasItemsClass}">
						<div class="alert alert-info alert-no-items">
							<@liferay_ui["message"] key="drag-consumer-extensions-to-define-behaviour" />
						</div>

						<div class="diagram-builder-drop-container form-builder-drop-container">
							<#list addedConsumerExtensionTemplates as template>
								<#assign consumerExtension = template.getConsumerExtension()>
								<#assign templateKey = template.getTemplateKey()>

								<div class="component form-builder-field hide widget yui3-widget" data-icon="${consumerExtension.getIcon()}" data-key="${templateKey}" data-template="${template.getTemplate()}" data-unique="true">
									<div>
										<div>
											<div class="field-header">
												<div class="field-icon"><i class="${consumerExtension.getIcon()}"></i></div>
												<div class="field-info row">
													<div class="field-title">${consumerExtension.getName(locale)}</div>
													<div class="field-description">${consumerExtension.getDescription(locale)}</div>
													<div class="field-short-description">${consumerExtension.getShortDescription(locale)}</div>
												</div>
											</div>
											<div class="field-editor">
											</div>
										</div>
									</div>
								</div>
							</#list>
						</div>
					</div>
				</div>

			</div>
		</div>
	</@>

	<@aui["button-row"]>
		<@aui["button"] type="submit" />
	</@>
</@>

<@aui["script"] use="liferay-ct-form-builder">
	var extensionsBuilder = new A.LiferayCTFormBuilder(
		{
			boundingBox: '#formBuilderBB',
			contentBox: '#formBuilderCB',
			searchBox: '#formBuilderSB'
		}
	).render();

	saveFields = function() {
		document.<@portlet["namespace"] />fm.<@portlet["namespace"] />consumerExtensions.value = extensionsBuilder.exportAsJSON();

		submitForm(document.<@portlet["namespace"] />fm);
	};
</@>