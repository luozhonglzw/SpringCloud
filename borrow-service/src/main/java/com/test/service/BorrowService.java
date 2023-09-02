package com.test.service;

import com.test.entity.BorrowDetail;
import com.test.entity.borrow;

public interface BorrowService {
    BorrowDetail getBorrowDetailByUid(int uid);
}
