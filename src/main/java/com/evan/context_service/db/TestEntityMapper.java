/**
 * 
 */
package com.evan.context_service.db;

import org.apache.ibatis.annotations.Select;

/**
 * @author 310199253
 *
 */
public interface TestEntityMapper {
	  @Select("SELECT * FROM test WHERE id = #{id}")
	  TestEntity selectTestEntity(int id);
}
