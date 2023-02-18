import React, { useState } from "react";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { Link } from "react-router-dom";

const DettagliAppartamento = ({ dettagli }) => {
  const [startDate, setStartDate] = useState(new Date());
  const [endDate, setEndDate] = useState(new Date());
  let colazione = "";
  let riscaldamento = "";

  if (dettagli.colazione == 1) {
    colazione = "Si";
  } else {
    colazione = "No";
  }

  if (dettagli.riscaldamento == 1) {
    riscaldamento = "Si";
  } else {
    riscaldamento = "No";
  }

  return (
    <>
      <div className="container">
        <h1 className="text-center my-5">Appartamento in Affitto</h1>
        <div>
          <div className="row">
            {dettagli.immagini.map((immagine) => (
              <div
                style={{ padding: "0px" }}
                className="col-sm-4"
                key={immagine.id}
              >
                <img
                  style={{
                    height: "350px",
                    width: "450px",
                    objectFit: "cover",
                  }}
                  src={"http://localhost:8080/" + immagine.immagine}
                  className="img-thumbnail"
                  alt="..."
                />
              </div>
            ))}
          </div>
          <div
            className="row d-flex justify-content-between"
            style={{ marginTop: "50px", marginBottom: "50px" }}
          >
            <div className="col-md-6">
              <h3>Descrizione</h3>
              <p>
                Questo appartamento è situato in {dettagli.regione},per la
                precisione a {dettagli.citta} , una posizione strategica per i
                mezzi.
              </p>
              <p>
                Dispone di {dettagli.letto} letto/i, può ospitare{" "}
                {dettagli.ospitiStruttura} persona/e, {dettagli.bagni} bagni e
                una cucina completamente attrezzata al metodico e onesto prezzo
                di {dettagli.prezzo}€.
              </p>
              <h3>Caratteristiche</h3>
              <ul>
                <li>Situato in: {dettagli.regione}</li>
                <li>Città: {dettagli.citta}</li>
                <li>Letti: {dettagli.letto}</li>
                <li>Persone Ospitabili: {dettagli.ospitiStruttura}</li>
                <li>Bagni disponibili: {dettagli.bagni}</li>
                <li>Colazione: {colazione}</li>
                <li>Riscaldamento: {riscaldamento}</li>
              </ul>
            </div>
            <div className="col-md-4" style={{ marginTop: "16px" }}>
              <div
                className="card"
                style={{
                  padding: "65px",
                  borderRadius: "30px",
                  boxShadow: "-10px 10px 10px 0px rgb(80,80,80)",
                }}
              >
                <div className="card-body ">
                  <div className="d-flex  justify-content-center">
                    <div className="mr-auto">
                      <b style={{ fontSize: "20px" }}>{dettagli.prezzo}€</b>{" "}
                      Notte
                    </div>
                  </div>
                  <div className="d-flex mt-3 justify-content-center">
                    <div className="mr-3 ">
                      <DatePicker
                        selected={startDate}
                        onChange={(date) => setStartDate(date)}
                        startDate={startDate}
                        endDate={endDate}
                        placeholderText="Start date"
                        style={{
                          height: "350px",
                          objectFit: "cover",
                          borderRadius: "12px",
                        }}
                      />
                    </div>
                    <div>
                      <DatePicker
                        selected={endDate}
                        onChange={(date) => setEndDate(date)}
                        startDate={startDate}
                        endDate={endDate}
                        placeholderText="End date"
                      />
                    </div>
                  </div>
                  <div
                    className="d-flex justify-content-center"
                    style={{ marginTop: "80px" }}
                  >
                    <Link
                      className="bg-dark text-white btn"
                      to={
                        "/prenota?appartamento=" +
                        dettagli.id +
                        "&startdate=" +
                        startDate.toISOString().split("T")[0] +
                        "&enddate=" +
                        endDate.toISOString().split("T")[0]
                      }
                    >
                      Prenota!
                    </Link>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
};

export default DettagliAppartamento;
