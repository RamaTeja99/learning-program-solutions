import React from "react";
import FlightList from "./FlightList";

const GuestPage = () => (
  <div>
    <h1>Welcome, Guest!</h1>
    <FlightList showBookButton={false} />
    <p style={{ color: 'grey' }}>Log in to book tickets.</p>
  </div>
);

export default GuestPage;
