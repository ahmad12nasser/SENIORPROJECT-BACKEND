package com.project.spring.dao;

public class Queries {

	public final static String INSERT_INTO_FREELANCER = "INSERT INTO FREELANCER			\n"
			+ "         (                        \n"
			+ "                 FIRST_NAME  ,    \n"
			+ "                 LAST_NAME   ,    \n"
			+ "                 USER_NAME   ,    \n"
			+ "                 EMAIL       ,    \n"
			+ "                 PASSWORD    ,    \n"
			+ "                 PROFILE_IMG ,    \n"
			+ "                 MOBILE      ,    \n"
			+ "                 LOCATION    ,    \n"
			+ "                 DESCRIPTION      \n"
			+ "         )                        \n"
			+ " VALUES                           \n"
			+ "         (                        \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "					?                \n"
			+ "         )                        \n";

	public final static String INSERT_INTO_CLIENT = " INSERT INTO CLIENT					\n"
			+ "         (                           \n"
			+ "                 FIRST_NAME   ,      \n"
			+ "                 LAST_NAME    ,      \n"
			+ "                 USER_NAME    ,      \n"
			+ "                 EMAIL        ,      \n"
			+ "                 PASSWORD     ,      \n"
			+ "                 PROFILE_IMAGE,      \n"
			+ "                 MOBILE              \n"
			+ "         )                           \n"
			+ " VALUES                              \n"
			+ "         (                           \n"
			+ "                 ?,                  \n"
			+ "                 ?,                  \n"
			+ "                 ?,                  \n"
			+ "                 ?,                  \n"
			+ "                 ?,                  \n"
			+ "                 ?,                  \n"
			+ "                 ?                   \n"
			+ "         )							\n";

	public final static String GET_CLINET_BY_ID = "SELECT						\n "
			+ "        ID		             	\n "
			+ "FROM                          	\n "
			+ "        CLIENT                	\n "
			+ "WHERE                         	\n "
			+ "        EMAIL    = ?   	 		\n "
			+ "AND     PASSWORD = ?				\n ";

	public final static String GET_FREELNACER_BY_ID = " SELECT					\n"
			+ "         ID           	\n" + " FROM                 	\n"
			+ "         FREELANCER   	\n" + " WHERE                	\n"
			+ "         EMAIL = ?    	\n" + " AND PASSWORD = ?     	\n";

	public final static String GET_ALL_REQUESTS = "SELECT						\n"
			+ "        r.id               		 ,    \n"
			+ "        r.title          	   	 ,    \n"
			+ "        r.dateposted      		 ,    \n"
			+ "        r.deadline         		 ,    \n"
			+ "        r.categ_name      		 ,    \n"
			+ "        r.location        		 ,    \n"
			+ "        r.description     		 ,    \n"
			+ "        r.image          		 ,    \n"
			+ "        r.price          		 ,    \n"
			+ "        r.status as request_status,    \n"
			+ "        c.id as client_id  		 ,    \n"
			+ "        c.first_name 		     ,    \n"
			+ "        c.last_name		         ,    \n"
			+ "        c.profile_image      		  \n"
			+ "FROM                          		  \n"
			+ "        requests r              		  \n"
			+ "JOIN                         		  \n"
			+ "        client c             		  \n"
			+ "ON                           		  \n"
			+ "        r.client_id = c.id   		  \n"
			+ "WHERE 								  \n"
			+ "        STATUS = 'Pending'             \n";
	public final static String CREATE_POST = " INSERT INTO POSTS				\n"
			+ "         (                        \n"
			+ "                 FREELANCER_ID,   \n"
			+ "                 TITLE        ,   \n"
			+ "                 DATE_POSTED  ,   \n"
			+ "                 DEADLINE     ,   \n"
			+ "                 LOCATION     ,   \n"
			+ "                 CATEG_NAME   ,   \n"
			+ "                 DESCRIPTION  ,   \n"
			+ "                 IMAGE        ,   \n"
			+ "                 PRICE            \n"
			+ "         )                        \n"
			+ " VALUES                           \n"
			+ "         (                        \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?,               \n"
			+ "                 ?                \n"
			+ "         )                        \n";

