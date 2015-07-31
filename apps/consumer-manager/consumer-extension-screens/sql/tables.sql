create table CM_Screens_Placeholder (
	uuid_ VARCHAR(75) null,
	placeholderId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	key_ VARCHAR(75) null,
	name STRING null,
	description STRING null,
	consumerId LONG
);