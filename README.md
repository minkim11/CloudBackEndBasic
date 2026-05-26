# CH4 클라우드 주차 과제
### LV 0 - AWS Budget 설정
<img src="img/LV0.png" alt="">

### LV 1 - 네트워크 구축 및 핵심 기능 배포
Public IP : 54.180.202.27

### LV 2 - DB 분리 및 보안 연결하기
- Actuator Info 엔드포인트 URL: http://54.180.202.27:8080/actuator/info
- RDS 보안 그룹 스크린샷

<img src="img/LV2.png" alt="">

### LV 3 - 프로필 사진 기능 추가와 권한 관리
<img src="img/LV3.png" alt="">  

<details>
<summary><strong>PresignedURL</strong></summary>

https://cloud-basic-profile-097466312661-ap-northeast-2-an.s3.ap-northeast-2.amazonaws.com/uploads/4fa1babf-808a-4764-80e0-456db9652587_%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202026-04-18%20133730.png?X-Amz-Security-Token=IQoJb3JpZ2luX2VjEKj%2F%2F%2F%2F%2F%2F%2F%2F%2F%2FwEaDmFwLW5vcnRoZWFzdC0yIkcwRQIhALwNf4cIlph7iNkLtzhgJyeHM4XaPCsitERfHc74rTfTAiBvaDcyBv5l5407Rbyqiw78CvloHnqXVBFFpZI7ukVY3SrLBQhyEAAaDDA5NzQ2NjMxMjY2MSIMt766A0dcbrS9xjlMKqgFJJAJXequF1A%2FZrIdcjzj%2BNS5XzachmPG2y%2BPxiravS7ARROs9Su8TMioDpZSr2TmSvHNIyahBQvtZpDKs%2BW58RhBV4xDDqJR3aMd%2BejmQXEFf8lnRhvnWSTABXJyrNWua5PurojUyPPt595m6wJP3K10FgUYOPockC77BRiMRkaFMfjk8acvY0DlIjS5ik8%2Bod71l3%2FscFZ5JEsPxJcUt0J3sDM%2FmwlRVXSpyoSvLADGbBBeBndKYWgLzx9HhDCFX7AszQR45Xwwfmd1DKZPFe5x7O3Ux%2FLT6XhpNUxJ8q2xbPphGJFdkC9UiG6H0hLQoj3OUl0yVa1OBKgso42AVQj0CIhCch6IgN6bYcHqP%2Fb9YC0uVfMkkgUOCVvLjd%2B3mHdI06FS69ao2jyCvTcnBQ5unB%2BSY18diAT8rAvqXN1sKcE8wnWxS7A5MK9xUJ5H3QEMzPazmS7CU%2BYZbaZPWPr%2BC5gI1BfinvYpvOWEX23hLteBZQwDlrCOQGs0h5CaVeiw6mwT70U%2BralWytSAzqRYqaWwqu6za4Lg4wKy7I%2B6CG6jQEemUGNykgEnrH16R65an1fR09wG1ggSsFpn60FHa6i0BIOSn1pKtiACMtR4PUHi63KJjAXUZ0w1X6sTQazhNXgUKrCYefJQrxFwAHfZOsQAz%2B3%2F%2Bgaqe%2F1bp%2BWpUXk13kJdEv%2Fm0nP%2FLyJWrqweow9KhWjNrU8VPOs0MuzfenKFnfY54NHPeHWMXIaK8ZwaymwIGQfd3Z8YsWDX9OmDCAE73bd4EVH5oj7MES9iOqhTlpoTcPFpV0rf5Wn6SFGv%2Fp%2BO2Ixd1itNuWAaCGXi9wUMQ28O2PnwjFUgGYS156sSE6K%2B1S%2BszAfxudobS2i87pDEltvlcjz83Foki98ALg2LyvQwntLT0AY6sQFgDkYRVVxr24Fi4q%2BuhWDGA6MHqkejbPbJWxCngqhjb9pXiT6Q63jhu1FapuGZyakUMykA%2BWRWyZwKnt1inojszmbh%2F2yUjx5il7cvFK4bHWLKjKJ2%2FFNBl%2FXo9iWO68mjeLLsWZODOFWY6QlWEW7PJBgo%2FBhvUdL799nZVBJ6Bm6ohj%2F%2BZF4c%2BYMxkmNucVKUeYJa4M8kqMxnchgZ7vaDY9FSna9k4JJ9eSagRLvu5rU%3D&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20260526T011341Z&X-Amz-SignedHeaders=host&X-Amz-Credential=ASIARNMLR47KSHZVVH4O%2F20260526%2Fap-northeast-2%2Fs3%2Faws4_request&X-Amz-Expires=604800&X-Amz-Signature=1d3b333fe1cdba95049ad52ace9f99a07d6104de7a2c60b3a6d1c3eb53665d3c

</details>

### LV 4 - Docker & CI/CD 파이프라인 구축
Github Actions 성공이미지  
<img src="img/LV4-1.png" alt="">

EC2 Docker 터미널  
<img src="img/LV4-2.png" alt="">  

### LV 5 -  고가용성 아키텍처와 보안 도메인 연결 (ALB + ASG + HTTPS) 
URL : https://api.surfcance.click/actuator/health

대상 그룹 이미지  
<img src="img/LV5.png" alt="">  