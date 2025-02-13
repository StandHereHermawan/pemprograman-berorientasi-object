# ukuran VARCHAR(255) for sake simplicity.
CREATE TABLE fasilitasRuangan (
    identitasFasilitas          VARCHAR(255)    NOT NULL,
    identitasRuangan            VARCHAR(255)    NOT NULL,
    CONSTRAINT fk_fasilitasRuangan_ke_tabel_fasilitas
            FOREIGN KEY (identitasFasilitas) REFERENCES fasilitas (identitasFasilitas)
            ON DELETE NO ACTION ON NO ACTION,
    CONSTRAINT fk_fasilitasRuangan_ke_tabel_ruangan
            FOREIGN KEY (identitasRuangan) REFERENCES ruangan (identitasRuangan)
            ON DELETE NO ACTION ON UPDATE NO ACTION;
) ENGINE = InnoDB;