	public final static String GET_POSTS_BY_ID = " SELECT						\n"
			+ "         ID           ,       \n"
			+ "         FREELANCER_ID,       \n"
			+ "         TITLE        ,       \n"
			+ "         DATE_POSTED  ,       \n"
			+ "         DEADLINE     ,       \n"
			+ "         LOCATION     ,       \n"
			+ "         CATEG_NAME   ,       \n"
			+ "         DESCRIPTION  ,       \n"
			+ "         IMAGE        ,       \n"
			+ "         PRICE                \n"
			+ " FROM                         \n"
			+ "         posts                \n"
			+ " WHERE                        \n"
			+ "      freelancer_id = ?       \n";

	public final static String UPDATE_REQUEST_STATUS = " UPDATE				\n"
			+ "         REQUESTS     \n" + " SET                  \n"
			+ "         STATUS = ?   \n" + " WHERE                \n"
			+ "         ID = ?       \n";

	public final static String INSERT_APPLIED_REQUEST = " INSERT INTO APPLIED_REQUESTS									\n"
			+ "         (                                                    \n"
			+ "                 CLIENT_ID    ,                               \n"
			+ "                 FREELANCER_ID,                               \n"
			+ "                 CATEG_NAME   ,                               \n"
			+ "                 DESCRIPTION  ,                               \n"
			+ "                 DATEPOSTED   ,                               \n"
			+ "                 DEADLINE     ,                               \n"
			+ "                 LOCATION     ,                               \n"
			+ "                 TITLE        ,                               \n"
			+ "                 PRICE        ,                               \n"
			+ "                 IMAGE        ,                               \n"
			+ "                 STATUS                                       \n"
			+ "         )                                                    \n"
			+ " SELECT                                                       \n"
			+ "         CLIENT_ID           ,                                \n"
			+ "         ? AS FREELANCER_ID  ,                                \n"
			+ "         CATEG_NAME          ,                                \n"
			+ "         TO_CHAR(DESCRIPTION),                                \n"
			+ "         DATEPOSTED          ,                                \n"
			+ "         DEADLINE            ,                                \n"
			+ "         LOCATION            ,                                \n"
			+ "         TITLE               ,                                \n"
			+ "         PRICE               ,                                \n"
			+ "         IMAGE               ,                                \n"
			+ "         ? AS STATUS       									 \n"
			+ " FROM                                                         \n"
			+ "         REQUESTS                                             \n"
			+ " WHERE                                                        \n"
			+ "         ID = ?                                               \n";

	public final static String GET_ALL_JOBS_BY_FREELANCER_ID = " SELECT											\n"
			+ "         t.id AS todo_id                ,         \n"
			+ "         t.freelancer_id                ,         \n"
			+ "         t.client_id                    ,         \n"
			+ "         t.status        AS todo_status        ,  \n"
			+ "         c.first_name    AS client_first_name  ,  \n"
			+ "         c.last_name     as client_last_name   ,  \n"
			+ "         c.profile_image as client_profileImage,  \n"
			+ "         r.title         AS request_title      ,  \n"
			+ "         r.description   as request_description,  \n"
			+ "         r.deadline      as request_deadLine   ,  \n"
			+ "         r.location      as request_location   ,  \n"
			+ "         r.price         as request_price      ,  \n"
			+ "         p.title         AS post_title         ,  \n"
			+ "         p.description   as post_description   ,  \n"
			+ "         p.deadline      as post_deadLine      ,  \n"
			+ "         p.location      as post_location      ,  \n"
			+ "         p.price         as post_price            \n"
			+ " FROM                                             \n"
			+ "         ToDo t                                   \n"
			+ " LEFT JOIN                                        \n"
			+ "         client c                                 \n"
			+ " ON                                               \n"
			+ "         t.client_id = c.id                       \n"
			+ " LEFT JOIN                                        \n"
			+ "         applied_requests r                       \n"
			+ " ON                                               \n"
			+ "         t.applied_request_id= r.id               \n"
			+ " LEFT JOIN                                        \n"
			+ "         hired_posts p                            \n"
			+ " ON                                               \n"
			+ "         t.hired_post_id = p.id                   \n"
			+ " WHERE                                            \n"
			+ "         t.freelancer_id = ?                      \n";

	public final static String GET_ALL_POSTS = "select												\n"
			+ "        p.id                       ,                  \n"
			+ "        p.title                    ,                  \n"
			+ "        p.date_posted              ,                  \n"
			+ "        p.deadline                 ,                  \n"
			+ "        p.location                 ,                  \n"
			+ "        p.categ_name               ,                  \n"
			+ "        p.Description              ,                  \n"
			+ "        p.image                    ,                  \n"
			+ "        p.price                    ,                  \n"
			+ "        p.status                   ,                  \n"
			+ "        f.id            as freelancer_id      ,       \n"
			+ "        f.first_name    as freelancerFirstName,       \n"
			+ "        f.last_name     as freelancerLastName ,       \n"
			+ "        f.profile_image as freelancerProfileImage     \n"
			+ "from                                                  \n"
			+ "        posts p                                       \n"
			+ "join                                                  \n"
			+ "        freelancer f                                  \n"
			+ "on                                                    \n"
			+ "        p.freelancer_id = f.id                        \n";

