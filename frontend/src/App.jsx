import "bootstrap/dist/css/bootstrap.min.css";
import { createContext, useState } from "react";
import { Outlet } from "react-router-dom";
import Navbar from "./components/Navbar";
import Fondo from "./pages/Fondo";

export const FetchAllContext = createContext({
  fetchAll: "http://localhost:8080/api/appartamento/all?",
  setFetchAll: () => {},
});

function App() {
  const [fetchAll, setFetchAll] = useState(
    "http://localhost:8080/api/appartamento/all?"
  );

  const value = { fetchAll, setFetchAll };

  return (
    <FetchAllContext.Provider value={value}>
      <Navbar />
      <div
        className="container-fluid .bg-light"
        style={{ marginTop: "110px", minHeight: "65vh" }}
      >
        <Outlet />
      </div>
      <Fondo />
    </FetchAllContext.Provider>
  );
}

export default App;
