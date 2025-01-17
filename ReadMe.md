기숙사 😜
-
20220331

## 요구 사항 💁‍♂️

### 학생 (student)
    

- 학생은 자신의 정보 수정을 할 수 있다.

- 학생은 기숙학생이 될 수 있다.


### 기숙사 (dormitory)

- 기숙사는 여러 방을 가지고 있다.

- 기숙사명, 기숙사 주소는 수정 될 수 있다.

### 방 (room)

- 방은 기숙사에 속해져 있다.

- 방의 이용자는 기숙학생이다.

- 방은 인원제한이 있다.

- 방이 삭제될 시에 해당 방에 입실한 학생들은 모두 퇴실한다.

- 방 인원 수정 시에 현재 입실한 학생 수보다 적어질 수 없다.

- 한 기숙사의 각 방은 호수를 가지고 있다.

### 기숙학생 (dormitory_student)

- 기숙학생은 학생에게 기숙사, 방이 정해질 때 생성된다.

- 기숙학생은 한 방에만 입실 할 수 있다.

- 기숙학생은 입실 학기를 선택해야 한다.

- 기숙학생 입실/퇴실 시에 방의 현재 인원이 증감한다.

- 기숙학생 퇴실 시에 방 인원이 음수가 되면 안된다.
    
- 기숙학생은 가득찬 방에 입실 할 수 없다.

- 이미 입실한 기숙 학생은 다른 방에 입실 할 수 없다.

- 기숙학생의 삭제는 퇴실을 의미한다.

### 관리자 (manager)

- 관리자는 기숙학생에게 상/벌점을 부여할 수 있다.

- 관리자는 규칙을 추가/삭제 할 수 있다.

- 관리자는 방을 수정 할 수 있다.

### 규칙 (rule)

- 규칙이 삭제 될 시에 해당 규칙에 적용이 된 학생들의 점수가 증감한다.

### 점수 (point)

- 관리자는 기숙학생에게 상/벌점을 부여할 수 있다.

- 관리자가 기숙학생에게 상/벌점을 부여하기 전 관리자, 기숙학생, 규칙이 있는지 검증한다.

- 기숙학생의 벌점이 -60점 이하일 때 강제 퇴실당한다.

<br>
<br>
<br>

<img src="./기숙사20220331.jpg">