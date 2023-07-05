import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.hanssarang.backend.member.domain.Member;
import com.hanssarang.backend.member.domain.MemberRepository;

@RequiredArgsConstructor
@Service
public class MemberService {
	
	private final MemberRepository memberRepository;
	
	public List<String> getMembers() {
		return memberRepository.findAll()
			.stream()
			.map(Member::getName)
			.toList();
	}
}