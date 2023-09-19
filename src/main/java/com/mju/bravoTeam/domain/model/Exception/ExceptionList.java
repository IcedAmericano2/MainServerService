package com.mju.bravoTeam.domain.model.Exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ExceptionList {

    UNKNOWN(-9999, "알 수 없는 오류가 발생하였습니다."),
    NON_EXISTENT_CHECKLIST(5005, "내용이 존재하지 않습니다."),
    // 일정
    NON_EXISTENT_SCHEDULELIST(5006, "일정 목록이 존재하지 않습니다."),
    NON_EXISTENT_SCHEDULE(5007, "일정이 존재하지 않습니다.");

    private final int code;
    private final String message;
}
