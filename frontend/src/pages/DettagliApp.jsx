import { useParams } from "react-router-dom";
import { useState, useEffect } from "react";
import DettagliAppartamento from "../components/DettagliAppartamento";
import { isEmpty } from "lodash";

export default function DettagliApp() {
  const { id } = useParams();
  const [data, setData] = useState([]);

  useEffect(() => {
    if (!isEmpty(id)) {
      fetch("http://localhost:8080/api/appartamento/" + id)
        .then((response) => response.json())
        .then((responseData) => setData(responseData))
        .catch((error) => console.error(error));
    }
  }, [id]);
  if (!isEmpty(data)) {
    return <DettagliAppartamento dettagli={data} />;
  }
}
