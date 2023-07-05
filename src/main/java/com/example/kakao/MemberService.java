package com.example.kakao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<String> getMembers() {
        return memberRepository.findAll()
                .stream()
                .map(Member::getName)
                .collect(Collectors.toList());
    }
}