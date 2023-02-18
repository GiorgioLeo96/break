import React, { useState, useEffect, useContext } from "react";
import Appartamento from "../components/Appartamento";
import { FetchAllContext } from "../App";

function Home() {
  const [data, setData] = useState([]);
  const { fetchAll, setFetchAll } = useContext(FetchAllContext);
  useEffect(() => {
    fetch(fetchAll)
      .then((response) => response.json())
      .then((responseData) => setData(responseData))
      .catch((error) => console.error(error));
  }, [fetchAll]);

  return (
    <>
      <div className="row">
        {data.map((appartamento, index) => {
          if (index > 11) {
            return;
          }
          return <Appartamento key={appartamento.id} dettagli={appartamento} />;
        })}
      </div>
    </>
  );
}

export default Home;
