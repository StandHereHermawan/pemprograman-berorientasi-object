# ukuran VARCHAR(255) for sake simplicity.
CREATE TABLE mahasiswa (
    nomorIndukMahasiswa             VARCHAR(255)    NOT NULL    PRIMARY KEY,
    namaLengkapMahasiswa            VARCHAR(255)    NOT NULL,
    identitasKelasMahasiswa         VARCHAR(255)    NOT NULL,
    angkatanKelasMahasiswa          INT             UNSIGNED    NOT NULL,
    posisiJabatanMahasiswa          VARCHAR(255)    NOT NULL,
) ENGINE = InnoDB;
