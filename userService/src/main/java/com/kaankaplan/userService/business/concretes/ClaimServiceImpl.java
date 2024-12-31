package com.kaankaplan.userService.business.concretes;

import com.kaankaplan.userService.business.abstracts.ClaimService;
import com.kaankaplan.userService.dao.ClaimDao;
import com.kaankaplan.userService.entity.Claim;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClaimServiceImpl implements ClaimService {

    private final ClaimDao claimDao;

    @Override
    public Claim getClaimByClaimName(String claimName) {
        //return new Claim("1","ADMIN");
        return claimDao.getClaimByClaimName(claimName);
    }

    @Override
    public void addClaim(Claim claim) {
        claimDao.save(claim);
    }
}
