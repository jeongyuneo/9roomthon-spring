package com.example.kakao;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/members")
public class MemberController {

	private final MemberService memberService;

	@GetMapping
	public ResponseEntity<List<String>> getMembers() {
		return ResponseEntity.ok(memberService.getMembers());
	}
}
