function Fondo() {
  const myStyle = {
    background: "rgb(191,249,255)",
    height: "3px",
    width: "100%",
    backgroundImage:
      "linear-gradient(90deg, rgba(191,249,255,1) 0%, rgba(44,133,235,1) 41%, rgba(62,101,145,1) 100%)",
  };
  return (
    <>
      <div style={{ bottom: "0", left: "0", width: "100%" }}>
        <div style={myStyle}></div>
        <div style={{ backgroundColor: "#171717", padding: "10px" }}>
          <div className="container text-white d-flex justify-content-between">
            <div className="col-4" style={{ marginTop: "16px" }}>
              <h5>Chi siamo?</h5>
              <p>Per qualunque informazione, richiesta contattare lo staff. </p>
              <p>
                Siamo un team affidabile e sempre pronto per qualunque esigenza
                del nostro cliente.
              </p>
              <p>
                BNB Gio è un team in continua espasione, lavoriamo al meglio per
                i nostri utenti.
              </p>
            </div>
            <div className="col-4" style={{ marginTop: "16px" }}>
              <h5>Contatti:</h5>
              <p>Numero verde: 333 532 302918</p>
              <p>
                Gli orari per contattare il servizio clienti:
                <br />
                Dal Lunedi al Venerdi : 9:30 19:30. <br />
                Sabato: 9:30 12:00.
              </p>
              <p>Email : BnbGio.Appartamento@gmail.com</p>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}

export default Fondo;
