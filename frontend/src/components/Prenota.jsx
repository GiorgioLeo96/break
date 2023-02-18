import React, { useState } from "react";
import { Link, useSearchParams } from "react-router-dom";
import { Form, FormGroup, Label, Input } from "reactstrap";

function Prenota() {
  const [query, setQuery] = useSearchParams();
  const [nome, setNome] = useState("");
  const [cognome, setCognome] = useState("");
  const [email, setEmail] = useState("");
  const [numeroCartaDiCredito, setNumeroCartaDiCredito] = useState("");

  function handleSubmit(eventoForm) {
    eventoForm.preventDefault();

    fetch("http://localhost:8080/api/prenotazione/create", {
      method: "POST",
      body: JSON.stringify({
        utente: {
          nome: nome,
          cognome: cognome,
          email: email,
          numeroCartaDiCredito: numeroCartaDiCredito,
        },
        appartamento: { id: query.get("appartamento") },
        checkIn: query.get("startdate"),
        checkOut: query.get("enddate"),
      }),
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((res) => res.json())
      .then((data) => {
        console.log(data);
        setNome("");
        setCognome("");
        setEmail("");
        setNumeroCartaDiCredito("");
      })
      .catch((errore) => {
        console.error("Errore durante la richiesta: ", errore);
      });
  }

  return (
    <div className="container">
      <h1>Conferma Ordine!</h1>
      <Form onSubmit={handleSubmit}>
        <FormGroup>
          <Label for="nome">Nome:</Label>
          <Input
            type="text"
            name="nome"
            id="nome"
            placeholder="Inserisci il tuo nome"
            required
            value={nome}
            onChange={(e) => setNome(e.target.value)}
          />
        </FormGroup>
        <FormGroup>
          <Label for="cognome">Cognome:</Label>
          <Input
            type="text"
            name="cognome"
            id="cognome"
            placeholder="Inserisci il tuo cognome"
            required
            value={cognome}
            onChange={(e) => setCognome(e.target.value)}
          />
        </FormGroup>
        <FormGroup>
          <Label for="email">Email:</Label>
          <Input
            type="email"
            name="email"
            id="email"
            placeholder="Inserisci il tuo email"
            required
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </FormGroup>
        <FormGroup>
          <Label for="numeroCartaDiCredito">Carta:</Label>
          <Input
            type="text"
            name="numeroCartaDiCredito"
            id="numeroCartaDiCredito"
            placeholder="Inserisci il numero della carta"
            required
            onChange={(e) => setNumeroCartaDiCredito(e.target.value)}
          />
        </FormGroup>
        <Label for="total">Total:</Label>
        <div></div>
        <button
          className="bg-dark text-white btn"
          color="dark text-white"
          type="submit"
        >
          Paga ora
        </button>
      </Form>
    </div>
  );
}

export default Prenota;
