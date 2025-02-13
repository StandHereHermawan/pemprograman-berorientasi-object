CREATE TABLE todolists (
    id          INT UNSIGNED    NOT NULL    AUTO_INCREMENT,
    todo        TEXT            NOT NULL,
    created_at  TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP       NOT NULL    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    is_deleted  BOOLEAN         NOT NULL    DEFAULT FALSE,
    PRIMARY KEY (id)
) ENGINE = InnoDB;

DESC todolists;