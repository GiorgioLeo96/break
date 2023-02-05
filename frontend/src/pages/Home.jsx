import React, { useState, useEffect } from "react";
import Appartamento from "../components/Appartamento";

function Home() {
  const [data, setData] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/appartamento/all")
      .then((response) => response.json())
      .then((responseData) => setData(responseData))
      .catch((error) => console.error(error));
  }, []);
  return (
    <div className="row ">
      {data.map((appartamento) => {
        return <Appartamento key={appartamento.id} dettagli={appartamento} />;
      })}
    </div>
  );
}

export default Home;
