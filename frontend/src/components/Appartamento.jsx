import { find } from "lodash";

export default function Appartamento({ dettagli }) {
  const regex = /^.*esterno\.jpg$/m;
  const esterno = find(dettagli.immagini, function (o) {
    return o.immagine.match(regex);
  });

  return (
    <div className="col-sm-6 col-lg-4 mb-4">
      <div class="card">
        <img
          style={{ height: "200px", objectFit: "cover" }}
          src={"http://localhost:8080/" + esterno.immagine}
          class="card-img-top"
          alt="esterno"
        />
        <div class="card-body">
          <h5 class="card-title">Card title</h5>
          <p class="card-text">
            Some quick example text to build on the card title and make up the
            bulk of the card's content.
          </p>
          <a href="#" class="btn btn-primary">
            bella la casa? clicca qui!
          </a>
        </div>
      </div>
    </div>
  );
}
