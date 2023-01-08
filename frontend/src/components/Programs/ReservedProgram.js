import React, { useEffect, useState } from 'react';
import styled from 'styled-components';

function ReservedProgram(props) {
  const { program } = props;

  return (
    <Section>
      <SocialLine />
      <EditContainer>
        <ProgramName>{program.programName}</ProgramName>
      </EditContainer>
    </Section>
  );
}

export default ReservedProgram;

const Section = styled.div`
  width: 100%;
`;
const EditContainer = styled.div`
  width: 100%;
  display: flex;
  flex-direction: row;
  align-items: stretch;
  padding: 0 10px;
`;

const ProgramName = styled.div`
  flex: 1;
  width: 50%;
  height: 50px;
  padding: 13px 12px;
  margin-top: 12px;
  margin-bottom: 12px;
  outline: none;
  border: transparent;
  border-radius: 15px;
  background-color: white;
  :focus {
  }
  color: black;
  :hover {
    cursor: arrow;
  }
`;

const SocialLine = styled.hr`
  position: relative;
  top: 7.5px;
  margin: 0;
  width: 90%;
  height: 1px;
  background-color: #f1f3f5;
  border: none;
  display: block;
  z-index: -1;
`;
