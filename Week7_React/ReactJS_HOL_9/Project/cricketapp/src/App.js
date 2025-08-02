import React, { useState } from "react";
import ListofPlayers from "./components/ListofPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <button onClick={() => setFlag((prev) => !prev)} style={{marginBottom: "20px"}}>
        Toggle Flag (Currently: {flag ? "ListofPlayers" : "IndianPlayers"})
      </button>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
