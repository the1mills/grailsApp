


dataSource {
	//ORACLE
	dbCreate = "create-drop"
	url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"
	pooled = true
	username = "mills_gtunes"
	password = "pqiw269"
	driverClassName = "oracle.jdbc.driver.OracleDriver"
			dialect= "org.hibernate.dialect.Oracle10gDialect"
	//dialect= "org.hibernate.dialect.OracleDialect"

	properties {
		maxActive = -1
		minEvictableIdleTimeMillis=1800000
		timeBetweenEvictionRunsMillis=1800000
		numTestsPerEvictionRun=3
		testOnBorrow=true
		testWhileIdle=true
		testOnReturn=true
//		validationQuery="SELECT 1"
		validationQuery="SELECT 1 from dual"
	}
}


hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
	cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
	development {
		dataSource {

			//H2
			//  dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			//  url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"

			//ORACLE
			dbCreate = "create-drop"
			url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"
			pooled = true
			username = "mills_gtunes"
			password = "pqiw269"
			driverClassName = "oracle.jdbc.driver.OracleDriver"
			dialect= "org.hibernate.dialect.Oracle10gDialect"

			properties {
				maxActive = -1
				minEvictableIdleTimeMillis=1800000
				timeBetweenEvictionRunsMillis=1800000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
//				validationQuery="SELECT 1"
				validationQuery="SELECT 1 from dual"
			}
		}
	}
	test {
		dataSource {
			//            dbCreate = "update"
			//            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"

			//ORACLE
			dbCreate = "update"
			url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"
			pooled = false
			username = "mills_gtunes"
			password = "pqiw269"
			driverClassName = "oracle.jdbc.driver.OracleDriver"
			dialect= "org.hibernate.dialect.OracleDialect"

			properties {
				maxActive = -1
				minEvictableIdleTimeMillis=1800000
				timeBetweenEvictionRunsMillis=1800000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1 from dual"
//				validationQuery="SELECT 1"
			}
		}
	}
	production {
		dataSource {

			//H2

			//            dbCreate = "update"
			//            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
			//            pooled = true
			//            properties {
			//               maxActive = -1
			//               minEvictableIdleTimeMillis=1800000
			//               timeBetweenEvictionRunsMillis=1800000
			//               numTestsPerEvictionRun=3
			//               testOnBorrow=true
			//               testWhileIdle=true
			//               testOnReturn=true
			//               validationQuery="SELECT 1"

			//MYSQL

			//			dbCreate = "update"
			//			url = "jdbc:mysql://localhost/gTunes"
			//			pooled = true
			//			username = "root"
			//			password = ""
			//			driverClassName = "com.mysql.jdbc.Driver"

			//			properties {
			//			   maxActive = -1
			//			   minEvictableIdleTimeMillis=1800000
			//			   timeBetweenEvictionRunsMillis=1800000
			//			   numTestsPerEvictionRun=3
			//			   testOnBorrow=true
			//			   testWhileIdle=true
			//			   testOnReturn=true
			//			   validationQuery="SELECT 1"

			//Oracle


			dbCreate = "update"
			url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"
			pooled = false
			username = "mills_gtunes"
			password = "pqiw269"
			driverClassName = "oracle.jdbc.driver.OracleDriver"
			dialect= "org.hibernate.dialect.OracleDialect"

			properties {
				maxActive = -1
				minEvictableIdleTimeMillis=1800000
				timeBetweenEvictionRunsMillis=1800000
				numTestsPerEvictionRun=3
				testOnBorrow=true
				testWhileIdle=true
				testOnReturn=true
				validationQuery="SELECT 1 from dual"
//				validationQuery="SELECT 1"
			}
		}
	}
}
