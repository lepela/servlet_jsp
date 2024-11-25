<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="https://t1.kakaocdn.net/kakao_js_sdk/2.7.3/kakao.min.js"
  integrity="sha384-kLbo2SvoNtOFiniJ1EQ9o2iDA8i3xp+O6Cns+L5cd4RsOJfl+43z5pvieT2ayq3C" crossorigin="anonymous"></script>
<script>
  Kakao.init('b4e466422f73f55da0516a5d83ac00d6'); // 사용하려는 앱의 JavaScript 키 입력
</script>

<!-- <a id="add-channel-button" href="javascript:addChannel()">
  <img src="https://developers.kakao.com/tool/resource/static/img/button/channel/add/channel_add_small.png"
    alt="카카오톡 채널 추가하기 버튼" />
</a> -->
<a id="chat-channel-button" href="javascript:chatChannel()">
  <img src="https://developers.kakao.com/tool/resource/static/img/button/channel/consult/consult_small_yellow_pc.png"
    alt="카카오톡 채널 채팅하기 버튼" />
</a>
<script >
/* 	Kakao.Channel.createAddChannelButton({
	  container: '#kakao-add-channel-button',
	  channelPublicId: '_psMxdn' // 카카오톡 채널 홈 URL에 명시된 id로 설정합니다.
	}); */
	
</script>
<script>
  function chatChannel() {
    Kakao.Channel.chat({
      channelPublicId: '_psMxdn',
    });
  }
</script>
</body>
</html>