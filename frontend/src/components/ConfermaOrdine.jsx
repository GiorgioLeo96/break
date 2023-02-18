import React from "react";
import pawfilled from "../logo/pawfilled.svg";

const ConfermaOrdine = () => {
  return (
    <>
      <div
        style={{
          display: "flex",
          justifyContent: "center",
          alignItems: "center",
          height: "80vh",
          fontSize: "2em",
        }}
      >
        Il tuo ordine è stato confermato
        <img
          src={pawfilled}
          style={{
            padding: "16px",
          }}
          alt=""
        />
      </div>
    </>
  );
};

export default ConfermaOrdine;
