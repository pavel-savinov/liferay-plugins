create index IX_571C019E on KBArticle (companyId, latest);
create index IX_5A381890 on KBArticle (companyId, main);
create index IX_FBC2D349 on KBArticle (companyId, status);
create index IX_694EA2E0 on KBArticle (groupId, latest);
create index IX_97C62252 on KBArticle (groupId, main);
create index IX_B0FCBB47 on KBArticle (groupId, parentResourcePrimKey, latest);
create index IX_D91D2879 on KBArticle (groupId, parentResourcePrimKey, main);
create index IX_55A38CF2 on KBArticle (groupId, parentResourcePrimKey, status);
create index IX_DF5748B on KBArticle (groupId, status);
create index IX_86BA3247 on KBArticle (parentResourcePrimKey, latest);
create index IX_1DCC5F79 on KBArticle (parentResourcePrimKey, main);
create index IX_2B6103F2 on KBArticle (parentResourcePrimKey, status);
create index IX_11CD0F56 on KBArticle (resourcePrimKey);
create index IX_A5A54614 on KBArticle (resourcePrimKey, groupId);
create index IX_5FEF5F4F on KBArticle (resourcePrimKey, groupId, latest);
create index IX_8EF92E81 on KBArticle (resourcePrimKey, groupId, main);
create index IX_49630FA on KBArticle (resourcePrimKey, groupId, status);
create index IX_A9E2C691 on KBArticle (resourcePrimKey, latest);
create index IX_69C17E43 on KBArticle (resourcePrimKey, main);
create index IX_4E89983C on KBArticle (resourcePrimKey, status);
create unique index IX_AA304772 on KBArticle (resourcePrimKey, version);
create index IX_C23FA26F on KBArticle (uuid_);
create unique index IX_5C941F1B on KBArticle (uuid_, groupId);

create index IX_9FE4C2A3 on KBComment (classNameId, classPK);
create index IX_20A6BD9C on KBComment (groupId);
create index IX_E8D43932 on KBComment (groupId, classNameId);
create unique index IX_FD56A55D on KBComment (userId, classNameId, classPK);
create index IX_8E470726 on KBComment (uuid_);
create unique index IX_791D1844 on KBComment (uuid_, groupId);

create index IX_362A7848 on KBStructure (groupId);
create index IX_C917CD2 on KBStructure (uuid_);
create unique index IX_201E4418 on KBStructure (uuid_, groupId);

create index IX_83D9CC13 on KBTemplate (groupId);
create index IX_9909475D on KBTemplate (uuid_);
create unique index IX_40AA25ED on KBTemplate (uuid_, groupId);