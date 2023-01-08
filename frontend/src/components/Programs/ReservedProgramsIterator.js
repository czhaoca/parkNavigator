import React from 'react';
import styled from 'styled-components';
import ReservedProgram from './ReservedProgram';
function ReservationIterator(props) {
  const { programList } = props;

  return (
    <Wrapper>
      <Section>
        <ScheduleWrapper>
          <SocialLine />
          <Title>Reserved Program</Title>
          {programList?.map((program, idx) => (
            <ReservedProgram key={idx} program={program} />
          ))}
        </ScheduleWrapper>
      </Section>
    </Wrapper>
  );
}

export default ReservationIterator;

const Wrapper = styled.div`
  width: 100%;
  display: flex;
`;

const Section = styled.section`
  width: 100%;
  display: flex;
  justify-content: center;
  padding: 10px;
`;

const ScheduleWrapper = styled.section`
  width: 100%;
  display: flex;
  justify-content: flex-start;
  flex-direction: column;
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
const Title = styled.span`
  margin-bottom: 12px;
  padding: 0 13px;
  font-size: 16px;
  font-weight: bold;
  line-height: 1.6;
  color: #007aff;
  z-index: 1;
`;
