CREATE DATABASE project_ujian_akhir_semester_pbo;

USE project_ujian_akhir_semester_pbo;

# tipeRuangan using VARCHAR for the sake of simplicity.
# ukuran VARCHAR(255) for sake simplicity.
# ukuran VARCHAR(36) for sake hemat space.
CREATE TABLE ruangan (
    identitasRuangan        VARCHAR(255)    NOT NULL    PRIMARY KEY,
    tipeRuangan             VARCHAR(255)     NOT NULL,
    ukuranPanjangRuangan    INT             NOT NULL,
    ukuranLebarRuangan      INT             NOT NULL,
) ENGINE = InnoDB;