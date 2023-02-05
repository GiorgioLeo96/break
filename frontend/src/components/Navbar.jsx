function Navbar() {
  return (
    <>
      <div className="fixed-top">
        <nav className="navbar navbar-expand-lg navbar-primary bg-primary d-flex justify-content-center">
          <form className="form-inline my-2 my-lg-0">
            <input
              className="form-control mr-sm-2"
              type="search"
              placeholder="Cerca"
              aria-label="Search"
            />
            <div className="btn-group">
              <button
                type="button"
                className="btn btn-secondary dropdown-toggle"
                data-toggle="dropdown"
                aria-haspopup="true"
                aria-expanded="false"
              >
                Regione
              </button>
              <div className="dropdown-menu">
                <a className="dropdown-item" href="#">
                  Abruzzo
                </a>
                <a className="dropdown-item" href="#">
                  Basilicata
                </a>
                <a className="dropdown-item" href="#">
                  Calabria
                </a>
                <a className="dropdown-item" href="#">
                  Campania
                </a>
                <a className="dropdown-item" href="#">
                  Emilia-Romagna
                </a>
                <a className="dropdown-item" href="#">
                  Friuli Venezia Giulia
                </a>
                <a className="dropdown-item" href="#">
                  Lazio
                </a>
                <a className="dropdown-item" href="#">
                  Liguria
                </a>
                <a className="dropdown-item" href="#">
                  Lombardia
                </a>
                <a className="dropdown-item" href="#">
                  Marche
                </a>
                <a className="dropdown-item" href="#">
                  Molise
                </a>
                <a className="dropdown-item" href="#">
                  Piemonte
                </a>
                <a className="dropdown-item" href="#">
                  Puglia
                </a>
                <a className="dropdown-item" href="#">
                  Sardegna
                </a>
                <a className="dropdown-item" href="#">
                  Sicilia
                </a>
                <a className="dropdown-item" href="#">
                  Toscana
                </a>
                <a className="dropdown-item" href="#">
                  Trentino-Alto Adige
                </a>
                <a className="dropdown-item" href="#">
                  Umbria
                </a>
                <a className="dropdown-item" href="#">
                  Valle D'Aosta
                </a>
                <a className="dropdown-item" href="#">
                  Veneto
                </a>
              </div>
            </div>
            <div className="btn-group">
              <button
                type="button"
                className="btn btn-secondary dropdown-toggle"
                data-toggle="dropdown"
                aria-haspopup="true"
                aria-expanded="false"
              >
                Capoluogo
              </button>
              <div className="dropdown-menu">
                <a className="dropdown-item" href="#">
                  L'Aquila
                </a>
                <a className="dropdown-item" href="#">
                  Potenza
                </a>
                <a className="dropdown-item" href="#">
                  Catanzaro
                </a>
                <a className="dropdown-item" href="#">
                  Napoli
                </a>
                <a className="dropdown-item" href="#">
                  Bologna
                </a>
                <a className="dropdown-item" href="#">
                  Trieste
                </a>
                <a className="dropdown-item" href="#">
                  Roma
                </a>
                <a className="dropdown-item" href="#">
                  Genova
                </a>
                <a className="dropdown-item" href="#">
                  Milano
                </a>
                <a className="dropdown-item" href="#">
                  Ancona
                </a>
                <a className="dropdown-item" href="#">
                  Campobasso
                </a>
                <a className="dropdown-item" href="#">
                  Torino
                </a>
                <a className="dropdown-item" href="#">
                  Bari
                </a>
                <a className="dropdown-item" href="#">
                  Cagliari
                </a>
                <a className="dropdown-item" href="#">
                  Palermo
                </a>
                <a className="dropdown-item" href="#">
                  Firenze
                </a>
                <a className="dropdown-item" href="#">
                  Trento
                </a>
                <a className="dropdown-item" href="#">
                  Perugia
                </a>
                <a className="dropdown-item" href="#">
                  Aosta
                </a>
                <a className="dropdown-item" href="#">
                  Venezia
                </a>
              </div>
            </div>
          </form>
        </nav>
      </div>
    </>
  );
}
export default Navbar;
