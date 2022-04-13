package org.yesid.f1_crud;

import org.springframework.test.context.jdbc.Sql;

@Sql(scripts = "/test_data.sql")
@Sql(scripts = "/cleanup_data.sql",  executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
public class BaseTest {
}
