import Logo from "../logo/Logo.png";
import React, { useContext, useEffect } from "react";
import { useNavigate, useSearchParams } from "react-router-dom";
import { useState } from "react";
import { FetchAllContext } from "../App";

function Navbar() {
  const navigate = useNavigate();
  const [regione, setRegione] = useState("");
  const [citta, setCitta] = useState("");
  const [query, setQuery] = useSearchParams();
  const { fetchAll, setFetchAll } = useContext(FetchAllContext);

  useEffect(() => {
    setQuery({ citta: citta, regione: regione });
  }, [citta, regione]);

  const handleSubmit = (e) => {
    e.preventDefault();

    let tag = "http://localhost:8080/api/appartamento/all?";

    tag += query.toString();

    setFetchAll(tag);
  };

  const myStyle = {
    background: "rgb(62,101,145)",
    height: "3px",
    width: "100%",
    backgroundImage:
      "linear-gradient(90deg, rgba(62,101,145,1) 0%, rgba(44,133,235,1) 41%, rgba(97,240,255,1) 100%)",
  };

  return (
    <div className="fixed-top">
      <nav
        className="navbar navbar-expand-lg"
        style={{ padding: "0px", backgroundColor: "#171717" }}
      >
        <button
          style={{
            padding: 0,
            margin: 0,
            marginLeft: 16,
            border: "none",
            backgroundColor: "#171717",
          }}
          onClick={() => {
            navigate("/");
            setFetchAll("http://localhost:8080/api/appartamento/all?");
          }}
        >
          <img
            className="d-flex justify-content-start"
            src={Logo}
            alt=""
            style={{ height: "70px", borderRadius: "16px", padding: "0px" }}
          />
        </button>

        <div className="d-flex justify-content-center w-100">
          <form
            className="form-inline d-flex justify-content-center"
            onSubmit={handleSubmit}
          >
            <input
              value={citta}
              onChange={(e) => {
                setCitta(e.target.value);
                setRegione("");
              }}
              className="form-control mr-sm-2"
              type="search"
              placeholder="Cerca"
              aria-label="Search"
            />
            <button type="submit" className="btn bg-secondary text-white">
              Cerca
            </button>
            <div className="btn-group" style={{ marginLeft: "8px" }}>
              <button
                type="button"
                className="btn btn-secondary bg-light-subtle dropdown-toggle"
                data-bs-toggle="dropdown"
                aria-haspopup="true"
                aria-expanded="false"
              >
                Regione
              </button>
              <ul className="dropdown-menu">
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Abruzzo")}
                  >
                    Abruzzo
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Basilicata")}
                  >
                    Basilicata
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Calabria")}
                  >
                    Calabria
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Campania")}
                  >
                    Campania
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Emilia-Romagna")}
                  >
                    Emilia-Romagna
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Friuli Venezia Giulia")}
                  >
                    Friuli Venezia Giulia
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Lazio")}
                  >
                    Lazio
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Liguria")}
                  >
                    Liguria
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Lombardia")}
                  >
                    Lombardia
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Marche")}
                  >
                    Marche
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Molise")}
                  >
                    Molise
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Piemonte")}
                  >
                    Piemonte
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Puglia")}
                  >
                    Puglia
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Sardegna")}
                  >
                    Sardegna
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Basilicata")}
                  >
                    Sicilia
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Toscana")}
                  >
                    Toscana
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Trentino-Alto Adige")}
                  >
                    Trentino-Alto Adige
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Umbria")}
                  >
                    Umbria
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Valle D'Aosta")}
                  >
                    Valle D'Aosta
                  </button>
                </li>
                <li>
                  <button
                    className="dropdown-item"
                    onClick={() => setRegione("Veneto")}
                  >
                    Veneto
                  </button>
                </li>
              </ul>
            </div>
          </form>
        </div>
      </nav>
      <div style={myStyle}></div>
    </div>
  );
}

export default Navbar;