	public final static String CREATE_REQUEST = "INSERT INTO REQUESTS			\n"
			+ "        (                     \n"
			+ "                CLIENT_ID   , \n"
			+ "                CATEG_NAME  , \n"
			+ "                DESCRIPTION , \n"
			+ "                DATEPOSTED , \n"
			+ "                DEADLINE    , \n"
			+ "                LOCATION    , \n"
			+ "                TITLE       , \n"
			+ "                PRICE       , \n"
			+ "                IMAGE         \n"
			+ "        )                     \n"
			+ "VALUES                        \n"
			+ "        (                     \n"
			+ "                ?,            \n"
			+ "                ?,            \n"
			+ "                ?,            \n"
			+ "                ?,            \n"
			+ "                ?,            \n"
			+ "                ?,            \n"
			+ "                ?,            \n"
			+ "                ?,            \n"
			+ "                ?             \n"
			+ "        )                     \n";

	public final static String UPDATE_POST_STATUS = "UPDATE				\n"
			+ "        POSTS         \n" + "SET                   \n"
			+ "        STATUS = ?    \n" + "WHERE                 \n"
			+ "        ID = ?        \n";

	public final static String INSERT_HIRED_POSTS = "INSERT INTO HIRED_POSTS			\n"
			+ "        (                         \n"
			+ "                FREELANCER_ID,    \n"
			+ "                CLIENT_ID    ,    \n"
			+ "                CATEG_NAME   ,    \n"
			+ "                DESCRIPTION  ,    \n"
			+ "                DATEPOSTED   ,    \n"
			+ "                DEADLINE     ,    \n"
			+ "                LOCATION     ,    \n"
			+ "                TITLE        ,    \n"
			+ "                PRICE        ,    \n"
			+ "                IMAGE        ,    \n"
			+ "                STATUS            \n"
			+ "        )                         \n"
			+ "SELECT                            \n"
			+ "        FREELANCER_ID       ,     \n"
			+ "        ? AS CLIENT_ID      ,     \n"
			+ "        CATEG_NAME          ,     \n"
			+ "        TO_CHAR(DESCRIPTION),     \n"
			+ "        DATE_POSTED          ,     \n"
			+ "        DEADLINE            ,     \n"
			+ "        LOCATION            ,     \n"
			+ "        TITLE               ,     \n"
			+ "        PRICE               ,     \n"
			+ "        IMAGE               ,     \n"
			+ "        ? AS STATUS               \n"
			+ "FROM                              \n"
			+ "        POSTS                  \n"
			+ "WHERE                             \n"
			+ "        ID = ?					\n";

	public final static String GET_REQUESTS_BY_CLIENTID = "SELECT					\n"
			+ "        ID          ,     \n" + "        CLIENT_ID   ,     \n"
			+ "        TITLE       ,     \n" + "        DATEPOSTED  ,     \n"
			+ "        DEADLINE    ,     \n" + "        LOCATION    ,     \n"
			+ "        CATEG_NAME  ,     \n" + "        DESCRIPTION ,     \n"
			+ "        IMAGE       ,     \n" + "        PRICE       ,     \n"
			+ "        STATUS            \n" + "FROM                      \n"
			+ "        REQUESTS          \n" + "WHERE                     \n"
			+ "        CLIENT_ID = ?    \n";

	public final static String GET_PENDING_HIRED_POSTS_BY_CIENTID = " SELECT												\n"
			+ "         h.id                        ,                \n"
			+ "         h.title                     ,                \n"
			+ "         h.dateposted                ,                \n"
			+ "         h.deadline                  ,                \n"
			+ "         h.categ_name                ,                \n"
			+ "         h.location                  ,                \n"
			+ "         h.description               ,                \n"
			+ "         h.image                     ,                \n"
			+ "         h.price                     ,                \n"
			+ "         h.status                    ,                \n"
			+ "         f.id            as freelancer_id       ,     \n"
			+ "         f.first_name    as freelancerFirstName ,     \n"
			+ "         f.last_name     as freelancerLastName  ,     \n"
			+ "         f.profile_image as freelancerProfileImage    \n"
			+ " FROM                                                 \n"
			+ "         hired_posts h                                \n"
			+ " JOIN                                                 \n"
			+ "         freelancer f                                 \n"
			+ " ON                                                   \n"
			+ "         h.freelancer_id = f.id                       \n"
			+ " where                                                \n"
			+ "         client_id = ?                                \n";

