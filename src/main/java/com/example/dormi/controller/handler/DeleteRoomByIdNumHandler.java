package com.example.dormi.controller.handler;

import com.example.dormi.controller.request.*;
import com.example.dormi.controller.response.*;
import com.example.dormi.mapper.DormiMapper;
import com.example.dormi.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.dormi.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class DeleteRoomByIdNumHandler extends BaseHandler {

  private final DormiMapper mapper;

  public DeleteRoomByIdNumResponse execute(CustomUserDetails user, DeleteRoomByIdNumRequest req) {
    DeleteRoomByIdNumResponse res = new DeleteRoomByIdNumResponse();

    final long roomId = req.getRoomId();
    final long roomNumber = req.getRoomNumber();

//    if(emptyParam(roomId) || emptyParam(roomNumber)) {
//      res.setCode(ResultCode.BadParams);
//      return res;
//    }

    try {

      long deletedRoomId = mapper.deleteRoomByIdNum(roomId, roomNumber);

      res.setRoomId(deletedRoomId);
      res.setCode(ResultCode.Success);
      return res;
    }
    catch(Exception e) {
      log.error(e.toString());
      res.setCode(ResultCode.Failed);
      return res;
    }
  }
}
