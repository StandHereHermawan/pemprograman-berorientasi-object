# ukuran VARCHAR(255) for sake simplicity.
CREATE TABLE fasilitas (
    identitasFasilitas          VARCHAR(255)    NOT NULL    PRIMARY KEY,
    namaFasilitas               VARCHAR(255)    NOT NULL,
    jumlahFasilitas             INT             UNSIGNED,
) ENGINE = InnoDB;
