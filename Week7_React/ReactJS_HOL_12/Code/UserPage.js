import React, { useState } from "react";
import FlightList from "./FlightList";

const UserPage = () => {
  const [bookingMessage, setBookingMessage] = useState("");
  const handleBook = (flight) => {
    setBookingMessage(`Booked flight from ${flight.from} to ${flight.to} at ${flight.time}!`);
    setTimeout(() => setBookingMessage(""), 2000);
  };

  return (
    <div>
      <h1>Welcome, User!</h1>
      <FlightList showBookButton={true} handleBook={handleBook} />
      {bookingMessage && (
        <p style={{ color: "green", fontWeight: "bold" }}>{bookingMessage}</p>
      )}
    </div>
  );
};

export default UserPage;
