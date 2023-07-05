import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import com.hanssarang.backend.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

@RequriedArgsConstructor
@RestController
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping
	public ResponseEntity<List<String>> getMembers() {
		return ResponseEntity.ok(memberService.getMembers());
	}
}
