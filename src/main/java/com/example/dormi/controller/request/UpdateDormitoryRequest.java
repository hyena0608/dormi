package com.example.dormi.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "기숙사 수정")
@Data
public class UpdateDormitoryRequest {

  @ApiParam(value = "null", required = true)
  private long dormitoryId;

  @ApiParam(value = "null", required = true)
  private String dormitoryName;

  @ApiParam(value = "null", required = true)
  private String dormitoryAddress;
}
