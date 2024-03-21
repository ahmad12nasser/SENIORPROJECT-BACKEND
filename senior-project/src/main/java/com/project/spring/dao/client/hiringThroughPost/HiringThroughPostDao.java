package com.project.spring.dao.client.hiringThroughPost;

public interface HiringThroughPostDao {
	public int updatePostStatus(long requestId, String status);

	public int insertHiredPost(long clientId, String status, long postId);
}
