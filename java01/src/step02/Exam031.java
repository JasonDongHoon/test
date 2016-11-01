// 주제: Literal - 논리값 표현
package step02;

public class Exam031 {
  public static void main(String[] args) {
    System.out.println(true);
    System.out.println(false);

    if (true)
      System.out.println("true이다.");

    if (10 > 20) // false
      System.out.println("10 > 20");
    else
      System.out.println("10 <= 20");

    /* 자바는 숫자를 자동으로 true/false 값으로 바꾸지 않는다. 컴파일 오류!
       => C/C++ 언어에서는 0은 false, 그 외의 수는 true로 자동 변환한다.
    if (0)
      System.out.println("오류!");
    */
  }
}

/* 문자 집합
# ASCII(7비트) - American Standard Code for Information Interchange
- 영어 대/소문자, 0 ~ 9(숫자), !/@/#/?...(특수문자), CR/LF/DEL...(제어 문자)
  등의 문자에 대해 7비트 2진 코드로 정의.
- 예)
  ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 ---- ---- ----
  => 한글은 정의되어 있지 않다.
# ISO/IEC 8859(8비트)
- ISO와 IEC의 공동 표준.
- ASCII(95자) + 로마문자 = 8비트 2진 코드로 정의.
- 문자 집합의 종류
  ISO/IEC 8859-1 : 대부분의 서유럽 언어를 지원하며, 가장 널리 사용됨.
  ISO/IEC 8859-2 : 중앙유럽과 동유럽 언어를 지원.
  ...
# ISO/IEC 2022
- 문자 하나에 1바이트나 2바이트 이상을 쓰는 가변 문자 인코딩 방식.
- EUC가 이 방식을 사용한다.
# EUC(16비트) - Extended Unix Code
- ISO/IEC 2022에 기반하여 한국어, 중국어, 일본어를 2바이트 코드로 정의.
- 문자집합
  EUC-KR : 한국어 문자에 대해 2진 코드 정의.
  EUC-CN : 중국어 문자에 대해 2진 코드 정의.
  EUC-JP : 일본어 문자에 대해 2진 코드 정의.
- EUC-KR
  => ISO/IEC 2022 호환성 때문에 94 * 94 문자 집합을 선택함.
  => 2350자 한글에 대해서만 코드 정의.
  => "똠,홥,뜽" 등의 글자에 대해 코드가 정의되어 있지 않음.
  => 즉 이 문자집합을 사용하면 똠, 홥, 뜽이라는 글자를 컴퓨터에 표현할 수 없다.
- 예)
  ABCabc가각간똘똠똥 ==> 41 42 43 61 62 63 b0a1 b0a2 b0a3 b6ca ---- b6cb
# 조합형(16bit)
- 2바이트를 사용하여 초성(5비트), 중성(5비트), 종성(5비트)의 조합으로
  한글의 코드를 정의한다.
- 최상위 비트를 1로 설정하여 한글 코드임을 지정한다.
- 두 번째 바이트의 최상위 비트가 0일 수 있기 때문에 문자열 검색에 문제가
  발생할 수 있다.
- 국제 표준이 아니다.
- 상용 조합형 코드 테이블
       0  1  3  4  5  6  7  8  9 10 11 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
초성 : -,  ,ㄱ,ㄲ,ㄴ,ㄷ,ㄸ,ㄹ,ㅁ,ㅂ,ㅃ,ㅅ,ㅆ,ㅇ,ㅈ,ㅉ,ㅊ,ㅋ,ㅌ,ㅍ,ㅎ
중성 : -, -,  ,ㅏ,ㅐ,ㅑ,ㅒ,ㅓ,--,--,ㅔ,ㅕ,ㅖ,ㅗ,ㅘ,ㅙ,--,--,ㅚ,ㅛ,ㅜ,ㅝ,ㅞ,ㅟ,--,--,ㅠ,ㅡ,ㅢ,ㅣ
종성 : -,  ,악,앆,앇,안,앉,않,앋,알,앍,앎,앏,앐,앑,앒,앓,암,--,압,앖,앗,았,앙,앚,앛,앜,앝,앞,앟
- 예) '위'
  한글 : 1
  초성(ㅇ): 01101
  중성(ㅟ): 10111
  종성(  ): 00001
  => 1_01101_10111_00001 = 1011_0110_1110_0001 = 0xB6E1
# CP949(16비트)
- 마이크로소프트에서 정의한 문자 집합.
- 윈도95부터 "확장 완성형" 또는 "통합형 한글 코드(Unified Hangul Code)"라는
  명칭으로 불림.
- 현대에 쓰이고 있는 대부분의 한글에 대해 코드를 정의함.
  EUC-KR + 추가한글 = 11172자
- 국제 표준 아니다.
- 예)
  ABCabc가각간똘똠똥 ==> 41 42 43 61 62 63 b0a1 b0a2 b0a3 b6ca 8c63 b6cb
  => '똠'은 CP949에서 추가한 문자라서 '똘'의 문자코드와 연속되지 않음.
  => 똘(b6ca), 똠(8c63), 똥(b6cb)
# Unicode(31bit) - ISO 10646(Universal Character Set)
- 전 세계의 모든 문자를 컴퓨터에서 일관되게 표현하고 다룰 수 있도록 설계된
  산업 표준.
  => 기존의 EUC-KR(한국어), EUC-JP(일본어), EUC-CN(중국어) 문자집합은
     동시에 사용할 수 없다.
  => 기존의 유럽어도 문자집합 간에 다른 코드 값으로 겹치는 부분이 있어서
     동시에 사용하는데 문제가 되었다.
- 현존하는 문자 인코딩 방법을 유니코드로 교체하는 것이 목적.
- 공식적으로 31비트 문자집합. 현재까지는 21비트로 모두 언어를 표현할 수 있다.
- 영어, 한글 모두 2바이트로 정의함.
  => 영어 : U+0041 ~
  => 한글 자모: U+1100 ~ U+11FF
  => 한글 소리 마디: U+AC00 ~ U+D7AF
- 한글은 새로운 코드로 정의함
  => EUC-KR과 호환이 안됨.
  => 새로 작성해야 함.
- 예)
  ABCabc가각간똘똠똥 ==> 0041 0042 0043 0061 0062 0063 AC00 AC01 AC04 ...
- 참고
# UTF-8(1 ~ 4바이트) - UCS Tranformation Format
- 유니코드 문자를 재정의 함.
- ASCII 문자는 그대로 ASCII 코드로 표현.
- UTF-8 인코딩 방식
  U+0000 ~ U+007F : 7 비트, 그대로 인코딩
  U+0080 ~ U+07FF : 11 비트, 110xxxxx 10xxxxxx
  U+0800 ~ U+FFFF : 16 비트, 1110xxxx 10xxxxxx 10xxxxxx
  U+10000 ~ U+1FFFFF : 21 비트, 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
  => 한글은 U+0800 ~ U+FFFF 범위 안에 있기 때문에 3바이트 코드로 정의되었다.
- 예)
  ABCabc각가간똘똠똥 ==> 41 42 43 61 62 63 EABO80 EAB081 EAB084 ...
  '가'
  => 0xAC00(16진수 UTF16; 유니코드)
  => 1010 1100 0000 0000(2진수 UTF-16; 유니코드)
  => 1110_1010 10_110000 10_000000(2진수 UTF-8)
  => 0xEAB080(16진수 UTF-8)
- 이점
  => 영어의 경우 ISO-8859-1과 완벽하게 호환된다.
  => 영어 문서는 UTF-8로 바꿔도 기존의 문서와 같다.
  => ISO-8859-1로 저장된 문서를 UTF-8로 바꿀 필요가 없다.
- 단점
  => 한글의 경우 3바이트로 저장되기 때문에 용량이 50% 증가하는 문제가 있다.
*/
