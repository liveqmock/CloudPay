package cn.koolcloud.test;

import cn.koolcloud.control.ISO8583Controller;
import cn.koolcloud.util.StringUtil;

public class ChongZhengTest {

	final static String str = "00 00 60 06 15 00 00 60 31 00 31 00 01 02 00 70 20 04 C0 21 C0 98 11 19 62 27 00 42 26 68 00 56 54 60 00 00 00 00 00 00 00 00 11 00 02 04 10 20 00 12 37 62 27 00 42 26 68 00 56 54 6D 41 12 52 07 30 10 20 00 00 01 08 36 46 30 32 31 31 30 30 30 38 20 20 20 20 20 20 20 20 36 46 31 31 31 31 30 30 30 38 20 20 20 20 20 20 20 20 36 46 30 38 31 31 30 30 32 30 32 30 31 33 30 38 32 37 31 39 31 35 30 37 33 31 36 31 30 30 36 46 31 30 31 31 30 30 31 38 32 30 31 33 30 38 32 37 31 39 31 32 33 36 36 34 38 32 36 46 31 33 31 31 30 30 30 34 39 31 35 30 31 30 30 30 30 30 37 32 39 39 39 32 39 30 30 35 34 39 39 30 30 30 31 31 35 36 3F 0E 11 53 68 BB 02 6C 26 00 00 00 00 00 00 00 00 19 22 60 00 01 00 05 00 00 09 90 36 35 41 38 37 36 30 45 ";

	// final static String str =
	// "000060000006156031003100010210703800810bd0881316620048901003269600000000000000033300003614024408300008999900003332343231343733323234303030010836463032313130303038202020202020202036463131313130303038202020202020202036463038313130303230323031333038333031343035333537373936303036463130313130303138323031333038333031343035333535303730364631333131303030343931353031303030303038323939393239303035343939303030312220202020202020202020202020202020202020202020313536260000000000000000192260000100050000099000034355503730454145444442";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] data = StringUtil.hexString2bytes(str);
		// OldTrans oldTrans = new OldTrans();
		// ChongZheng.chongzhengUnpack(data, oldTrans);
		// oldTrans.toString();

		ISO8583Controller iso = new ISO8583Controller("999290054990001",
				"10000072", 175, 600001);
		try {
			iso.chongZheng(data, "0830", "cheXiaoChongZheng");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// // iso.chongZheng(data, "0829","123123123","123123123");
		// String track2 = "6200489220154827=40075205351020000";
		// String track3 = "";
		// // String acount = "6222804222601042940";
		// byte [] pinBlock =
		// StringUtil.hexString2bytes("92 3C AD A9 46 F4 2D D2");
		// iso.cheXiao(data, track2, track3, pinBlock);

	}

}
