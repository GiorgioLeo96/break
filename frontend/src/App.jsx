import { useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";

function App() {
  return (
    <>
      <Navbar />
      <div className="container" style={{ marginTop: "100px" }}>
        <Home />
      </div>
    </>
  );
}

export default App;