	public final static String GET_PENDING_APPLIED_REQUESTS_BY_CLIENTID = " SELECT												\n"
			+ "         a.id                        ,                \n"
			+ "         a.title                     ,                \n"
			+ "         a.dateposted                ,                \n"
			+ "         a.deadline                  ,                \n"
			+ "         a.categ_name                ,                \n"
			+ "         a.location                  ,                \n"
			+ "         a.description               ,                \n"
			+ "         a.image                     ,                \n"
			+ "         a.price                     ,                \n"
			+ "         a.status                    ,                \n"
			+ "         f.id            as freelancer_id       ,     \n"
			+ "         f.first_name    as freelancerFirstName ,     \n"
			+ "         f.last_name     as freelancerLastName  ,     \n"
			+ "         f.profile_image as freelancerProfileImage    \n"
			+ " FROM                                                 \n"
			+ "         applied_requests a                           \n"
			+ " JOIN                                                 \n"
			+ "         freelancer f                                 \n"
			+ " ON                                                   \n"
			+ "         a.freelancer_id = f.id                       \n"
			+ " where                                                \n"
			+ "         client_id = ?                                \n";

	public final static String INSERT_APPLIED_REQUEST_INTO_TODO = " INSERT INTO todo								\n"
			+ "         (                                    \n"
			+ "                 freelancer_id     ,          \n"
			+ "                 client_id         ,          \n"
			+ "                 status            ,          \n"
			+ "                 applied_request_id,          \n"
			+ "                 hired_post_id                \n"
			+ "         )                                    \n"
			+ " SELECT                                       \n"
			+ "         freelancer_id                    ,   \n"
			+ "         client_id                        ,   \n"
			+ "         	?	    AS status            ,   \n"
			+ "         a.id        AS applied_request_id,   \n"
			+ "         NULL        AS hired_post_id         \n"
			+ " FROM                                         \n"
			+ "         applied_requests a                   \n"
			+ " WHERE                                        \n"
			+ "         a.id = ?                             \n";

	public final static String UPDATE_APPLIED_REQUEST_STATUS = " update						\n"
			+ "         applied_requests     \n"
			+ " set                          \n"
			+ "         status = ?		     \n"
			+ " where                        \n"
			+ "         id = ?               \n";

	public final static String GET_PENDING_APPLIED_REQUESTS_BY_FREELANCERID = " SELECT											\n"
			+ "         a.id                        ,            \n"
			+ "         a.title                     ,            \n"
			+ "         a.dateposted                ,            \n"
			+ "         a.deadline                  ,            \n"
			+ "         a.categ_name                ,            \n"
			+ "         a.location                  ,            \n"
			+ "         a.description               ,            \n"
			+ "         a.image                     ,            \n"
			+ "         a.price                     ,            \n"
			+ "         a.status                    ,            \n"
			+ "         c.id            as client_id       ,     \n"
			+ "         c.first_name    as clientFirstName ,     \n"
			+ "         c.last_name     as clientLastName  ,     \n"
			+ "         c.profile_image as clientProfileImage    \n"
			+ " FROM                                             \n"
			+ "         applied_requests a                       \n"
			+ " JOIN                                             \n"
			+ "         client c                                 \n"
			+ " ON                                               \n"
			+ "         a.client_id = c.id                       \n"
			+ " where                                            \n"
			+ "         freelancer_id = ?                        \n";

	public final static String GET_PENDING_HIRED_POSTS_BY_FREELANCERID = " SELECT											\n"
			+ "         h.id                        ,            \n"
			+ "         h.title                     ,            \n"
			+ "         h.dateposted                ,            \n"
			+ "         h.deadline                  ,            \n"
			+ "         h.categ_name                ,            \n"
			+ "         h.location                  ,            \n"
			+ "         h.description               ,            \n"
			+ "         h.image                     ,            \n"
			+ "         h.price                     ,            \n"
			+ "         h.status                    ,            \n"
			+ "         c.id            as client_id       ,     \n"
			+ "         c.first_name    as clientFirstName ,     \n"
			+ "         c.last_name     as clientLastName  ,     \n"
			+ "         c.profile_image as clientProfileImage    \n"
			+ " FROM                                             \n"
			+ "         hired_posts h                            \n"
			+ " JOIN                                             \n"
			+ "         client c                                 \n"
			+ " ON                                               \n"
			+ "         h.client_id = c.id                       \n"
			+ " where                                            \n"
			+ "         freelancer_id = ?                        \n";

