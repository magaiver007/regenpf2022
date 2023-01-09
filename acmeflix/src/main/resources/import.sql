insert into ACCOUNTS (ID,  EMAIL, PASSWORD, PAYMENTMETHOD,SUBSCRIPTIONPLAN) values (1, 'zksinidou@athtech.gr', 1234, 'CREDIT_CARD', 'ADVANCED');
insert into ACCOUNTS (ID,  EMAIL, PASSWORD, PAYMENTMETHOD,SUBSCRIPTIONPLAN) values (2, 'nbousis@athtech.gr', 5678, 'CRYPTO', 'BASIC');
insert into ACCOUNTS (ID,  EMAIL, PASSWORD, PAYMENTMETHOD,SUBSCRIPTIONPLAN) values (3, 'dkarampinas@athtech.gr', 3443, 'GIFT_CARD', 'BASIC');
insert into ACCOUNTS (ID,  EMAIL, PASSWORD, PAYMENTMETHOD,SUBSCRIPTIONPLAN) values (4, 'sountrakis@athtech.gr', 6554, 'PAYPAL', 'STARTER');

insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (1,FALSE,'ZOE',1);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (2,FALSE,'ZOE2',1);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (3,FALSE,'ZOE3',1);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (4,TRUE,'ZOE4',1);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (11,FALSE,'NIKOS',2);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (12,FALSE,'NIKOS2',2);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (13,TRUE,'NIKOS3',2);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (21,FALSE,'DIMOS',3);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (22,FALSE,'DIMOS2',3);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (23,TRUE,'DIMOS3',3);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (31,FALSE,'STEF',4);
insert into PROFILES (ID, IS_KID, USERNAME,ACCOUNT_ID) values (32,FALSE,'STEF2',4);


insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (1,71,'Liam','Neeson');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (2,61,'Ralph','Fiennes');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (3,80,'Ben','Kingsley');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (4,77,'Henry','Fonda');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (5,65,'Lee J.','Cobb');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (6,77,'Martin','Balsam');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (7,83,'Al','Pacino');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (8,80,'Robert','De Niro');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (9,92,'Robert','Duvall');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (10,49,'Christian','Bale');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (11,29,'Heath','Ledger');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (12,55,'Aaron','Eckhart');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (13,80,'Marlon','Brando');
insert into CREW_MEMBERS (ID, AGE, FIRSTNAME,LASTNAME) values (14,82,'James','Caan');


insert into MOVIES (ID, CATEGORY, DESCRIPTION,DURATION, TITLE,YEAROFRELEASE) values (1,'CRIME','The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.',2.55,'The Godfather',1972);
insert into MOVIES (ID, CATEGORY, DESCRIPTION,DURATION, TITLE,YEAROFRELEASE) values (2,'ACTION','When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.',2.32,'The Dark Knight',2008);
insert into MOVIES (ID, CATEGORY, DESCRIPTION,DURATION, TITLE,YEAROFRELEASE) values (3,'CRIME','The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate..',3.22,'The Godfather Part II',1974);
insert into MOVIES (ID, CATEGORY, DESCRIPTION,DURATION, TITLE,YEAROFRELEASE) values (4,'DRAMA','The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.',1.36,'12 ANGRY MEN',1957);
insert into MOVIES (ID, CATEGORY, DESCRIPTION,DURATION, TITLE,YEAROFRELEASE) values (5,'DRAMA','In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.',3.15,'Schindlers List',1993);

insert into SERIES (ID, TITLE, CATEGORY,DESCRIPTION,DURATION, YEAROFRELEASE,YEAROFENDING,SEASONS,NUMBER_OF_EPISODES) values (1,'BREAKING BAD','CRIME','A chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine with a former student in order to secure his family''s future.',0.49,2008,2013,5,62);



insert into RATINGS (ID, RATING,MOVIE_ID) values (1, 8, 1);
insert into RATINGS (ID, RATING,MOVIE_ID) values (2, 9, 1);
insert into RATINGS (ID, RATING,MOVIE_ID) values (3, 9, 1);
insert into RATINGS (ID, RATING,MOVIE_ID) values (4, 7, 1);
insert into RATINGS (ID, RATING,MOVIE_ID) values (5, 10, 1);
insert into RATINGS (ID, RATING,MOVIE_ID) values (6, 9, 2);
insert into RATINGS (ID, RATING,MOVIE_ID) values (7, 8, 2);
insert into RATINGS (ID, RATING,MOVIE_ID) values (8, 7, 2);
insert into RATINGS (ID, RATING,MOVIE_ID) values (9, 8, 2);
insert into RATINGS (ID, RATING,MOVIE_ID) values (10, 9, 2);
insert into RATINGS (ID, RATING,MOVIE_ID) values (11, 9, 3);
insert into RATINGS (ID, RATING,MOVIE_ID) values (12, 8, 3);
insert into RATINGS (ID, RATING,MOVIE_ID) values (13, 8, 3);
insert into RATINGS (ID, RATING,MOVIE_ID) values (14, 9, 3);
insert into RATINGS (ID, RATING,MOVIE_ID) values (15, 6, 3);
insert into RATINGS (ID, RATING,MOVIE_ID) values (16, 10, 4);
insert into RATINGS (ID, RATING,MOVIE_ID) values (17, 9, 4);
insert into RATINGS (ID, RATING,MOVIE_ID) values (18, 8, 4);
insert into RATINGS (ID, RATING,MOVIE_ID) values (19, 8, 4);
insert into RATINGS (ID, RATING,MOVIE_ID) values (20, 7, 4);
insert into RATINGS (ID, RATING,MOVIE_ID) values (21, 10, 5);
insert into RATINGS (ID, RATING,MOVIE_ID) values (22, 9, 5);
insert into RATINGS (ID, RATING,MOVIE_ID) values (23, 8, 5);
insert into RATINGS (ID, RATING,MOVIE_ID) values (24, 9, 5);
insert into RATINGS (ID, RATING,MOVIE_ID) values (25, 9, 5);
insert into RATINGS (ID, RATING,SERIES_ID) values (26, 9, 1);
insert into RATINGS (ID, RATING,SERIES_ID) values (27, 8, 1);
insert into RATINGS (ID, RATING,SERIES_ID) values (28, 10, 1);
insert into RATINGS (ID, RATING,SERIES_ID) values (29, 9, 1);
insert into RATINGS (ID, RATING,SERIES_ID) values (30, 8, 1);

insert into VIEWS  (ID, DURATION,MOVIE_ID) values (1, 2.55, 1);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (2, 2.50, 1);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (3, 2.40, 1);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (4, 1.40, 1);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (5, 2.55, 1);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (6, 2.30, 2);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (7, 2.20, 2);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (8, 1.30, 2);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (9, 2.30, 2);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (10, 2.32, 2);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (11, 3.20, 3);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (12, 3.20, 3);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (13, 3.20, 3);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (14, 3.20, 3);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (15, 1.12, 3);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (16, 1.36, 4);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (17, 1.30, 4);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (18, 1.30, 4);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (19, 1.30, 4);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (20, 1.30, 4);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (21, 3.10, 5);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (22, 3.15, 5);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (23, 3.08, 5);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (24, 3.12, 5);
insert into VIEWS  (ID, DURATION,MOVIE_ID) values (25, 3.13, 5);

