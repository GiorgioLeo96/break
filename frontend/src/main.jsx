import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import { createBrowserRouter, RouterProvider } from "react-router-dom";

import DettagliApp from "./pages/DettagliApp";
import Home from "./pages/Home";

import Prenota from "./components/Prenota";
import ConfermaOrdine from "./components/ConfermaOrdine";

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    children: [
      { path: "", element: <Home /> },
      {
        path: "/dettagliappartamento/:id",
        element: <DettagliApp />,
      },
      {
        path: "/prenota",
        element: <Prenota />,
      },
      {
        path: "/confermaordine",
        element: <ConfermaOrdine />,
      },
    ],
  },
]);

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