	public final static String INSERT_HIRED_POSTS_INTO_TODO = " INSERT INTO todo 					\n"
			+ "         (                            \n"
			+ "                 freelancer_id     ,  \n"
			+ "                 client_id         ,  \n"
			+ "                 status            ,  \n"
			+ "                 hired_post_id     ,  \n"
			+ "                 applied_request_id   \n"
			+ "         )                            \n"
			+ " SELECT                               \n"
			+ "         freelancer_id     ,          \n"
			+ "         client_id         ,          \n"
			+ "         ?    AS status       ,       \n"
			+ "         h.id AS hired_post_id,       \n"
			+ "         NULL AS applied_request_id   \n"
			+ " FROM                                 \n"
			+ "         hired_posts h                \n"
			+ " WHERE                                \n"
			+ "         h.id = ?                     \n";

	public final static String UPDATE_HIRED_POST_STATUS = " update						\n"
			+ "         hired_posts  		\n"
			+ " set                  		\n"
			+ "         status = ?   		\n"
			+ " where                		\n"
			+ "         id = ?       		\n";

	public final static String GET_FREELANCER_INFO_BY_ID = " SELECT 							\n"
			+ " 		id,             			\n"
			+ " 		first_name,     			\n"
			+ " 		last_name,      			\n"
			+ " 		user_name,      			\n"
			+ " 		email,          			\n"
			+ " 		password,       			\n"
			+ " 		age,            			\n"
			+ " 		categ_name,     			\n"
			+ " 		mobile,         			\n"
			+ " 		location,       			\n"
			+ " 		profile_image,  			\n"
			+ " 		description     			\n"
			+ " FROM                 				\n"
			+ " 		freelancer      			\n"
			+ " WHERE                				\n"
			+ " 		id = ?          			\n";

	public final static String GET_CLIENT_INFO_BY_ID = " SELECT								\n"
			+ "         id         ,                 	\n"
			+ "         first_name ,                 	\n"
			+ "         last_name  ,                 	\n"
			+ "         user_name  ,                 	\n"
			+ "         email ,                      	\n"
			+ " 		password    ,                   \n"
			+ " 		age         ,                   \n"
			+ " 		mobile      ,                   \n"
			+ " 		description ,                   \n"
			+ " 		profile_image                   \n"
			+ " FROM                                 	\n"
			+ "         client                       	\n"
			+ " where                                	\n"
			+ "         id = ?                       	\n";

	public final static String UPDATE_CLIENT_INFO_BY_ID = " UPDATE										\n"
			+ "         client                               	\n"
			+ " SET                                          	\n"
			+ "         	first_name 		= ? 		,       \n"
			+ "         	last_name  		= ? 		,       \n"
			+ "         	user_name  		= ? 		,       \n"
			+ "         	email      		= ? 		,       \n"
			+ " 			password      	= ?        	,       \n"
			+ " 			mobile        	= ?        	,       \n"
			+ " 			description  	= ?        	,       \n"
			+ " 			age        		= ?         ,       \n"
			+ " 			profile_image 	= ?                 \n"
			+ " WHERE                                        	\n"
			+ " 			id = ?                 				\n";

	public final static String UPDATE_FREELANCER_INFO_BY_ID = " UPDATE										\n"
			+ "         freelancer                           	\n"
			+ " SET                                          	\n"
			+ "         	first_name 		= ? 		,       \n"
			+ "         	last_name  		= ? 		,       \n"
			+ "         	user_name  		= ? 		,       \n"
			+ "         	email      		= ? 		,       \n"
			+ " 			password      	= ?        	,       \n"
			+ " 			mobile        	= ?        	,       \n"
			+ " 			location        = ?        	,       \n"
			+ " 			categ_name      = ?        	,       \n"
			+ " 			description  	= ?        	,       \n"
			+ " 			age        		= ?         ,       \n"
			+ " 			profile_image 	= ?                 \n"
			+ " WHERE                                        	\n"
			+ " 			id = ?                          	\n";

}