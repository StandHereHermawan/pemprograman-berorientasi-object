# ukuran VARCHAR(255) for sake simplicity.
CREATE TABLE penanggung_jawab_kelas (
    nomorIndukPegawai               VARCHAR(255)    NOT NULL    PRIMARY KEY,
    namaLengkapPegawai              VARCHAR(255)    NOT NULL,
    angkatanMasukKerjaPegawai       INT             UNSIGNED    NOT NULL,
    posisiJabatanPegawai            VARCHAR(255)    NOT NULL,
) ENGINE = InnoDB;
