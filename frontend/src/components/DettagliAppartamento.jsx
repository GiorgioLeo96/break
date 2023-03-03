import React, { useEffect, useState } from "react";
import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { useNavigate } from "react-router-dom";

const DettagliAppartamento = ({ dettagli }) => {
  const navigate = useNavigate();
  const [occupata, setOccupata] = useState(false);
  const [startDate, setStartDate] = useState(new Date());
  const [endDate, setEndDate] = useState(new Date());
  const [prezzoTotale, setPrezzoTotale] = useState(0);

  useEffect(() => {
    const diffInTime = endDate.getTime() - startDate.getTime();
    const diffInDays = Math.ceil(diffInTime / (1000 * 3600 * 24));

    const prezzo = dettagli.prezzo * diffInDays;
    setPrezzoTotale(prezzo);
  }, [dettagli.prezzo, endDate, startDate]);

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

  const handleStartDateChange = (date) => {
    if (date >= endDate) {
      const nextDay = new Date(date);
      nextDay.setDate(nextDay.getDate() + 1);
      setEndDate(nextDay);
    }
    setStartDate(date);
  };

  useEffect(() => {
    fetch(
      "http://localhost:8080/api/prenotazione/occupata/" +
        dettagli.id +
        "?checkin=" +
        startDate.toISOString().split("T")[0] +
        "&checkout=" +
        endDate.toISOString().split("T")[0]
    )
      .then((response) => response.json())
      .then((responseData) => setOccupata(responseData))
      .catch((error) => console.error(error));
  }, [startDate, endDate]);

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
            className="row flex-wrap d-flex justify-content-between"
            style={{
              marginTop: "50px",
              marginBottom: "50px",
            }}
          >
            <div className="col-xxl-6">
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
                <li>Situato in: {dettagli.regione} </li>
                <li>Città: {dettagli.citta} </li>
                <li>Letti: {dettagli.letto}</li>
                <li>Persone Ospitabili: {dettagli.ospitiStruttura}</li>
                <li>Bagni disponibili: {dettagli.bagni}</li>
                <li>Colazione: {colazione}</li>
                <li>Riscaldamento: {riscaldamento}</li>
              </ul>
            </div>
            <div
              className="col-xxl-4 col-lg-5 col-md-7 col-sm-11 "
              style={{ marginTop: "16px" }}
            >
              <div
                className="card"
                style={{
                  padding: "8px",
                  borderRadius: "30px",
                  boxShadow: "-4px 4px 4px 0px rgb(62,101,145)",
                  border: "none",
                }}
              >
                <div className="card-body ">
                  <div className="d-flex justify-content-center">
                    <div className="mr-auto">
                      <b style={{ fontSize: "20px" }}>
                        {dettagli.prezzo}€ Notte
                      </b>
                    </div>
                  </div>
                  <div className="d-flex mt-3 justify-content-center">
                    <div className="mr-3" style={{ marginRight: "2px" }}>
                      <b>CheckIn</b>
                      <DatePicker
                        selected={startDate}
                        onChange={handleStartDateChange}
                        startDate={startDate}
                        endDate={endDate}
                        placeholderText="Start date"
                        style={{
                          height: "350px",
                          objectFit: "cover",
                          padding: "8px",
                        }}
                      />
                    </div>
                    <div style={{ marginLeft: "4px" }}>
                      <b>CheckOut</b>

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
                    <div
                      className=""
                      style={{
                        textAlign: "center",
                        padding: 0,
                        marginRight: "8px",
                      }}
                    >
                      {occupata === true && (
                        <div
                          className=""
                          style={{
                            borderRadius: "12px",
                            height: "50px",
                            color: "rgb(190,0,0)",
                          }}
                        >
                          <b>Questa casa non è disponibile in queste date</b>
                          <br />
                        </div>
                      )}
                    </div>

                    <button
                      disabled={occupata}
                      className="bg-dark text-white btn"
                      onClick={() =>
                        navigate(
                          "/prenota?appartamento=" +
                            dettagli.id +
                            "&startdate=" +
                            startDate.toISOString().split("T")[0] +
                            "&enddate=" +
                            endDate.toISOString().split("T")[0]
                        )
                      }
                      style={{ borderRadius: "12px", height: "50px" }}
                    >
                      <b>Prenota!</b>
                    </button>
                  </div>
                </div>

                <div
                  className="d-flex justify-content-center card-body"
                  style={{ fontSize: "20px" }}
                >
                  <b
                    style={{
                      padding: "8px",
                    }}
                  >
                    Totale prezzo : {prezzoTotale}
                  </b>
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
