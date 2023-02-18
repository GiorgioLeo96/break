import React from "react";
import { Link } from "react-router-dom";
import { find } from "lodash";

const Appartamento = ({ dettagli }) => {
  const regex = /^.*esterno\.jpg$/m;
  const esterno = find(dettagli.immagini, function (o) {
    return o.immagine.match(regex);
  });

  return (
    <div className="col-sm-6 col-lg-3 mb-3">
      <div
        className="card"
        style={{ backgroundColor: "transparent", border: "none" }}
      >
        <img
          style={{ height: "350px", objectFit: "cover", borderRadius: "12px" }}
          src={"http://localhost:8080/" + esterno.immagine}
          className="card-img-top"
          alt="esterno"
        />
        <div className="card-body">
          <h4 className="card-title">
            {dettagli.regione}, {dettagli.citta}
          </h4>

          <p className="d-flex justify-content-between">
            Ospiti: {dettagli.ospitiStruttura} Bagni: {dettagli.bagni} letto:
            {dettagli.letto}
          </p>
          <p className="d-flex justify-content-between">
            Prezzo a Notte: {dettagli.prezzo}€
          </p>
          <div>
            <Link
              className="bg-dark text-white btn"
              to={"/dettagliappartamento/" + dettagli.id}
            >
              Dettagli!
            </Link>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Appartamento;
