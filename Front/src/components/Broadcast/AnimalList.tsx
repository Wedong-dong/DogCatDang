import { useParams } from "react-router-dom";

const AnimalList = () => {
  const params = useParams();
  const sessionId = params["*"];

  // 방송 상세정보 요청

  return (
    <>
      <div></div>
    </>
  );
};

export default AnimalList;
