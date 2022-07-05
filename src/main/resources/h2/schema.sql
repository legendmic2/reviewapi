/* Review */
drop table if exists Review;
create table if not exists Review(
    type varchar(20) not null,
    action varchar(20) not null,
    reviewId VARCHAR(100) not null primary key,
    content varchar(200),
    userId varchar(100) not null,
    placeId varchar(100) not null
    );

/* Photo */
drop table if exists Photo;
create table if not exists Photo(
    reviewId VARCHAR(100),
    photoId VARCHAR(100) not null primary key,
    foreign key (reviewId)
    REFERENCES review(reviewId) on delete cascade
    );

/* review 1 - photo n */
/* photo는 review에 종속적이라고 생각해서, 따로 relationship table을 만들지 않았음 */