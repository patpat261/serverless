package com.kaankaplan.userService.controller;

import com.kaankaplan.userService.business.abstracts.ClaimService;
import com.kaankaplan.userService.entity.Claim;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user/claims")
@RequiredArgsConstructor
public class ClaimController {
    private final ClaimService claimService;

    @PostMapping("/add")
    public ResponseEntity<Claim> addClaim(@RequestBody Claim claim) {
        claimService.addClaim(claim);
        return ResponseEntity.status(HttpStatus.CREATED).body(claim);
    }
}