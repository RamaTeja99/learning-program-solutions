import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails(props) {
  const { cohort } = props;
  const headingClass =
    cohort.currentStatus.toLowerCase() === 'ongoing'
      ? styles.ongoing
      : styles.completed;

  return (
    <div className={styles.box}>
      <h3 className={headingClass}>
        {cohort.cohortCode} - <span>{cohort.technology}</span>
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>

        <dt>Current Status</dt>
        <dd>{cohort.currentStatus}</dd>

        <dt>Coach</dt>
        <dd>{cohort.coachName}</dd>

        <dt>Trainer</dt>
        <dd>{cohort.trainerName}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
