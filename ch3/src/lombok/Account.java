package lombok;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Account {
    private String name;
    private String accNo;
    private int balance;
}
